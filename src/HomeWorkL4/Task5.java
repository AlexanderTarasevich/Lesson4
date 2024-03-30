package HomeWorkL4;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите элемент массива: ");
            array[i] = scanner.nextInt();
        }
        int lastIndex = array.length - 1;
        for (int i = 0; i < array.length / 2; i++) {
            int y = array[lastIndex - i];
            array[lastIndex - i] = array[i];
            array[i] = y;

        }
    }
}
