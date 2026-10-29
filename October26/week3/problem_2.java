//Second Largest Element in an Array
public class problem_2 {
    public static void main(String[] args) {
        int [] nums = {43, 22, -2, 32, 101, 23, 12};
        int max = Integer.MIN_VALUE;
        int secMax = Integer.MIN_VALUE;
        for (int i : nums) {
            if (i > max){
                secMax = max;
                max = i;
            }
            else if (i > secMax && i < max){
                secMax = i;
            }
        }
        System.out.println(secMax);
    }
}
