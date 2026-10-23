import java.util.Scanner;
//Check if a string is palindrome

public class problem_8 {
    private static boolean checkPalindrome(String s, int left, int right) {
        if (left >= right) {
            return true;
        }
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        return checkPalindrome(s, left + 1, right - 1);
    }

    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        System.out.print("Enter string: ");
        String n = mysc.nextLine();
        System.out.println(checkPalindrome(n, 0, n.length() - 1));
        
        mysc.close();
    }
}

