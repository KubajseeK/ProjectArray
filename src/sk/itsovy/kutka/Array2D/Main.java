package sk.itsovy.kutka.Array2D;

import java.util.Random;

public class Main {
    private final static int numRows = 4;
    private final static int numCols = 4;
    public static void main(String[] args) {

        Random rnd = new Random();
        int[][] array;
        int r,c;
        array = new int[numRows][numCols];

        for (r = 0; r < array.length; r++) {
            for (c = 0; c < array[r].length; c++) {
                array[r][c] = rnd.nextInt(101) + 1;
                System.out.print(array[r][c] + " ");
            }
            System.out.println();
        }
        int max = array[0][0];
        for (r = 0;  r < array.length; r++) {
            for (c = 0; c < array[r].length; c++) {
                if (max < array[r][c]) {
                    max = array[r][c];
                }
            }
        }
        System.out.println("Max Value : " +max);

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
                if (sum>maxColSum) {
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

        int[][] tictactoe = {{1,0,2}, {0,1,2}, {0,2,0}};

    }
}
