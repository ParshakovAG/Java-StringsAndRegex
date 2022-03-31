package practice.regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneCleanerRegex {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("0")) {
                scanner.close();
                break;
            }
            //TODO:напишите ваш код тут, результат вывести в консоль.
            input = input.replaceAll("\\D", "");
            input = input.replaceFirst("^8", "7");

            if (input.length() <= 10) {
                input = "7" + input;
            }
            if (input.charAt(0) != '7') {
                System.out.println("Неверный формат номера");
                break;
            }
            if (input.length() > 11 || input.length() < 10) {
                System.out.println("Неверный формат номера");
                break;
            }
            String regex = "\\d{11}";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(input);
            if (matcher.matches()) {
                System.out.println(input);
            } else {
                System.out.println("Неверный формат номера");
            }
            break;
        }
    }
}