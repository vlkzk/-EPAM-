package OprionalTask;

import java.util.Arrays;
import java.util.Scanner;

//2.Вывести числа в порядке возрастания (убывания) значений их длины.

public class Length {
    public static void main(String[] args) {
        int[] mas = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
        }
        Arrays.sort(mas);
        for (int ma : mas) {
            System.out.print(ma + " ");
        }
        System.out.println();
        for (int i = mas.length-1; i >= 0; i--) {
            System.out.print(mas[i]+" ");
        }
    }
}
