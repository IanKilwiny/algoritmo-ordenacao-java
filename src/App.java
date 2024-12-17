import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        int tam = 10000;

        Integer[] nums = new Integer[tam];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(1000);
        }

        medindoBubbleSortSimples(nums); //  5 segundos
        // medindoBubbleSortOtimizado(nums); // 8 segundos 1 s

        // Integer nums[] = {9,8,7,6,5,4,3,2,1};
        // InsertionSort insertionSort = new InsertionSort();
        // System.out.println("Desordenado: "+Arrays.asList(nums));
        // System.out.println("Ordenado: "+Arrays.asList(insertionSort.insertionSortOtimizado(nums)));


    }

    public static void medindoBubbleSortSimples(Integer[] nums){
        // System.out.println("#######BUBBLE SORT SIMPLES############");
        BubbleSort bubbleSort = new BubbleSort();
        // System.out.println("Desordenado: "+Arrays.asList(nums));
        System.out.println("TEMPO INICIAL: "+LocalTime.now().format(DateTimeFormatter.ofPattern("mm:ss")));
        
        Integer[] ordenacao = bubbleSort.bubbleSortSimples(nums);

        System.out.println("TEMPO FINAL: "+LocalTime.now().format(DateTimeFormatter.ofPattern("mm:ss")));
        // System.out.println(Arrays.asList(ordenacao));

      
    }

    public static void medindoBubbleSortOtimizado(Integer[] nums) {
        BubbleSort bubbleSort = new BubbleSort();
        System.out.println("###########BUBBLE SORT OTIMIZADO##########");
        System.out.println("TEMPO INICIAL: "+LocalTime.now().format(DateTimeFormatter.ofPattern("mm:ss")));
        Integer[] ordenacao = bubbleSort.bubleSortOtimizado(nums);
        System.out.println("TEMPO FINAL: "+LocalTime.now().format(DateTimeFormatter.ofPattern("mm:ss")));
    }



    public static void medindoSelectionSortSimples(Integer [] nums) {
        SelectionSort selectionSort = new SelectionSort();

        System.out.println("Desordenado: "+Arrays.asList(nums));
        System.out.println("Tempo inicial: "+LocalTime.now().format(DateTimeFormatter.ofPattern("mm:ss")));
        
        Integer[] ordenacao = selectionSort.selectionSortSimples(nums);

        System.out.println("Tempo final: "+LocalTime.now().format(DateTimeFormatter.ofPattern("mm:ss")));
        System.out.println(Arrays.asList(ordenacao));
     
    }

}
