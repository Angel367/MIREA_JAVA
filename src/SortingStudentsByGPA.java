import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class SortingStudentsByGPA {
    private ArrayList<Student> students = new ArrayList<>();

    public void setArray() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество студентов: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            System.out.print("Введите имя студента номер " + i + ": ");
            String name = scanner.nextLine();
            System.out.print("Введите фамилию студента номер " + i + ": ");
            String curName = scanner.nextLine();
            System.out.print("Введите специальность студента номер " + i + ": ");
            String specialization = scanner.nextLine();
            System.out.print("Введите номер курса студента номер " + i + ": ");
            int courseNumber = scanner.nextInt();
            System.out.print("Введите номер группы номер " + i + ": ");
            int groupNumber = scanner.nextInt();
            System.out.print("Введите средний балл студента номер " + i + ": ");
            double GPA = scanner.nextDouble();
            students.add(new Student(name, curName, specialization, courseNumber, groupNumber, GPA));
            System.out.print("Студент успешно добавлен!");
        }
        System.out.print("Студенты успешно добавлены!");
    }

    public void setArray(boolean rand) {
        if (!rand) {
            setArray();
            return;
        }
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите количество студентов: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            String name = "Иван" + i;
            String curName = "Смирнов";
            String specialization = "Киб";
            int courseNumber = random.nextInt(4);
            int groupNumber = random.nextInt(12);
            double GPA = random.nextDouble()*5;
            students.add(new Student(name, curName, specialization, courseNumber, groupNumber, GPA));
        }
        System.out.println("Студенты успешно добавлены!");
    }

    public void outArray() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

}
