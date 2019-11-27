package sk.itsovy.kutka.Array2D;

import java.util.Random;

public class Main {
    private final static int numRows = 4;
    private final static int numCols = 4;

    public static void main(String[] args) {

        Random rnd = new Random();
        int[][] array;
        int r, c;
        array = new int[numRows][numCols];

        for (r = 0; r < array.length; r++) {
            for (c = 0; c < array[r].length; c++) {
                array[r][c] = rnd.nextInt(101) + 1;
                System.out.print(array[r][c] + " ");
            }
            System.out.println();
        }
        int max = array[0][0];
        for (r = 0; r < array.length; r++) {
            for (c = 0; c < array[r].length; c++) {
                if (max < array[r][c]) {
                    max = array[r][c];
                }
            }
        }
        System.out.println("Max Value : " + max);

        int maxColSum = 0;
        int column = 0;
        for (r = 0; r < numRows; r++) {
            maxColSum += array[r][0];

            int sum = 0;
            for (c = 1; c < numCols; c++) {
                sum = 0;
                for (r = 0; r < numRows; r++) {
                    sum += array[r][c];
                }
                if (sum > maxColSum) {
                    maxColSum = sum;
                    column = c;
                }

            }
            System.out.println("Max Column: " + column + " MaxColSum: " + maxColSum);
        }
        for (c = 0; c < numCols; c++) {
            for (r = 0; r < numRows; r++) {
                System.out.print(array[r][c] + " ");
            }
            System.out.println();

        }
        System.out.println("*********************************");
        System.out.println("*********************************");

        int[][] tictactoe = {{1, 0, 2}, {0, 1, 2}, {0, 2, 0}};
        {


        }
        int even = 0;
        int uneven = 0;
        for (r = 0; r < numRows; r++) {
            for (c = 0; c < numCols; c++) {
                System.out.print(array[r][c] + " ");
                if (array[r][c] % 2 == 0) {
                    even++;
                } else {
                    uneven++;
                }
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Even: " + even + " Uneven: " + uneven);

        int count = 0;
        for (r = 0; r <= numRows - 1; r++) {
            for (c = 0; c <= numCols - 1; c++) {
                if (r == 0 || r == array.length - 1 || c == 0 || c == array[r].length - 1) {
                    count += array[r][c];
                }
            }
        }
        System.out.println(count);
        System.out.println("*********************************");
        System.out.println("*********************************");

        int[][] arrA = new int[4][4];
        int[][] arrB = new int[4][4];

        for (r = 0; r < arrA.length; r++) {
            for (c = 0; c < arrA[r].length; c++) {
                arrA[r][c] = rnd.nextInt(5) + 1;
                System.out.print(arrA[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for (r = 0; r < arrB.length; r++) {
            for (c = 0; c < arrB[r].length; c++) {
                arrB[r][c] = rnd.nextInt(5) + 1;
                System.out.print(arrB[r][c] + " ");
            }
            System.out.println();
        }
        System.out.println();

        System.out.println("****");
        System.out.println();
        System.out.println("Sum of Arrays");

        //Sum of Arrays
        int[][] sumResult = new int[4][4];
        for (r = 0; r < sumResult.length; r++) {
            for (c = 0; c < sumResult[r].length; c++) {
                sumResult[r][c] = arrA[r][c] + arrB[r][c];
                System.out.print(sumResult[r][c] + " ");

            }
            System.out.println();

        }
        System.out.println("*****************************************");
        System.out.println("Multiplication");

        //Multiplication of Arrays
        int[][] result = new int[arrA.length][arrB[0].length];

        for (int rowA = 0; rowA < arrA.length; rowA++) {
            for (int columnB = 0; columnB < arrB[0].length; columnB++) {
                for (int ColumnA = 0; ColumnA < arrA[0].length; ColumnA++) {
                    result[rowA][columnB] += arrA[rowA][ColumnA] * arrB[ColumnA][columnB];

                }
                System.out.print(result[rowA][columnB] + " ");

            }
            System.out.println();

        }
        System.out.println(state("PAOSMFAOGINADFRATRAKPAOSMD"));
        System.out.println("******************************************");
        System.out.println("******************************************");

        Color c1 = Color.RED;
        Race r1 = Race.BLACK;
        Hair h1 = Hair.NONE;
        System.out.println(c1 + " " + r1 + " " + h1);
    }
    public static boolean state(String text) {
        int state = 0;
        int i = 0;
        while(state != 6) {
            if (i==text.length()) {
                break;
            }
            char z = text.charAt(i);
            i++;
            if (state == 0 && z == 'R')
                state = 1;
            else if (state == 1 && z == 'A')
                state = 2;
            else if (state == 2 && z == 'T')
                state = 3;
            else if (state == 3 && z == 'R')
                state = 4;
            else if (state == 4 && z == 'A')
                state = 5;
            else if (state == 5 && z == 'K') {
                state = 6;
                return true;
            }
            else {
                state = 0;
            }
        }
        return false;
    }

}

