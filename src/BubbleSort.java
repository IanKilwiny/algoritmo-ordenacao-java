public class BubbleSort {
    
    public Integer[] bubbleSortSimples(Integer nums[]){

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }

        return nums;
    }

    public Integer[] bubleSortOtimizado(Integer[] nums){
        boolean trocou = false;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] > nums[j]){
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                    trocou = true;
                }
                
            }

            //se não houver troca, está ordenado e é encerrado o código
            if (!trocou) {
                break;
            }

        }

        return nums;
    }

}
