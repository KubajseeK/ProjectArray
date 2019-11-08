package sk.itsovy.kutka;

import sk.itsovy.kutka.school.Student;
import sk.itsovy.kutka.school.Teacher;

import java.util.Random;
import java.util.Scanner;

public class MyArray {

    public static void test1() {
        int[] arr = new int[7];
        for (int i = 0; i <= 6; i++) {
            arr[i] = i + 1;
        }
        for (int i = 0; i <= 6; i++) {
            System.out.println(arr[i]);
        }
    }

    public static void test2() {
        int[] arr2 = new int[10];
        Random rnd = new Random();
        for (int i = 0; i <= 9; i++) {
            int a = rnd.nextInt(90) + 10;
            arr2[i] = a;
        }
        for (int i = 0; i <= 9; i++) {
            System.out.print(arr2[i] + " ");
        }
        System.out.println();
        for (int j = 9; j >= 0; j--) {
            System.out.print(arr2[j] + " ");
        }
        System.out.println();
        for (int c = 0; c <= 9; c++) {
            if (arr2[c] % 2 == 0) {
                System.out.print(arr2[c] + " ");
            }
        }


    }

    public static void test3() {
        int[] arr3 = new int[12];
        Random rand = new Random();
        double sum = 0;
        int evenCount = 0;
        int unevenCount = 0;
        for (int i = 0; i <= 11; i++) {
            int a = rand.nextInt(12) + 1;
            arr3[i] = a;
            //Even, Uneven numbers count
            if (arr3[i] % 2 == 0) {
                evenCount++;
            }
            if (arr3[i] % 3 == 0) {
                unevenCount++;
            }
            sum = sum + arr3[i];
        }
        System.out.println("================================================");
        System.out.println("Even number count is: " + evenCount);
        System.out.println("-----------------------------------------------");
        System.out.println("Uneven number count is: " + unevenCount);
        System.out.println("=================================================");

        double average = sum / 12.0;
        System.out.println("Average of the generated numbers is: " + average);
        System.out.println("==================================================");

        //Min, max of generated numbers
        int min = arr3[0];
        int max = arr3[0];
        for (int i = 1; i < arr3.length; i++) {
            int a = rand.nextInt(20) + 10;
            arr3[i] = a;
            if (min > arr3[i]) {
                min = arr3[i];
            }
            if (max < arr3[i]) {
                max = arr3[i];
            }
        }
        System.out.println("The smallest number is: " + min);
        System.out.println("The biggest number is: " + max);
        System.out.println("=============================================");

    }

    public static void test4() {
        int[] arr4 = new int[20];
        arr4[0] = 1;
        arr4[1] = 1;

        for (int i = 2; i <= 19; i++) {
            arr4[i] = arr4[i - 1] + arr4[i - 2];
            System.out.println(arr4[i]);

        }
    }

    public static int[] minMax(int a, int b, int c) {
        int[] result = new int[2];
        //Biggest
        if (a > b && a > c) {
            result[0] = a;
        } else if (b > a && b > c) {
            result[0] = b;
        } else {
            result[0] = c;
        }

        //Smallest
        if (a < b && a < c) {
            result[1] = a;
        } else if (b < a && b < c) {
            result[1] = b;
        } else {
            result[1] = c;
        }
        return result;

    }

    /**
     * Výpis mocnín čísla 2
     */
    public static void test6() {
        int[] field1 = new int[10];
        int[] field2 = new int[10];
        for (int i = 0; i < 10; i++) {
            field1[i] = (int) Math.pow(2, i);
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(field1[i] + " ");
        }
        System.out.println();
        for (int i = 9; i >= 0; i--) {
            field2[9 - i] = field1[i];
        }
        for (int i = 0; i < 10; i++) {
            System.out.print(field2[i] + " ");

        }
    }

