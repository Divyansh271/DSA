import java.util.Scanner;
//Factorial of N numbers
public class problem_6 {
    public static int fact (int n){
        if(n > 1){
            return n * fact(n-1);
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        int n = mysc.nextInt();
        System.out.println(fact(n));
        mysc.close();
    }
}
