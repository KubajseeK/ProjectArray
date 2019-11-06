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
        for (int i = 0; i < size; i++) {
            arr[i] += 1;
        }

    }

    @Override
    public void sort(boolean ascending) {
        if (ascending) {
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] > arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        } else {
            for (int i = 0; i < size - 1; i++) {
                for (int j = i + 1; j < size; j++) {
                    if (arr[i] < arr[j]) {
                        int temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }

        }

    }

    @Override
    public void addItem(int newValue) {
        int[] newArr = new int[arr.length + 1];
        System.arraycopy(arr, 0, newArr, 0, arr.length);
        arr = newArr;
        newArr[size] = newValue;
        System.out.println(newArr.length);
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " "); //Kontrola pridania.
        }
    }

    @Override
    public void addItem(int newValue, int position) {
        int[] newArr = new int[size + 1];
        //arr = newArr;
        //newArr[size] = newValue;
        System.out.println(newArr.length);
        for (int i = 0; i < size + 1; i++) {
            if(i < position) {
                newArr[i] = arr[i];
            } else if (i == position) {
                newArr[i] = newValue;
            } else {
                newArr[i] = arr[i-1];
            }
        }
        for (int i = 0; i < size + 1; i++) {
            System.out.print(newArr[i] + " ");

        }
    }

    @Override
    public int[] copy() {
        int[] arrCopy = arr.clone();
        return arrCopy;
    }

    @Override
    public int getItem(int position) {
        return arr[position];
    }

    @Override
    public String toString() {
        String text = "";
        for (int i = 0; i < size; i++) {
            text += arr[i] + " ";
        }
        return text;
    }

    public void error(String message) {
        System.out.println(message);
        System.exit(1);

    }

}
