public class SelectionSort {
    
    public Integer[] selectionSortSimples(Integer[] nums){

        for (int i = 0; i < nums.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIndex]){
                    minIndex = j ;
                }
            }


            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;

        }

        return nums;
    }

    public Integer[] selectionBiderecional(Integer[] nums){
        int tam = nums.length;
        int left  = 0;
        int right = tam - 1;

        while (left < right) {
            int minIndex = left, maxIndex = left; //inicializa os elementos com maior e menor indice

            for (int i = left; i <= right; i++) {
                if (nums[i] < nums[minIndex]){
                    minIndex = i;
                }else if(nums[i] > nums[maxIndex]){
                    maxIndex = i;
                }
            }

            //trocar o menor elemento com o elemento na posição left

            if(minIndex != left){
                int temp = nums[left];
                nums[left] = nums[minIndex];
                nums[minIndex] = temp;
            }

            if (maxIndex == left){
                maxIndex = minIndex;
            }

            if (maxIndex != right) {
                int temp = nums[right];
                nums[right] = nums[maxIndex];
                nums[maxIndex] = temp;
            }

            left++;
            right--;

        }
        return nums;
    }
}
