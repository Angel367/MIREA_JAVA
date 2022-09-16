package src;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.print("Задача 1: "); solution.task1(11);
        System.out.print("\nЗадача 2: "); solution.task2(10);
        System.out.print("\nЗадача 3: "); solution.task3();
        System.out.println("\nЗадача 4: " + solution.task4(4, 9));
        System.out.println("Задача 5: " + solution.sumDigitsOfNum(1112));
        System.out.println("Задача 6: " + solution.recursivePrimeChecking(102));
        System.out.print("Задача 7: 102: "); solution.showPrimeMultipliers(102);
        System.out.println("\nЗадача 8: " + solution.isPalindrome("привет") + " " + solution.isPalindrome("алла"));
        System.out.println("Задача 9: " + solution.task9(10, 12));
        System.out.println("Задача 10: " + solution.reverseNum(123450678));
        System.out.println("Задача 11: "); System.out.println(solution.task11() + " - количество единиц");
        System.out.println("Задача 12: "); solution.task12();
        System.out.println("Задача 13: "); solution.task13();
        System.out.println("Задача 14: "); solution.task14(12345678);
        System.out.println("\nЗадача 15: "); solution.task15(12345678); System.out.println();
        System.out.println("Задача 16: " + solution.task16());
        System.out.println("Задача 17: " + solution.task17());
    }
}
