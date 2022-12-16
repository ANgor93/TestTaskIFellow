import java.util.Scanner;

/**
 * Задача 4 посложнее:
 * Напишите метод, который будет вычислять угол между часовой и минутной стрелками часов. На вход функции подаётся время в виде двух переменных: "hours" и "minutes".
 * Расчет угла производить относительно реального поведения стрелок часов.
 */

public class TaskFour {
    /**
     * Функция для вычисления угла между часовой и минутной стрелками
     */
    public static double findAngle(double hours, double minutes) {

        hours = hours % 12; // обработка 24-часовой записи

        double h = (hours * 360) / 12 + (minutes * 360) / (12 * 60); // найти положение часовой стрелки

        double m = (minutes * 360) / (60);    // найти положение минутной стрелки

        double angle = Math.abs(h - m); // вычисляем разницу углов

        if (angle > 180) {             // считаем меньший угол и возвращаем его
            angle = 360 - angle;
        }
        return angle;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите часы для рассчёта угла: "); // Задаём через консоль время
        int hours = input.nextInt();
        System.out.println("Введите минуты для рассчёта угла: ");
        int minutes = input.nextInt();

        System.out.println("Угол между часовой и минутной стрелкой равен: " + findAngle(hours, minutes));

    }
}
