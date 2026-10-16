import java.util.Scanner;
//Print 1 to N using recursion
public class problem_3 {
    public static void print1ToN (int n){
        if(n > 1){
            print1ToN(n-1);
        }
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        int n = mysc.nextInt();
        print1ToN(n);
        mysc.close();
    }
    
}
