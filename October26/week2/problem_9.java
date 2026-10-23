import java.util.Scanner;

public class problem_9 {
    public static int fib(int n) {
        if(n == 0){
            return 0;
        }
        if(n == 1){
            return 1;
        } 
        return fib(n-1) + fib(n-2);
    }
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        System.out.println("Enter number:");
        int n = mysc.nextInt();
        System.out.println(fib(n));
        mysc.close();
    }
}
