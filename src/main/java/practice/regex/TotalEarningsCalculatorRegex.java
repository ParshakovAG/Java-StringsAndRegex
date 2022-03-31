package practice.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TotalEarningsCalculatorRegex {

    public static void main(String[] args) {
        String text = "Вася заработал 5000 рублей, Петя - 7563 рубля, а Маша - 30000 рублей";
        System.out.println(calculateSalarySum(text));
    }

    public static int calculateSalarySum(String text) {
        //TODO: реализуйте метод
        String regex = "[0-9]{1,9}[^,\\s[А-Я][а-я]+]";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);
        int sum = 0;
        while (matcher.find()) {
            int start = matcher.start();
            int end = matcher.end();
            String result = text.substring(start, end);
            int num = Integer.parseInt(result);
            sum = sum + num;
            System.out.println(num);
        }

        return sum;
    }

}