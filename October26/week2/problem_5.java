import java.util.Scanner;
//Sum of first N numbers
public class problem_5 {
    public static int sum1ToN (int n){
        if(n > 0){
            return n + sum1ToN(n-1);
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        int n = mysc.nextInt();
        System.out.println(sum1ToN(n));
        mysc.close();
    }
}
