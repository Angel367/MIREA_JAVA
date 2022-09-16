package src.src;

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
            return true;
    }
    public boolean recursivePrimeChecking(int num) {
       // return recursivePrimeChecking(num, num-1);
    }
}
