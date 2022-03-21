package practice.strings;

import java.util.Scanner;

public class FullNameFormatter {

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
      int spaceCount = 0;
      int spaceIndex = input.indexOf(' ');
      int spaceLastIndex = input.lastIndexOf(' ');

      if (input.equals("0") || input.equals("") || input.equals(" ")) {
        break;
      }
      for (int i = 0; i < input.length(); i++) {
        char ch = input.charAt(i);
        if (ch == ' ') {
          spaceCount++;
          }
        if (Character.isDigit(ch)) {
          break;
        }
      }
      if (spaceCount != 2) {
        System.out.println("Введенная строка не является ФИО");
        break;
      }
      String firstName = input.substring(0, spaceIndex).trim();
      String lastName = input.substring(spaceIndex + 1, spaceLastIndex).trim();
      String thirdName = input.substring(spaceLastIndex + 1).trim();

      System.out.println("Фамилия: " + firstName);
      System.out.println("Имя: " + lastName);
      System.out.println("Отчество: " + thirdName);
    }
  }

}