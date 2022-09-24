import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        StudentSort studentSort1 = new StudentSort();
        Random random = new Random();
        for (int i = 0; i < 10; i++)
            studentSort1.addStudent(new Student(random.nextInt(100), "", 0));
        studentSort1.showStudents();
        studentSort1.sort();
        System.out.println("Отсортированный список:");
        studentSort1.showStudents();


        System.out.println("Пункт 2:");
        ArrayList<Student> students = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            students.add(new Student(random.nextInt(100), "", random.nextDouble()*5));
            System.out.println(students.get(i));
        }
        System.out.println("Отсортированный список:");
        Comparator<Student> GPAComparator = new SortingStudentsByGPA();
        students.sort(GPAComparator);
        for (int i = 0; i < 10; i++)
            System.out.println(students.get(i));


        System.out.println("Пункт 3:");
        Student[] students1 = new Student[5];
        Student[] students2 = new Student[5];
        for (int i = 0; i < 10; i++) {
            if (i < 5) {
                students1[i] = new Student(random.nextInt(100), "", 0);
                System.out.println(students1[i]);
            }
            else {
                students2[i-5] = new Student(random.nextInt(100), "", 0);
                System.out.println(students2[i-5]);
            }
        }
        Student[] sortedStudents = MergeSortingStudentsByID.sortArray(students1, students2);
        System.out.println("Отсортированный список:");
        for (int i = 0; i < 10; i++)
            System.out.println(sortedStudents[i]);


    }
}
