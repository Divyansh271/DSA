//Largest Element in an Array
public class problem_1 {
    public static void main(String[] args) {
        int [] nums = {43, 22, -2, 32, 101, 23, 12};
        int max = nums[0];
        //finding max
        for (int i : nums) {
            if (i > max){
                max = i;
            }
        }
        System.err.println(max);
    }
}