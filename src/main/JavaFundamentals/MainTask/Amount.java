package MainTask;

import java.util.Scanner;

//4.Ввести целые числа как аргументы командной строки,
// подсчитать их сумму (произведение) и вывести результат на консоль.

public class Amount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
            sum += mas[i];
        }
        System.out.println(sum);
    }
}

