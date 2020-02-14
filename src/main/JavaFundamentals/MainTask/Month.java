package MainTask;

//5.Ввести число от 1 до 12. Вывести на консоль название месяца,
// соответствующего данному числу.
// Осуществить проверку корректности ввода чисел.

import java.util.Scanner;

public class Month {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int month = scanner.nextInt();
        step(month);
    }

    private static void step(int month) {
        switch (month) {
            case 1: System.out.println("январь"); break;
            case 2: System.out.println("февраль"); break;
            case 3: System.out.println("март"); break;
            case 4: System.out.println("апрель"); break;
            case 5: System.out.println("май"); break;
            case 6: System.out.println("июнь"); break;
            case 7: System.out.println("июль"); break;
            case 8: System.out.println("август"); break;
            case 9: System.out.println("сентябрь"); break;
            case 10: System.out.println("октябрь"); break;
            case 11: System.out.println("ноябрь"); break;
            case 12: System.out.println("декабрь"); break;
            default: System.out.println("нет такого месяца");
        }
    }
}
