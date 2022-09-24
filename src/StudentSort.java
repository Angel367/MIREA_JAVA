import java.util.ArrayList;

public class StudentSort {
    ArrayList<Student> students = new ArrayList<>();

    public StudentSort() {}

    public void addStudent(Student student) {
        students.add(student);
    }
    public void showStudents() {
        for (Student student : students)
            System.out.println(student);
    }

    public void sort () {
        for (int i = 1; i < students.size(); i++) {
            Student current = students.get(i);
            int j = i - 1;
            while(j >= 0 && current.getIDNumber() < students.get(j).getIDNumber()) {
                students.set(j+1, students.get(j));
                j--;
            }
            // в этой точке мы вышли, так что j так же -1
            // или в первом элементе, где текущий >= a[j]
            students.set(j+1, current);
        }
            // В освободившееся место вставляем вытащенное значение
            //students.set(i + 1, students.get(left));


    }
}
