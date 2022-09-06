import java.util.Random;
import java.lang.Math;
import java.util.Scanner;

public class Main {
    static int SIZE = 10;
    public static void main (String[] args) {
        task3();
        {
            System.out.println("\nЗадание 4.\nАргументы командной строки: ");
            for (String arg : args)
                System.out.print(arg + " ");
        }   // Задание 4
        task5();
        task6();
        task7();
    }
    public static int task3 () {
        Random rand = new Random(); // Через класс Random
        int[] myArr = new int[SIZE];
        System.out.print("Задание 3.\nЭлементы массива: ");
        for (int i = 0; i < SIZE; i++) {
            myArr[i] = rand.nextInt(100);
            System.out.print(myArr[i] + " ");
        }
        int sum, i;

        sum = 0;
        for (int el : myArr)
            sum += el;
        System.out.println("\nРезультат с помощью цикла for: " + sum);


        sum = 0; i = 0;
        while (i < SIZE) {
            sum += myArr[i];
            i += 1;
        }
        System.out.println("Результат с помощью цикла while: " + sum);


        sum = 0; i = 0;
        do {
            sum += myArr[i];
            i += 1;
        } while (i < SIZE);
        System.out.println("Результат с помощью цикла do-while: " + sum);
        return 0;
    }   // Шаг 3

    public static int task5 () {
        System.out.print("\n\nЗадание 5.\nПервые 10 чисел гармонического ряда: ");
        for (int i = 1; i < 11; i++)
            System.out.print(1.0 / i + " ");
        return 0;
    }
    public static int task6 () {
        int[] myArr = new int[SIZE];
        System.out.print("\n\nЗадание 6.\nЭлементы исходного массива: ");
        for (int i = 0; i < SIZE; i++) {
            myArr[i] = (int)(Math.random() * 100);
            System.out.print(myArr[i] + " ");
        }

        for (int i = 0; i < SIZE - 1; i++)
            for (int j = 0; j < SIZE - i - 1; j++)
                if (myArr[j] > myArr[j + 1]) {
                    int temp = myArr[j];
                    myArr[j] = myArr[j + 1];
                    myArr[j + 1] = temp;
                }
        System.out.print("\nЭлементы отсортированного массива: ");
        for (int i = 0; i < SIZE; i++) {
            System.out.print(myArr[i] + " ");
        }
        return 0;
    }
    public static int task7 () {
        int num = 0, sum = 1;
        boolean success = false;
        Scanner inp = new Scanner(System.in);
        System.out.print("\n\nЗадание 7.\nВведите неотрицательное число для расчёта его факториала: ");
        while (!success) {
            num = inp.nextInt();
            if (num >= 0) success = true;
            else System.out.print("Число должно быть неотрицательным! Введите ещё раз: ");
        }
        for (int i = 1; i <= num; i++) {    // Почему без явной инициализации num Java выдает ошибку?
            sum *= i;
        }
        System.out.print("\nРезультат выражения " + num + "!" + " равен " + sum);

        return 0;
    }
}