    public static void test7() {
        int[] b = {12, 38, 47, 5, 29, 16, 10, 112, 48, 65, 75, 9};
        int size = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 3 != 0) {
                size++;
            }
        }
        int[] b3n = new int[size];
        int j = 0;
        for (int i = 0; i < b.length; i++) {
            if (b[i] % 3 != 0) {
                b3n[j] = b[i];
                j++;
            }
        }
        for (int value : b3n) {
            System.out.println(value);
        }
        /**
         * Duplikovanie poľa 1
         */
        int c[] = new int[b.length];
        for (int i = 0; i < b.length; i++) {
            c[i] = b[i];

        }
        /**
         * Duplikovanie poľa 2
         */
        //int c[];
        //c = b.clone();
        //System.arraycopy(b, 0, c, 0, b.length);
    }

    public static void test8() {
        Random rn = new Random();
        int[] a = new int[20];

        for (int i = 0; i < a.length; i++) {
            int count = 0, temp;
            temp = rn.nextInt(50) + 1;
            for (int j = 0; j < i; j++) {
                if (temp == a[j]) {
                    count = 1;
                    break;
                }
            }
            if (count == 0) a[i] = temp;
            else i--;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }

    }

    public static void test9() {
        /**
         * Generovanie 5 objektov, meno generujem náhodné písmená, vek generujem.
         */
        Random rnd = new Random(); //(b-a+1) + a
        Student[] arr = new Student[5];
        for (int i = 0; i < 5; i++) {
            arr[i] = new Student("noname" + i, rnd.nextInt(68) + 10, "1N");
        }
        for (Student temp : arr) {
            System.out.println(temp.getName() + " " + temp.getAge());
        }
        //Neplnoletí
        System.out.println("***********************************************");
        for (Student temp2 : arr) {
            if (temp2.getAge() < 18) {
                System.out.println(temp2.getName() + " " + temp2.getAge());
            }
        }
        Teacher[] arr2 = new Teacher[8];
        for (int i = 0; i < 8; i++) {
            arr2[i] = new Teacher("Teacher" + i, rnd.nextInt(36) + 30, rnd.nextInt(501) + 500);
        }
        System.out.println("**********************************************");
        for (Teacher temp : arr2)
            if ((temp.getSalary() > 765) && (temp.getSalary() < 935))
                System.out.println(temp.getName() + " " + temp.getAge() + " " + temp.getSalary());
    }


    public static void test10() {
        String[] names = {"Ivan", "Peter", "Erik", "Zuzana", "Leo", "Viliam"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + " ");
        }
        System.out.println("********************************");
        for (int i = 0; i < names.length; i++) {
            if (names[i].contains("a") || names[i].contains("A")) {
                System.out.println(names[i] + " ");
            }
        }
        System.out.println("**************************************");
        int max = 0;
        int min = 0;
        for (int i = 0; i < names.length - 1; i++) {
            if (names[i].length() <= names[i + 1].length()) {
                max = names[i + 1].length();
            }
        }

        for (int i = 0; i < names.length - 1; i++) {
            if (names[i].length() >= names[i + 1].length()) {
                min = names[i + 1].length();
            }
        }
        System.out.println();

        for (int i = 0; i < names.length; i++) {
            if (names[i].length() == max) {
                System.out.print(names[i] + " ");
            }
        }
        System.out.println();

        for (int i = 0; i < names.length; i++) {
            if (names[i].length() == min) {
                System.out.print(names[i] + " ");
            }
            System.out.println();

        }
        //Vypis mien velkymi pismenami.
        System.out.println("************************");
        for (int i = 0; i < names.length; i++) {
            System.out.print(names[i].toUpperCase() + " ");

        }
    }

    public static void test11() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any word: ");
        String word = sc.nextLine();

        int length = word.length();
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(word.charAt(i));

        }
    }

    public static void test12() {
        int[] num = {17, 0, -2, 13, 68, 103, 21, 55, 1};
        int n = num.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (num[i] > num[j]) {
                    int temp = num[i];
                    num[i] = num[j];
                    num[j] = temp;
                }
            }
            System.out.println(num[i]);

        }
    }

    /**
     * Generovanie čísel od 1 po 80 v poli o rozmere 20 a ich zoradenie. od najm. po najv.
     */
    public static void test13() {
        Random rn = new Random();
        int[] a = new int[20];

        for (int i = 0; i < a.length; i++) {
            int count = 0, temp;
            temp = rn.nextInt(80) + 1;
            for (int j = 0; j < i; j++) {
                if (temp == a[j]) {
                    count = 1;
                    break;
                }
            }
            if (count == 0) a[i] = temp;
            else i--;
        }
        //for (int i = 0; i < a.length; i++) {
        //System.out.print(a[i] + " ");
        //}

        int n = a.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }

        }
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);

        }


    }

    public static void test14() {
        String[] arr = {"Monika", "Yeli", "Patrik", "Miro", "Maťo", "Vlado", "Damian", "Kubo", "Tomaš", "Tibor"};

        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].compareToIgnoreCase(arr[j]) > 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }

            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");

        }
        System.out.println();

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i].compareToIgnoreCase(arr[j]) < 0) {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void test15() {
        int[] bubble = {9, 13, 2, 4, 5, 8, 20};
        int n = bubble.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (bubble[j] > bubble[j + 1]) {
                    int temp = bubble[j];
                    bubble[j] = bubble[j + 1];
                    bubble[j + 1] = temp;
                }

            }
        }
        for (int i = 0; i < bubble.length; i++) {
            System.out.println(bubble[i]);
        }

    }

    public static String sumOfStrings(String str1, String str2) {
        if (str1.length() > str2.length()) {
            String t = str1;
            str1 = str2;
            str2 = t;
        }

        String str = "";

        int n1 = str1.length(), n2 = str2.length();

        str1 = new StringBuilder(str1).reverse().toString();
        str2 = new StringBuilder(str2).reverse().toString();

        int carry = 0;
        for (int i = 0; i < n1; i++) {
            int sum = ((int) (str1.charAt(i) - '0') +
                    (int) (str2.charAt(i) - '0') + carry);
            str += (char) (sum % 10 + '0');

            carry = sum / 10;
        }

        for (int i = n1; i < n2; i++) {
            int sum = ((int) (str2.charAt(i) - '0') + carry);
            str += (char) (sum % 10 + '0');
            carry = sum / 10;
        }

        if (carry > 0)
            str += (char) (carry + '0');

        str = new StringBuilder(str).reverse().toString();

        return str;
    }
}

