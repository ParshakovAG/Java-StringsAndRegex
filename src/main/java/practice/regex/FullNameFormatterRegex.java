package practice.regex;

import java.util.Scanner;

public class FullNameFormatterRegex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                scanner.close();
                break;
            }
            //TODO:напишите ваш код тут, результат вывести в консоль.
            //При невалидном ФИО вывести в консоль: Введенная строка не является ФИО
            String[] text = input.split(" ");
            if (!input.matches("[а-яА-Я -]+") || (text.length != 3)) {
                System.out.println("Введенная строка не является ФИО");
            } else {
                System.out.println("Фамилия: " + text[0]);
                System.out.println("Имя: " + text[1]);
                System.out.println("Отчество: " + text[2]);
            }
            break;
        }
    }
}
