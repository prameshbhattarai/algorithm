package algorithms;

/**
 * Created by pramesh on 3/8/2018.
 */
public class Palindrome {

    private boolean isPalindrome(String str) {
        int lowIndex = 0, highIndex = str.length() - 1, midIndex = Math.round((lowIndex + highIndex)/2);
        boolean isLengthEven = (str.length()%2 == 0);
        while(isLengthEven ? (lowIndex <= highIndex) : (lowIndex <= highIndex && (lowIndex != midIndex))) {
            System.out.println("debugger >>> isLengthEven " + isLengthEven + " lowIndex " + lowIndex + " highIndex " + highIndex + " midIndex " + midIndex);
            if(str.charAt(lowIndex) != str.charAt(highIndex)) {
                return false;
            }
            lowIndex++;
            highIndex--;
        }
        return true;
    }

    public static void main(String... args) {
        Palindrome obj = new Palindrome();
        if(obj.isPalindrome("abcdfdcba")) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }


    }
}
