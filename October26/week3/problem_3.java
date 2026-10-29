//Check if the Array Is Sorted
public class problem_3 {
    public static boolean checkSorted(int [] nums){
        int n = nums.length;
        boolean check = true;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i-1] > nums[i]){
                check = false;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        int [] nums1 = {43, 22, -2, 32, 101, 23, 12};
        int [] nums2 = {-2, 12, 22, 23, 32, 43, 101};
        
        System.out.println(checkSorted(nums1));
        System.out.println(checkSorted(nums2));
    }
}
