import java.util.*;

public class Students {
    private ArrayList<Student> iDNumber = new ArrayList<>();

    public void quickSort () {
        SortingStudentsByGPAComparator sortingStudentsByGPAComparator = new SortingStudentsByGPAComparator();
        iDNumber.sort(sortingStudentsByGPAComparator);
    }

    public static Student[] mergeSort(Student[] a, int n) {
        if (n < 2) {
            return a;
        }
        if (a == null) return null;
        int mid = n / 2;
        Student[] l = new Student[mid];
        Student[] r = new Student[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = a[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = a[i];
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        return merge(a, l, r, mid, n - mid);
    }
    public static Student[] mergeSort(Student[] a, Student[] b) {
        int n = a.length + b.length;
        Student[] c = new Student[n];
        int i;
        for (i = 0; i < a.length + b.length; i++)
            if (i < a.length) c[i] = a[i];
            else c[i] = b[i- a.length];
        return mergeSort(c, n);
    }
    public static ArrayList<Student> mergeSort(ArrayList<Student> a, ArrayList<Student> b) {
        int n = a.size() + b.size();
        Student[] c = new Student[n];
        for (int i = 0; i < a.size() + b.size(); i++)
            if (i < a.size()) c[i] = a.get(i);
            else c.add(b.get(i - a.size()));


    }
    public static Student[] merge(
            Student[] a, Student[] l, Student[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].getGPA() >= r[j].getGPA()) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
        return a;
    }
    public void mergeSort() {
        Student[] students = new Student[iDNumber.size()];
        for (int i = 0; i < iDNumber.size(); i++)
            students[i] = iDNumber.get(i);
        Students.mergeSort(students, students.length);
        Collections.addAll(iDNumber, students);
    }

    public void setArray() {
        iDNumber = new ArrayList<>();
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
            iDNumber.add(new Student(name, curName, specialization, courseNumber, groupNumber, GPA));
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
            int courseNumber = random.nextInt(4)+1;
            int groupNumber = random.nextInt(12)+1;
            double GPA = random.nextDouble()*4+1;
            iDNumber.add(new Student(name, curName, specialization, courseNumber, groupNumber, GPA));
        }
        System.out.println("Студенты успешно добавлены!");
    }
    public static ArrayList<Student> setArray(ArrayList<Student> iDNumber, int amount) {
        Random random = new Random();
        for (int i = 0; i < amount; i++) {
            String name = "Иван" + i;
            String curName = "Смирнов";
            String specialization = "Киб";
            int courseNumber = random.nextInt(4)+1;
            int groupNumber = random.nextInt(12)+1;
            double GPA = random.nextDouble()*4+1;
            iDNumber.add(new Student(name, curName, specialization, courseNumber, groupNumber, GPA));
        }
        return iDNumber;
    }

    public void outArray() {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }
    public static void outArray(ArrayList<Student> iDNumber) {
        for (Student student : iDNumber) {
            System.out.println(student);
        }
    }

}
