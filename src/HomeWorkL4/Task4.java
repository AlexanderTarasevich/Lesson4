package HomeWorkL4;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.println("Введите элемент массива: ");
            array[i] = scanner.nextInt();
        }
        int zeroElement = 0;
        for (int i = 0; i < size; i++) {
            if (array[i] == 0) {
                zeroElement++;
            }
        }
        if (zeroElement > 0) {
            System.out.println("Кол-во нулевых элементов: " + zeroElement);
        }else {
            System.out.println("Нулевых элементов нет.");
        }
    }
}
