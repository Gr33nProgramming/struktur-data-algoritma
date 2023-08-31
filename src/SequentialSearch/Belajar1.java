package SequentialSearch;

import java.util.Scanner;
import java.util.Random;

public class Belajar1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = new int[5000];
        fillData(data);
        for (int i = 0; i < data.length; i++) {
            System.out.println((i + 1) + ". " + data[i] + " ");
        }
        System.out.print("Search\t: ");
        int search = scanner.nextInt();
        searching(data,search);
    }
    private static void searching (int[] values, int userSearch){
        int temp = 0;
        boolean isFound = false;
        for (int i = 0; i < values.length; i++) {
            if(values[i] == userSearch){
                isFound = true;
                temp = temp + i;
                break;
            }
        }
        if(isFound){
            System.out.println("Data " + userSearch + " is found on position " + (temp + 1));
        }else{
            System.err.println("Data " + userSearch + " not found");
        }
    }
    private static void fillData(int[] values){
        Random random = new Random();
        for (int i = 0; i < values.length; i++) {
            values[i] = random.nextInt(100);
        }
    }
}
