public class Student{
    private int iDNumber;
    private String name;
    private double GPA;

    public Student(int iDNumber, String name, double GPA) {
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
        return String.format("Student{" +
                "iDNumber=" + iDNumber +
                ", name='" + name + '\'' +
                ", GPA=%.2f" +
                '}', GPA);
    }
}
