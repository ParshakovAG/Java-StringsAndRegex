package practice.strings;

public class TotalEarningsCalculator {

  public static void main(String[] args) {

    String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
    //TODO: напишите ваш код, результат вывести в консоль
    System.out.println(getSumSalary(text));
  }

  public static int getSumSalary(String text) {

    int totalSalary = 0;
    String salary = "";
    for (int i = 0; i < text.length(); i++) {
      if (Character.isDigit(text.charAt(i))) {
        int start = text.indexOf(text.charAt(i), i);
        int end = text.indexOf(" ", start);
        salary = text.substring(start, end);
        totalSalary += Integer.parseInt(salary);
        i += salary.length();
      }
    }
    return totalSalary;
  }
}