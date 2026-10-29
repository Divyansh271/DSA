//Move Zeroes to the End
public class problem_7 {
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12, 0, 5, 0, 7, 8, 0, 2};
        int i = 0, temp;
        for (int k : nums) {
            System.out.print(k+" ");
        }
        System.out.println("");
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == 0) {
                if (nums[i] != 0) {
                    i = j;
                }
            } else if (nums[i] == 0) {
                temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
                i++;
            }
        }
        for (int k : nums) {
            System.out.print(k+" ");
        }

    }
}
