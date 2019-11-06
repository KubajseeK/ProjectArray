package sk.itsovy.kutka.project;

import java.util.Arrays;
import java.util.Random;

/**
 * @author Jakub Kutka
 */
public class MyArray implements ArrayMethods {

    private int[] arr;
    private int size;

    public MyArray(int size) {
        this.size = size;
        arr = new int[size];

        resetArrayToZero();
    }

    private void resetArrayToZero() {
        for (int i = 0; i < size; i++) {
            arr[i] = 0;
        }
    }

    public MyArray(int[] input) {
        if (input == null || input.length == 0) {
            this.size = input.length;
            this.arr = input;
        } else {
            error("Incorrect input value");
        }

    }

    @Override
    public double getAverageValue() {
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += arr[i];
        }
        double average = sum / (double) size;
        return average;
    }

    @Override
    public int min() {
        int min = arr[0];
        for (int i = 0; i < size; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        return min;
    }


    @Override
    public int max() {
        int max = arr[0];
        for (int i = 0; i < size; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

    @Override
    public int min2() {
        return 0;
    }

    @Override
    public int max2() {
        return 0;
    }

    @Override
    public void generateValues(int a, int b) {
        Random rn = new Random();
        for (int i = 0; i < size; i++) {
            arr[i] = rn.nextInt(b - a + 1) + a;

        }

    }

    @Override
    public boolean contains(int value) {
        for (int i = 0; i < size; i++) {
            if (arr[i] == value)
                return true;
        }
        return false;
    }

    @Override
    public int countOfValues(int value) {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] == value) {
                count++;
            }
        }
        return count;
    }

    @Override
    public int countOfEvenValues() {
        int count = 0;
        for (int i = 0; i < size; i++) {
            if(arr[i] % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    @Override
    public void incrementValues() {

    }

    @Override
    public void sort(boolean ascending) {

    }

    @Override
    public void addItem(int newValue) {
        int[] newArr = new int[arr.length + newValue];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
        System.out.println(newArr.length);
    }

    @Override
    public void addItem(int newValue, int position) {

    }

    @Override
    public int[] copy() {
        return new int[0];
    }

    @Override
    public int getItem(int position) {
        return 0;
    }

    @Override
    public String toString() {
        return "MyArray{" +
                "arr=" + Arrays.toString(arr) +
                ", size=" + size +
                '}';
    }

    public void error(String message) {
        System.out.println(message);
        System.exit(1);

    }

}
