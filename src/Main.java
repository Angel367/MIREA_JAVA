import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Students students = new Students();
        students.setArray(true);
        System.out.println("Неотсортированный список:");
        students.outArray();
        students.quickSort();   // Сортировка быстрой сортировкой
        System.out.println("Отсортированный список:");
        students.outArray();

        students.setArray(true);
        System.out.println("Неотсортированный список:");
        students.outArray();
        students.mergeSort();   // Сортировка слиянием
        System.out.println("Отсортированный список:");
        students.outArray();

        ArrayList<Student> students1 = new ArrayList<>();
        ArrayList<Student> students2 = new ArrayList<>();
        ArrayList<Student> students3 = new ArrayList<>();   // Создали 3 списка студентов
        Students.setArray(students1, 5);
        Students.setArray(students2, 5);    // "Наполнили" 2 списка студентов
        System.out.println("2 неотсортированных списка:");
        Students.outArray(students1);
        Students.outArray(students2);   // "Вывели" 2 списка студентов
        students3 = Students.mergeSort(students1, students2);
        System.out.println("1 отсортированный список:");
        Students.outArray(students3);
    }
}
