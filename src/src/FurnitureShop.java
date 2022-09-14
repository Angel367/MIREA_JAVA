package src;

import src.furniture.*;

import java.util.ArrayList;
import java.util.Scanner;

public class FurnitureShop {
    private int moneyAmount;
    private int chairPrice = 35;
    private int chestPrice = 70;
    private ArrayList<Chair> chairs = new ArrayList<Chair>();
    private ArrayList<Chest> chests = new ArrayList<Chest>();

    public FurnitureShop(int moneyAmount) {
        this.moneyAmount = moneyAmount; // Кол-во денег в кассе в начале смены
    }

    public FurnitureShop() {
        this.moneyAmount = 0;
    }

    public void openShift() {
        Scanner in = new Scanner(System.in);
        int userSelect;
        while (true) {
            System.out.print("""
                    МЕНЮ:
                    1) Продать стул
                    2) Продать комод
                    3) Забить поставку
                    4) Вывести текущее кол-во денег в кассе
                    5) Вывести продажи за сегодня
                    6) Вывести сводку и закрыть смену

                    Введите цифру пункта меню:\040""");
            userSelect = in.nextInt();
            switch (userSelect) {
                case 1:
                    if (chairs.size() == 0)
                        System.out.println("Стулья закончились!");
                    else {
                        Chair soldChair = this.sellChair();
                        System.out.println("Стул успешно продан!");
                    }
                    break;
                case 2:
                    if (chests.size() == 0)
                        System.out.println("Комоды закончились!");
                    else {
                        Chest soldChest = this.sellChest();
                        System.out.println("Комод успешно продан!");
                    }
                    break;
                case 3:
                    System.out.print("Количество новых стульев: ");
                    addNewChair(in.nextInt());
                    System.out.print("Количество новых комодов: ");
                    addNewChest(in.nextInt());
                    System.out.println("Поставка успешно вбита!");
                    break;
                case 4:
                    System.out.println("Текущее количество денег в кассе: " + this.moneyAmount);
                    break;
                case 5:
                    System.out.println("Продано: ");
                    break;
                case 6:
                    break;
                default: System.out.println("Некорректный пункт меню! Введите еще раз: ");
                break;
            }
        }
    }

    public int getMoneyAmount() {
        return moneyAmount;
    }

    public void setMoneyAmount(int moneyAmount) {
        this.moneyAmount = moneyAmount;
    }

    public Chair sellChair() {
        Chair chair = chairs.get(chairs.size() - 1);
        chairs.remove(chairs.size() - 1);
        this.moneyAmount += chairPrice;
        return chair;
    }

    public Chest sellChest() {
        Chest chest = chests.get(chests.size() - 1);
        chests.remove(chests.size() - 1);
        this.moneyAmount += chestPrice;
        return chest;
    }

    public void addNewChair(int amount) {
        for (int i = 0; i < amount; i++)
            chairs.add(new Chair("Дерево", 0, true, false, true));
    }
    public void addNewChair() { addNewChair(1); }

    public void addNewChest(int amount) {
        for (int i = 0; i < amount; i++)
            chests.add(new Chest("Дерево", 0, true, false));
    }
    public void addNewChest() { addNewChest(1); }
}
