package OprionalTask;

import java.util.ArrayList;
import java.util.Scanner;

//5.Найти количество чисел, содержащих только четные цифры,
// а среди оставшихся — количество чисел с
// равным числом четных и нечетных цифр.

public class Quantity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] mas = new int[10];
        int even = 0;
        int odd = 0;
        int equalNumberOfEven = 0;
        int equalNumberOfOdd = 0;
        for (int i = 0; i < mas.length; i++) {
            mas[i] = sc.nextInt();
            ArrayList<Integer> mass = new ArrayList<>();
            while (mas[i] != 0) {
                mass.add(mas[i] % 10);
                mas[i] /= 10;
            }
            for (Integer integer : mass) {
                if (integer % 2 == 0) even++;
                else odd++;
            }
            if (even == mass.size()) equalNumberOfEven++;
            else if (even == odd) equalNumberOfOdd++;
            even = 0;
            odd = 0;
        }
        System.out.println("Digits consisting of even numbers only: " + equalNumberOfEven +
                "\nNumbers with an equal number of even and odd digits: " + equalNumberOfOdd
        );
    }
}
