package MainTask;

//1.Приветствовать любого пользователя при
// вводе его имени через командную строку.

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.next();
        System.out.print("Greetings " + name);
    }
}
