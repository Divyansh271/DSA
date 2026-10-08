package October26.week1;
import java.util.Scanner;
//Count Digits - Given an integer n, count how many digits it contains.
public class problem_1 {
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = mysc.nextInt();
        int count = 0;
        while (num != 0){
            num /= 10;
            count ++;
        }
        System.out.println(count);
        mysc.close();
    }
}
