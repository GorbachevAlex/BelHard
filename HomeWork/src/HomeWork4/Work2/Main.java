package HomeWork4.Work2;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 3, 2, 15, 7, 0, - 12, 14, 7};
        IntArray intArray = new IntArray(array);
        intArray.printArray();
        intArray.sort(-1);
        intArray.printArray();
        intArray.sort(1);
        intArray.printArray();
    }
}
