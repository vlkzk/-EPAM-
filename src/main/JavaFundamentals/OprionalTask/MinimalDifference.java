package OprionalTask;

import java.util.Arrays;
import java.util.Scanner;

//4.Найти число, в котором количество различных цифр минимально. Если таких чисел несколько, найти первое из них.

public class MinimalDifference {
    public static void main(String[] args) {
        int[] n = new int[10];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < n.length; i++) {
            n[i] = sc.nextInt();
        }
        String str, tmp = "";
        int counter = 0, tmpNumber;
        System.out.println("Array: " + Arrays.toString(n)
                .replace("[", "")
                .replace("]", "")
        );
        for (Integer integer : n) {
            str = integer.toString();
            for (int j = 0; j < str.length() - 1; j++) {
                tmpNumber = 0;
                for (int k = j; k < str.length(); k++) {
                    if (str.charAt(j) == str.charAt(k)) {
                        tmpNumber++;
                    }
                    if (tmpNumber > counter) {
                        counter = tmpNumber;
                        tmp = str;
                    }
                }
            }

        }
        System.out.println(tmp);
    }
}
