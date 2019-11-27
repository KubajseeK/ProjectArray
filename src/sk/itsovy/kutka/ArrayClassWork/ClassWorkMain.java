package sk.itsovy.kutka.ArrayClassWork;

public class ClassWorkMain {
    public static void main(String[] args) {
        int[] data ={2818, 7400, 146, 1870, 7668, 5307, 137, 473, 6359, 7633,
                2665, 5307, 1924, 49, 881, 3444, 1635, 4429, 1590, 5166, 2554, 7475,
                1286, 1913, 6145, 8329, 6460, 5965, 2278, 3609, 5979, 3877, 325,
                6847, 407, 4097, 5608, 6273, 3329, 4878, 7165, 879, 1533, 1055, 2014,
                3795, 5174, 5760, 1290, 8438, 5419, 5802, 1672, 6654, 2665, 3053,
                392, 1590, 3860, 849, 3986, 2519, 3568, 384, 6882, 4781, 1312,
                5919, 8319, 5378, 7095, 5823, 1778, 2791, 6989, 317, 2765, 7694,
                6039, 111, 1331, 6531, 2331, 3968, 6519, 6529, 6586, 6273, 4528,
                1554, 8415, 2971, 7810, 3645, 6826, 1254, 2600, 6385, 3329,
                7509, 2011, 4397, 5193, 1650, 7225, 7068, 3655};

        Work work = new Work();
        int dataSize = data.length;
        work.repeatingNumbers(data);
        System.out.println(work.averageOfNumbers(data));
        System.out.println(work.countOfUnevenNumbers(data));
        System.out.println(work.divideBy7(data));
        work.sort(data);
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");

        }
    }
}
