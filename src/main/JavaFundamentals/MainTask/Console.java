package MainTask;

//2.Отобразить в окне консоли аргументы
// командной строки в обратном порядке.

import java.util.Scanner;

public class Console {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mas = new int[10];
        System.out.print("Enter arguments: ");
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
        }
        System.out.print("Reverse arguments: ");
        for (int j = mas.length - 1; j >= 0; j--) {
            System.out.print(mas[j] + " ");
        }
    }
}