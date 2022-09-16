package src;

import java.util.Scanner;

public class Solution {
    public void task1(int n) {
        int counter = 1;
        int currNum = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(currNum + " ");
            counter += 1;
            if (counter > currNum) {
                counter = 1;
                currNum+=1;
            }
        }
    }

    public void task2(int n) {
        for (int i = 1; i < n; i++)
            System.out.print(i + " ");
    }

    public void task3() {
        int A, B;
        Scanner scanner = new Scanner(System.in);
        A = scanner.nextInt();
        B = scanner.nextInt();

        if (A < B)
            for (int i = A; i <= B; i++)
                System.out.print(i + " ");
        else
            for (int i = A; i >= B; i--)
                System.out.print(i + " ");
    }

    public int task4(int k, int s) {   // k-значное число, s - сумма цифр
        int amount = 0;
        for (int i = (int)Math.pow(10, k-1); i < (int)Math.pow(10, k); i++)
            if (sumDigitsOfNum(i) == s) amount+=1;
        return amount;
    }


    public int sumDigitsOfNum(int n) {
        return (n == 0) ? 0 : (n % 10) + sumDigitsOfNum(n / 10);
    }


    public boolean recursivePrimeChecking(int num, int divider) {
        while (divider >= 2) {
            if (num % divider == 0)
                return false;
            else
                return recursivePrimeChecking(num, divider-1);
        }
            return true;
    }
    public boolean recursivePrimeChecking(int num) {
       return recursivePrimeChecking(num, num-1);
    }
    public void showPrimeMultipliers (int num) {
        for (int i = num; i > 1; i--) {
            if (recursivePrimeChecking(i) && num % i == 0) System.out.print(i + " ");
        }
    }
    public boolean isPalindrome (String word) {
        for (int i = 0; i < word.length()/2; i++)
            if (word.charAt(i) != word.charAt(word.length()-i-1))
                return false;
        return true;
    }
    public int task9 (int a, int b) {
        if (a == 0) return 1;
        if (a == 1) return b + 1;
        if (a > 1 && b == 0) return 0;
        return task9(a - 1, b - 1) + task9(a, b - 1);
    }
    public int reverseNum (int num, int gen) {
        if (num < 10) return num;
        return reverseNum(num/10, gen-1) + (num%10)*(int)Math.pow(10, gen);
    }
    public int reverseNum (int num) {
        return reverseNum(num, (int) (Math.log10(num)));
    }

    public int task11() {
        Scanner inp = new Scanner(System.in);
        int prevNum = inp.nextInt();
        int countOfOnes = 0;
        while (true) {
            int currNum = inp.nextInt();
            if (prevNum == 1) countOfOnes += 1;
            if (prevNum == 0 && currNum == 0) break;
            prevNum = currNum;
        }
        return countOfOnes;
    }
    public void task12() {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        if (num == 0) return;
        else {
            if (num % 2 == 1) System.out.print(num + " ");
            task12();
        }
    }
    public void task13() {
        Scanner inp = new Scanner(System.in);
        int num = inp.nextInt();
        if (num != 0) {
            System.out.print(num + " ");
            int nextNum = inp.nextInt();
            if (nextNum != 0) task13();
        }
    }

    public void task14 (int num) {
        if (num < 10) return;
        System.out.print(num % (int)Math.log10(num) + " ");
        task14(num/10);
    }

}
