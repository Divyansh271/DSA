//Left Rotate an Array by One Place
public class problem_5 {
    public static void main(String[] args) {
        int [] nums = {43, 22, -2, 32, 101, 23, 12};
        int temp = nums[0];
        for (int i : nums) {
            System.out.print(i+" ");
        }
        System.out.println("");
        for (int i = 1; i < nums.length; i++) {
            nums[i-1] = nums[i];
        }
        nums[nums.length-1] = temp;
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
}
