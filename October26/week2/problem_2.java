import java.util.Scanner;
//Print name N times using recursion
public class problem_2 {
    public static void printName (int n){
        System.out.println("Divyansh Tyagi");
        if(n > 1){
            printName(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        int n = mysc.nextInt();
        printName(n);
        mysc.close();
    }
}
