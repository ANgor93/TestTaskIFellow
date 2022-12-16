/**
 * Задача 2 средняя:
 * Написать программу, которая должна найти и вывести повторяющийся символ в слове «Hello»
 */

public class TaskTwo {

    public static void main(String[] args) {

        String rc = new String("Hello"); //rc - repeating character

        int counter = 0;

        char[] charsArray = rc.toCharArray();
        for (int i = 0; i < rc.length(); i++) {

            for (int x = i + 1; x < rc.length(); x++) {

                if (charsArray[i] == charsArray[x]) {

                    System.out.println("Повторяющийся символ в слове \"Hello\": " + charsArray[x]);

                    counter++;

                    break;
                }
            }
        }
    }
}
