/**
 * Задача 1 - легкая:
 * Сформировать и заполнить массив случайным числами и вывести максимальное, минимальное и среднее значение.
 * Для генерации случайного числа использовать метод Math.random(), который возвращает значение в промежутке [0, 1].
 */

public class TaskOne {

    public static void main(String[] args) {

        int n = 10;
        double[] array = new double[n]; // используем double потому что значения дробные между 0 и 1
        for (int i = 0; i < array.length; i++) {
            array[i] = Math.random();
        }

        double max = array[0];
        double min = array[0];
        double average = 0;
        for (int i = 0; i < array.length; i++) {
            if (max < array[i])
                max = array[i];
            if (min > array[i])
                min = array[i];
            average += array[i] / array.length;
        }

        System.out.println("Вывожу значение max = " + max);
        System.out.println("Вывожу значение min = " + min);
        System.out.println("Вывожу значение average = " + average);
    }
}
