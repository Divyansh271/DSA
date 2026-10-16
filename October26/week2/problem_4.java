import java.util.Scanner;
//Print N to 1 using recursion
public class problem_4 {
    public static void printNTo1 (int n){
        System.out.println(n);
        if(n > 1){
            printNTo1(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        int n = mysc.nextInt();
        printNTo1(n);
        mysc.close();
    }
}
