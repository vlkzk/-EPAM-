package MainTask;

//3.Вывести заданное количество случайных чисел
// с переходом и без перехода на новую строку.

import java.util.Random;

public class Transitions {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            System.out.print(" " + random(0, 100));
            System.out.println(" " + random(0, 100));
        }
    }

    private static Random generate = new Random(System.nanoTime());

    static int random(int start, int end) {
        return start + generate.nextInt(end - start);
    }
}
