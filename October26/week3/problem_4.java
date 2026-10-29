//Remove Duplicates from Sorted Array
public class problem_4 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 3, 4, 4, 4, 5, 6, 6, 7};

        //2 pointer
        int i = 0, temp;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] > arr[i]){
                i++;
                arr[i] = arr[j];
            }
        }
        
        for (int k : arr) {
            System.out.print(k+" ");
        }
    }
}
