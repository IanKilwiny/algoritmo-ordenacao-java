public class InsertionSort {
    
    public Integer[] insertionSortSimples(Integer[] nums){
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i - 1;

        
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j = j - 1;
            }

            nums[j + 1] = key; 
        }
        return nums;
    }
}

/*aux = 2
 * 3 2 1
 * 3 3 1
 * 2 3 1
 * aux = 1
 * 2 3 3
 * 2 2 3
 * 1 2 3
 */
