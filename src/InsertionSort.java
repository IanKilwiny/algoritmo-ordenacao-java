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

    public Integer[] insertionSortOtimizado(Integer[] nums) {
       
        for (int i = 1; i < nums.length; i++) {
            int alvo = nums[i];  //salva o 4
            int pos = buscaBinaria(nums, 0, i - 1, alvo);  //
            
            
            for (int j = i; j > pos; j--) {
                nums[j] = nums[j - 1];
            }
            
            nums[pos] = alvo;
        }
        
        return nums;
    }
    
    private int buscaBinaria(Integer[] nums, int inicio, int fim, int alvo) {
      
        while (inicio <= fim) {
           int meio = (inicio + fim) / 2;
            
            if (nums[meio] == alvo) {
                return meio;  
            } else if (nums[meio] > alvo) {
                fim = meio - 1;  
            } else {
                inicio = meio + 1;  
            }
        }
        
        return inicio;  
    }
}

