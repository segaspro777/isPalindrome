
public class isPalindrome {
    public static void main(String args[]) {
        String string = args[0];
        Boolean flag = false;
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) == string.charAt(string.length() - 1 - i)) {
                flag = true;
            } else {
                flag = false;
            }
        }
        System.out.println(string + " is " + (flag == true ? "" : "not ") + "palindrome...");
    }
}