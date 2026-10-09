package October26.week1;

import java.util.Scanner;

//Print All Divisors - Given n, print all positive divisors of n.

public class problem_6 {
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = mysc.nextInt();
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if(num%i == 0){
            System.out.print(i+" "+num/i+" ");
            }
        }
        mysc.close();
    }
}
