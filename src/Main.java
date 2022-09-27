import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
    }
    public static void task1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1:\nВведите даты в формате dd/mm/yyyy, где год от 1900 до 9999.");
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("([0-2][0-9]|3[0-1])/(0[0-9]|1[0-2])/(19[0-9]{2}|[2-9][0-9]{3})");
        Matcher matcher = pattern.matcher(text);
        System.out.println("Даты, соответствующие шаблону:");
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }

    }
    //(((\d+)|(\d+.\d{2}))+(\s(USD|EU|RUB)))
    public static void task2() {
        System.out.println("Задание 2:");
        String str1 = "abcdefghijklmnopqrstuv18340";
        String str2 = "abcdefghijklmnoasdfasdpqrstuv18340";
        System.out.println("Строка " + str1 + ": " +
                Pattern.matches("abcdefghijklmnopqrstuv18340", str1));
        System.out.println("Строка " + str2 + ": " +
                Pattern.matches("abcdefghijklmnopqrstuv18340", str2));
    }
}
