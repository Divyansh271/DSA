package October26.week1;

import java.util.Scanner;

//Check Palindrome - Check whether a number reads the same from left to right and right to left.
public class problem_3 {
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = mysc.nextInt();
        int check = num;

        //method1
        int rev = 0;

        while (num != 0){
            rev *= 10;
            rev += num%10;
            num /= 10;
        }

        if (check == rev){
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        mysc.close();

    }
}
