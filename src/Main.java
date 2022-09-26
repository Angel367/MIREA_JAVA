import java.io.IOException;
import java.lang.reflect.Array;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Задание 1:");
        Task1 task1 = new Task1();

        Person person1 = new Person("Ольга", "Вдовина", "Петровна");
        Person person2 = new Person("Ольга");
        System.out.println("Задание 2:\n" + person1 + "\n" + person2);

        Address address1 = new Address("Россия, Московия, Москва, Варшавское шоссе, 144, 1, 15", true);
        Address address2 = new Address("Россия; Московия; Москва; Варшавское шоссе; 144; 1; 15", false);
        System.out.println("Задание 3:\n" + address1 + "\n" + address2);

        task4();

        PhoneNumber phoneNumber1 = new PhoneNumber("89167731212");
        PhoneNumber phoneNumber2 = new PhoneNumber("+79998499291");
        System.out.println("Задание 5:\n" + phoneNumber1 + "\n" + phoneNumber2);

        SortingWords sw = new SortingWords();
    }
    public static void task4() {
        String[] shirtsInfo = new String[11];
        shirtsInfo[0] = "S001,Black Polo Shirt,Black,XL"; shirtsInfo[1] = "S002,Black Polo Shirt,Black,L";
        shirtsInfo[2] = "S003,Blue Polo Shirt,Blue,XL"; shirtsInfo[3] = "S004,Blue Polo Shirt,Blue,M";
        shirtsInfo[4] = "S005,Tan Polo Shirt,Tan,XL"; shirtsInfo[5] = "S006,Black T-Shirt,Black,XL";
        shirtsInfo[6] = "S007,White T-Shirt,White,XL"; shirtsInfo[7] = "S008,White T-Shirt,White,L";
        shirtsInfo[8] = "S009,Green T-Shirt,Green,S"; shirtsInfo[9] = "S010,Orange T-Shirt,Orange,S";
        shirtsInfo[10] = "S011,Maroon Polo Shirt,Maroon,S";
        Shirt[] shirts = new Shirt[11];
        for (int i = 0; i < 11; i++)
            shirts[i] = new Shirt(shirtsInfo[i]);
        System.out.println("Задание 4:\n" + Arrays.toString(shirts));
    }

}
