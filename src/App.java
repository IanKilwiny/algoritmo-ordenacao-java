import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
public class App {
    public static void main(String[] args) throws Exception {
        Random rand = new Random();
        int tam = 100000;

        Integer[] nums = new Integer[tam];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = rand.nextInt(1000);
        }

        medindoBubbleSortSimples(nums);


    }

    public static void medindoBubbleSortSimples(Integer[] nums){
        System.out.println("#######BUBBLE SORT SIMPLES############");
        BubbleSort bubbleSort = new BubbleSort();
        // System.out.println("Desordenado: "+Arrays.asList(nums));
        System.out.println("TEMPO INICIAL: "+LocalTime.now().format(DateTimeFormatter.ofPattern("mm:ss")));
        
        Integer[] ordenacao = bubbleSort.bubbleSortSimples(nums);

        System.out.println("TEMPO FINAL: "+LocalTime.now().format(DateTimeFormatter.ofPattern("mm:ss")));
        // System.out.println(Arrays.asList(ordenacao));

        System.out.println("###########BUBBLE SORT OTIMIZADO##########");
        System.out.println("TEMPO INICIAL: "+LocalTime.now().format(DateTimeFormatter.ofPattern("mm:ss")));
        ordenacao = bubbleSort.bubleSortOtimizado(nums);
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
