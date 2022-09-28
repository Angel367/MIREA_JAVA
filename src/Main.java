import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
        //task8();
        task9("Мистер и миссис Дурсль проживали в доме номер четыре по Тисовой улице и всегда с гордостью" +
                "заявляли, что они, слава богу, абсолютно нормальные люди. Уж от кого-кого, а от них никак нельзя было"+
                "ожидать, чтобы они попали в какую-нибудь странную или загадочную ситуацию. Мистер и миссис Дурсль" +
                "весьма неодобрительно относились к любым странностям, загадкам и прочей ерунде.");
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
    //(?<![\d[.]])(\d+([.]\d{1,2})|(\d+))(\s(USD|EU|RUB))
    public static void task2() {
        System.out.println("Задание 2:");
        String str1 = "abcdefghijklmnopqrstuv18340";
        String str2 = "abcdefghijklmnoasdfasdpqrstuv18340";
        System.out.println("Строка " + str1 + ": " +
                Pattern.matches("abcdefghijklmnopqrstuv18340", str1));
        System.out.println("Строка " + str2 + ": " +
                Pattern.matches("abcdefghijklmnopqrstuv18340", str2));
    }
    public static void task3() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 1:\nВведите даты в формате 12(.12)? RUB|USD|EU");
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("(?<![\\d[.]])(\\d+([.]\\d{1,2})|(\\d+))(\\s(USD|EU|RUB))");
        Matcher matcher = pattern.matcher(text);
        System.out.println("Цены, соответствующие шаблону:");
        while (matcher.find()) {
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
    public static void task4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 4:\nВведите выражение:");
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("(\\d([\\s]?[+]))");
        Matcher matcher = pattern.matcher(text);
        if (matcher.find())
            System.out.println("В выражении есть цифры, за которым стоит знак +");
        else
            System.out.println("В выражении НЕТ цифр, за которым стоит знак +");
    }
    public static void task5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 5:\nВведите дату в формате dd/mm/yyyy, где год от 1900 до 9999.");
        String text = scanner.nextLine();

        if (text.matches("([0-2][0-9]|3[0-1])/(0[0-9]|1[0-2])/(19[0-9]{2}|[2-9][0-9]{3})"))
            System.out.println("Дата соответствует шаблону");
        else
            System.out.println("Дата НЕ соответствует шаблону");
    }
    public static void task6() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 6:\nВведите e-mail");
        String text = scanner.nextLine();
        Pattern pattern = Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(text);
        if (matcher.find())
            System.out.println("Строка является адресом электронной почты!");
        else
            System.out.println("Строка НЕ является адресом электронной почты!");
    }
    public static void task7() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Задание 7:\nВведите пароль, состоящий не менее чем из 8 символов и содержащий ХОТЯ БЫ одну"+
                        "маленькую и одну большую букву");
        String text = scanner.nextLine();
        Pattern pattern8Symbols = Pattern.compile(".{8}");
        Matcher matcher8Symbols = pattern8Symbols.matcher(text);
        Pattern patternAZ = Pattern.compile("[A-Z]");
        Matcher matcherAZ = patternAZ.matcher(text);
        Pattern pattern_az = Pattern.compile("[a-z]");
        Matcher matcher_az = pattern_az.matcher(text);
        if (matcher8Symbols.find() && matcherAZ.find() && matcher_az.find())
            System.out.println("Строка является надежным паролем!");
        else
            System.out.println("Строка НЕ является надежным паролем!");
    }
    public static void task8() {
        String[] strArray = new String[10];
        strArray[0] = "0";
        strArray[3] = "3";
        System.out.println("Длина исходного массива: " + strArray.length);

        String[] editedStrArray = (String[]) filter(strArray, new Filter() {
            @Override
            public boolean apply(Object o) {
                return o != null;
            }
        });
        System.out.println(Arrays.asList(editedStrArray));
        System.out.println("Длина нового массива: " + editedStrArray.length);
    }
    public static Object[] filter(Object[] arr, Filter filter) {
        int shift = 0;  // Величина сдвига

        for (int i = 0; i < arr.length; i++) {
            if (!filter.apply(arr[i]))
                shift += 1;
            else
                arr[i-shift] = arr[i];
        }
        return Arrays.copyOf(arr, arr.length-shift);
    }
    public static void task9(String text) {
        Map<Character, Integer> myMap = new TreeMap<>();    // TreeMap сортируется сама офигеть
        char ch;
        for (int i = 0; i < text.length(); i++) {
            ch = Character.toLowerCase(text.charAt(i));
            if (ch >= 'а' && ch <= 'я') {
                if (!myMap.containsKey(ch))
                    myMap.put(ch, 1);
                else
                    myMap.put(ch, myMap.get(ch) + 1);
            }
        }
        for (char key : myMap.keySet()) {
            System.out.println(key + ": " + myMap.get(key));
        }
    }

}
