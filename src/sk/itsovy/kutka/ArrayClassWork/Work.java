package sk.itsovy.kutka.ArrayClassWork;

public class Work implements Methods {

    int[] data = {2818, 7400, 146, 1870, 7668, 5307, 137, 473, 6359, 7633,
            2665, 5307, 1924, 49, 881, 3444, 1635, 4429, 1590, 5166, 2554, 7475,
            1286, 1913, 6145, 8329, 6460, 5965, 2278, 3609, 5979, 3877, 325,
            6847, 407, 4097, 5608, 6273, 3329, 4878, 7165, 879, 1533, 1055, 2014,
            3795, 5174, 5760, 1290, 8438, 5419, 5802, 1672, 6654, 2665, 3053,
            392, 1590, 3860, 849, 3986, 2519, 3568, 384, 6882, 4781, 1312,
            5919, 8319, 5378, 7095, 5823, 1778, 2791, 6989, 317, 2765, 7694,
            6039, 111, 1331, 6531, 2331, 3968, 6519, 6529, 6586, 6273, 4528,
            1554, 8415, 2971, 7810, 3645, 6826, 1254, 2600, 6385, 3329,
            7509, 2011, 4397, 5193, 1650, 7225, 7068, 3655};

    @Override
    public void sort(int data[]) {
        int n = data.length;

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                if (data[j] > data[j + 1]) {
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }

            }
        }
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");

        }

    }

    @Override
    public double averageOfNumbers(int[] data) {
        int sum = 0;
        for (int i = 0; i < data.length; i++) {
            sum += data[i];
        }
        double average = sum / (double) data.length;
        return average;
    }

    @Override
    public int countOfUnevenNumbers(int[] data) {
        int unevenNumbers = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 2 == 1) {
                unevenNumbers++;
            }
        }
        return unevenNumbers;

    }

    @Override
    public int divideBy7(int[] data) {
        int divisionBy7 = 0;
        for (int i = 0; i < data.length; i++) {
            if (data[i] % 7 == 0) {
                divisionBy7++;
            }

        }
        return divisionBy7;

    }

    @Override
    public void repeatingNumbers(int[] data) {
        {
            int count = 0;
            for (int j = 0; j < data.length; j++) {
                for (int k = j + 1; k < data.length; k++) {
                    if (data[j] == data[k]) {
                        count++;
                    }
                }
                if (count == 1)
                    System.out.print(data[j] + " ");
                count = 0;
            }
            System.out.println();
        }

    }
}
