import java.util.Scanner;
//Understand recursion by printing something
public class problem_1 {
    public static void printSth (int n){
        System.out.println(n);
        if(n > 0){
            printSth(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        int n = mysc.nextInt();
        printSth(n);
        mysc.close();
    }
}
