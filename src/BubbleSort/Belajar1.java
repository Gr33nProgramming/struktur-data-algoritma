package BubbleSort;

import java.util.Random;
import java.util.Arrays;

public class Belajar1 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(100);
        }
        System.out.println(Arrays.toString(array));
        System.out.println(Arrays.toString(sorting(array)));
    }
    private static int[] sorting(int[] values){
        boolean isSorted = true;
        int temp;
        while(isSorted){
            isSorted = false;
            for (int i = 0; i < values.length - 1; i++) {
                if(values[i] > values[i + 1]){
                    isSorted = true;
                    temp = values[i];
                    values[i] = values[i + 1];
                    values[i + 1] = temp;
                }
            }
        }
        return values;
    }
}
