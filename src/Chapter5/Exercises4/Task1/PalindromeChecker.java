package Chapter5.Exercises4.Task1;

public class PalindromeChecker {

    public boolean isPalindrome(String str){
        String string = str.replaceAll("\\s", "").toLowerCase();
        String reversed = new StringBuilder(str).reverse().toString();
        return string.equals(reversed);
    }


}
