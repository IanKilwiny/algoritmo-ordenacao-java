import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        int tam = 20;

        Integer[] nums = new Integer[tam];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(1000);
        }
        // BubbleSort bubbleSort = new BubbleSort();   

        // System.out.println("Desordenados: "+Arrays.asList(nums));
        // System.out.println("Ordenados: "+Arrays.asList(bubbleSort.bubbleSortSimples(nums)));

        // Integer[] n = {5,4,3,2,1};

        // System.out.println("Ordenação Otimizada: "+Arrays.asList(bubbleSort.bubleSortOtimizado(n)));

        // SelectionSort selectionSort = new SelectionSort();
        // System.out.println("Desordenado: "+Arrays.asList(nums));
        // System.out.println("Ordenado: "+Arrays.asList(selectionSort.selectionSortSimples(nums)));

        InsertionSort insertionSort = new InsertionSort();
        System.out.println("Desordenado: "+Arrays.asList(nums));
        System.out.println("Ordenado: "+Arrays.asList(insertionSort.insertionSortSimples(nums)));



    }

}
