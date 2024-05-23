package HomeWork4.Work2;
/*Определить класс IntArray, который будет в себе содержать в качестве поля массив чисел.
Создать для такого класса конструкторы, в которые можно передавать количество элементов массива,
уже готовый массив. Создать конструктор без параметров, который будет создавать массив из 10 элементов.
Добавить в класс метод сортировки sort (любой на выбор), который в себя принимает в качестве параметра число,
если число положительное, то массив внутри объекта сортируется по возрастанию, если ноль или отрицательное,
то по убыванию. Добавить методы, с помощью которых можно будет работать с внутренним массивом без прямого
обращения к нему (геттеры, сеттеры и тд)*/

public class IntArray {
    private int[] arrayNumbers;

    IntArray(int initCapacity) {
        arrayNumbers = new int[initCapacity];
    }

    IntArray(int[] array) {
        arrayNumbers = array;
    }

    IntArray() {
        arrayNumbers = new int[10];
    }

    public int[] getArrayNumbers() {
        return arrayNumbers;
    }

    public void setArrayNumbers(int[] arrayNumbers) {
        this.arrayNumbers = arrayNumbers;
    }

    void sort(int n) {
        boolean flag = false;
        int value = 0;

        if (n > 0) {
            System.out.println("Сортирую массив по возростанию");
            while (!flag) {
                flag = true;
                for (int i = 0; i < arrayNumbers.length - 1; i++) {
                    if (arrayNumbers[i] > arrayNumbers[i + 1]) {
                        flag = false;
                        value = arrayNumbers[i];
                        arrayNumbers[i] = arrayNumbers[i + 1];
                        arrayNumbers[i + 1] = value;
                    }
                }
            }
        } else {
            System.out.println("Сортирую массив по убыванию");
            while (!flag) {
                flag = true;
                for (int i = 0; i < arrayNumbers.length - 1; i++) {
                    if (arrayNumbers[i] < arrayNumbers[i + 1]) {
                        flag = false;
                        value = arrayNumbers[i];
                        arrayNumbers[i] = arrayNumbers[i + 1];
                        arrayNumbers[i + 1] = value;
                    }
                }
            }
        }
    }

    void printArray() {
        for (int x : arrayNumbers) {
            System.out.print(x + " ");
        }
        System.out.println();
    }
}

