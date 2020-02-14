package OprionalTask;

import java.util.Scanner;

//1.Найти самое короткое и самое длинное число. Вывести найденные числа и их длину.

public class ShortLong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
        }
        int min = 10, max = 0;
        int minStr = 0;
        int maxStr = 0;
        for (int digi : mas) {
            System.out.print(digi + " ");
            if (digi < min) {
                min = digi;
                minStr = digi;
            }
            if (digi > max) {
                max = digi;
                maxStr = digi;
            }
        }
        String str = Integer.toString(min);
        String str1 = Integer.toString(max);
        System.out.print("\nMinimal number " + minStr + " comprises " + str.length()
                + " numbers\nMaximum number " + maxStr + " comprises " + str1.length()
                + " numbers");
    }
}
