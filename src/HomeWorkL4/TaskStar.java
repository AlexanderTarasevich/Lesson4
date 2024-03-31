package HomeWorkL4;

import java.util.Arrays;
import java.util.Scanner;


public class TaskStar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива: ");
        int size = scanner.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.print("Введите элемент " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }


        int carry = 1;
        for (int i = size - 1; i >= 0; i--) {
            int sum = array[i] + carry;
            array[i] = sum % 10;
            carry = sum / 10;
        }

        if (carry > 0) {
            int[] result = new int[size + 1];
            result[0] = carry;
            System.arraycopy(array, 0, result, 1, size);
            array = result;
        }

        System.out.print("Исправленный массив: ");
        for (int num : array) {
            System.out.print(num + " ");
        }

    }
}
