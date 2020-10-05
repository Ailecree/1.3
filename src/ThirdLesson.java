package Lesson3;

import java.util.Random;
import java.util.Scanner;

public class ThirdLesson {
    static Random random = new Random();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        GameRandomNumber();
    }
    static void GameRandomNumber() {
        do {
            int randomNum = random.nextInt(10);
            System.out.println("Угдайте число от 0 до 9, у вас три попытки");
            for (int i = 3; i > 0; i--) {
                System.out.println("Ваш ответ");
                int userNum = sc.nextInt();
                if (userNum == randomNum) {
                    System.out.println("Вы угадали число");
                    break;
                }
                System.out.println("Загаданное число " + ((randomNum > userNum) ? "больше" : "меньше"));
                System.out.println((i-1) > 0 ? " у вас осталось " + (i-1) + " попыток." : "Попытки закончились, вы проиграли.");

            }
            System.out.println("Ответ:" +randomNum);
            System.out.println("Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет)");
        }
        while (sc.nextInt() == 1);
    }
}