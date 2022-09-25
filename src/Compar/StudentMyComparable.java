package Compar;

public class StudentMyComparable implements MyComparable<StudentMyComparable> {
    private int iDNumber;
    private String name;
    private double GPA;

    public StudentMyComparable(int iDNumber, String name, double GPA) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.GPA = GPA;
    }

    public int getIDNumber() {
        return iDNumber;
    }

    public void setIDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }


    @Override
    public String toString() {
        return "Student{" +
                "iDNumber=" + iDNumber +
                ", name='" + name + '\'' +
                ", GPA=" + GPA +
                '}';
    }

    @Override
    public int compareTo(StudentMyComparable O) {
        return this.getIDNumber() - O.getIDNumber();
    }
}
