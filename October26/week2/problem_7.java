import java.util.Scanner;
//Reverse an array

public class problem_7 {
    public static void revArray (int [] nums, int i){
        if(i < nums.length/2){
            int temp = nums[i];
            nums[i] = nums[nums.length-i-1];
            nums[nums.length-i-1] = temp;
            revArray(nums, i+1);
        }
    }
    public static void main(String[] args) {
        Scanner mysc = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = mysc.nextInt();
        int nums[] = new int[n];
        System.out.print("Enter array elements: ");
        for (int i = 0; i < n; i++) {
            nums[i] = mysc.nextInt();
        }
        revArray(nums, 0);
        for (int i = 0; i < n; i++) {
            System.out.print(nums[i] + " ");
        }
        
        mysc.close();
    }
}
