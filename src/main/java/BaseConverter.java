import java.util.Scanner;

/**
 * Задача 3 посложнее:
 * Напишите класс BaseConverter для конвертации из градусов по Цельсию в
 * Кельвины, Фаренгейты, и так далее. У метода должен быть метод convert, который
 * и делает конвертацию.
 * При запуске кода должна быть возможность ввести градусы Цельсия и выбора конвертации в Кельвины или Фаренгейты
 */

public class BaseConverter {

    private static class Convert {
        double getConvertedValue(double baseValue) {
            return 0;
        }
    }

    private static class CelsiusConvert extends Convert {
        @Override
        public double getConvertedValue(double baseValue) {
            return baseValue;
        }
    }

    private static class KelvinConvert extends Convert {

        @Override
        public double getConvertedValue(double baseValue) {
            return baseValue + 273.15;
        }
    }

    private static class FahrenheitConvert extends Convert {
        @Override
        public double getConvertedValue(double baseValue) {
            return 1.8 * baseValue + 32;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите температуру: "); // Задаём через консоль температуру в цельсиях
        double temperature = input.nextDouble();
        System.out.println("Выберите единицу измерения температуры в которую хотите конвертировать градусы ");
        System.out.println("Если вы хотите конвертировать в Кельвины - нажмите 1; ");
        System.out.println("Если вы хотите конвертировать в Фарангейты - нажмите 2; ");
        System.out.println("Если хотите оставить в Цельсиях - нажмите 3; ");
        double choice = input.nextDouble();
        if (choice == 1) {
            System.out.println("Температура в градусах Кельвина = " +
                    new KelvinConvert().getConvertedValue(temperature)); // Кельвины
        } else if (choice == 2) {
            System.out.println("Температура в градусах Фаренгейта = " +
                    new FahrenheitConvert().getConvertedValue(temperature)); // фаренгейты
        } else if (choice == 3) {
            System.out.println("Температура в градусах Цельсия = " +
                    new CelsiusConvert().getConvertedValue(temperature)); // цельсии
        } else {
            System.out.println("Попробуйте ещё раз");

        }

    }
}