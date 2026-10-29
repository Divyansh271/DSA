//Left Rotate an Array by D Places

import java.util.Scanner;

public class problem_6 {
    public static void main(String[] args) {
        int [] nums = {43, 22, -2, 32, 101, 23, 12};
        Scanner mysc = new Scanner(System.in);
        int n = nums.length;
        int D =mysc. nextInt();
        D = D%n;
        for (int i : nums) {
            System.out.print(i+" ");
        }
        System.out.println("");
        //
        int [] temp = new int [D];
        for (int i = 0; i < D; i++) {
            temp[i] = nums[i];
        }
        for (int i = 0; i < nums.length-D; i++) {
            nums[i] = nums[D+i];
        }
        for (int i = 0; i < D; i++) {
            nums[n-D+i] = temp[i];
        }

        for (int i : nums) {
            System.out.print(i+" ");
        }

    }
}
