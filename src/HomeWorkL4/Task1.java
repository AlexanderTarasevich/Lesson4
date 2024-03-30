package HomeWorkL4;

import java.util.Scanner;

import static java.lang.Math.random;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = Math.random();
        }
        System.out.println("Элементы массива в прямом порядке: ");
        for (double value : array) {
            System.out.println(value + " ");
        }
        System.out.println("/////");
        System.out.println("Элементы массива в обратном порядке: ");
        for (int i = size - 1; i >= 0; i--) {
            System.out.println(array[i] + " ");

        }
    }
}
