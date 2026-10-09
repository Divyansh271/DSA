package October26.week1;
import java.util.Scanner;

//Armstrong Number - Check whether a number is an Armstrong number

public class problem_5 {
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = mysc.nextInt();
        int check = num, sum = 0;
        int digits = String.valueOf(num).length(); 
        while(num != 0){
            sum+=(Math.pow(num%10, digits));
            num /= 10;
        }
        System.out.println(check == sum);
        mysc.close();
    }
}