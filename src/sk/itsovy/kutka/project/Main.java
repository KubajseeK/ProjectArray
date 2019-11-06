package sk.itsovy.kutka.project;

public class Main {
    public static void main(String[] args) {
        MyArray arrayObject = new MyArray(10);
        arrayObject.generateValues(1, 50);
        arrayObject.addItem(43, 3);

    }
}
