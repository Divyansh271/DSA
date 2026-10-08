package October26.week1;
import java.util.Scanner;
//Reverse a Number - Given an integer n, print its digits in reverse order.
public class problem_2 {
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = mysc.nextInt();
        int rev = 0;

        while (num != 0){
            rev *= 10;
            rev += num%10;
            num /= 10;
        }

        System.out.println(rev);
        mysc.close();
    }
}
