package October26.week1;
import java.util.Scanner;
//Check for Prime - Check whether a given number is prime.

public class problem_7 {
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = mysc.nextInt(), count = 0;
        for (int i = 1; i <= Math.sqrt(num); i++) {
            if(num%i == 0){
            count += 2;
            }
        }
        if(count == 2){
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }
        mysc.close();
    }
}
