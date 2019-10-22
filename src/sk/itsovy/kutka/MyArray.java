package sk.itsovy.kutka;

import java.util.Random;

public class MyArray {

    public static void test1() {
        int [] arr = new int [7];
        for (int i = 0; i <= 6; i++) {
            arr[i] = i+1;
        }
        for (int i = 0; i <= 6; i++) {
            System.out.println(arr [i]);
        }
    }
    public static void test2() {
        int [] arr2 = new int [10];
        Random rnd = new Random();
        for (int i = 0; i <= 9; i++) {
            int a = rnd.nextInt(90) + 10;
            arr2[i] = a;
        }
        for (int i = 0; i <= 9; i++) {
            System.out.print(arr2 [i] + " ");
        }
        System.out.println();
        for (int j = 9; j >= 0; j--) {
            System.out.print(arr2 [j] + " ");
        }
        System.out.println();
        for (int c = 0; c <= 9; c++) {
            if (arr2 [c] % 2 == 0) {
                System.out.print(arr2 [c] + " ");
            }
        }


    }

}
