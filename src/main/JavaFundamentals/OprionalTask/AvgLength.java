package OprionalTask;

//3.Вывести на консоль те числа, длина которых меньше (больше) средней длины по всем числам, а также длину.

import java.util.Scanner;

public class AvgLength {
    public static void main(String[] args) {
        double avg = 0;
        double tmp = 0;
        Scanner sc = new Scanner(System.in);
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
        }
        for (int ma : mas) {
            tmp += ma;
            avg = tmp / mas.length;
        }
        System.out.println("Average: " + avg);
        for (int ma : mas) {
            if (ma > avg) {
                System.out.println("More than average: " + ma);
            }
            if (ma < avg) {
                System.out.println("Less than average: " + ma);
            }
        }
    }
}
