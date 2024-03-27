package Semenar1;
import java.util.Scanner;
import java.time.LocalTime;

public class ZD1_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Запрос имени пользователя
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();

        // Получение текущего времени
        LocalTime currentTime = LocalTime.now();

        // Вывод приветствия в зависимости от текущего времени
        if (currentTime.isAfter(LocalTime.of(5, 0)) && currentTime.isBefore(LocalTime.of(11, 59))) {
            System.out.println("Доброе утро, " + name + "!");
        } else if (currentTime.isAfter(LocalTime.of(12, 0)) && currentTime.isBefore(LocalTime.of(17, 59))) {
            System.out.println("Добрый день, " + name + "!");
        } else if (currentTime.isAfter(LocalTime.of(18, 0)) && currentTime.isBefore(LocalTime.of(22, 59))) {
            System.out.println("Добрый вечер, " + name + "!");
        } else {
            System.out.println("Доброй ночи, " + name + "!");
        }
    }
}
