package October26.week1;
import java.util.*;

public class problem_4 {
    public static int GCD_1(int n1, int n2) {
        //brute force
        int lar = Math.max(n1, n2);
        int sm = n1 + n2 - lar;

        for (int i = 1; i <= sm/2; i++){
            if(sm%i == 0){
                if(lar%(sm/i) == 0){
                    return sm/i;
                }
            }
        }
        return 1;
    }
    public static int GCD_2 (int n1, int n2){
        //Euclidean algo -> O(log(min(n1,n2)))
        int lar = Math.max(n1, n2);
        int sm = n1 + n2 - lar;
        int temp;
        while (sm != 0){
            temp = sm;
            sm = lar % sm;
            lar = temp;
        }
        return lar;
    }

    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        System.out.println("Enter the two nums:");
        int n1 = mysc.nextInt();
        int n2 = mysc.nextInt();
        System.out.printf("GCD 1: %d\nGCD 2: %d",GCD_1(n1, n2),GCD_2(n1, n2));
        mysc.close();
    }
}
