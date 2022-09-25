import java.util.Comparator;

public class SortingStudentsByGPAComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        if (Math.abs(o1.getGPA() - o2.getGPA()) <= 0.01) return 0;
        return o1.getGPA() > o2.getGPA() ? -1 : 1;
    }
}
