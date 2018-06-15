package algorithms;

public class ReverseString {

    public static String reverse(String str) {
        int lastIndex = str.length()-1;
        String reverse = "";
        if(lastIndex < 0) return "invalid string";
        while(lastIndex != -1) {
            reverse = reverse.concat(Character.toString(str.charAt(lastIndex)));
            --lastIndex;
        }
        return reverse;
    }

    public static String recursiveReverse(String str, String reverse) {
        int lastIndex = str.length()-1;
        if(lastIndex == -1) return reverse;
        reverse = reverse.concat(Character.toString(str.charAt(lastIndex)));
        return recursiveReverse(str.substring(0, lastIndex), reverse);
    }

    public static void main(String... args) {
        System.out.println(ReverseString.reverse("reverse this text"));
        System.out.println(ReverseString.recursiveReverse("reverse this text", ""));
    }
}
