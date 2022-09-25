import java.util.GregorianCalendar;

public class Student {
    private String name, curName, specialization;
    private int courseNumber, groupNumber;
    private double GPA;
    private GregorianCalendar birthday;

    public Student(String name, String curName, String specialization, int courseNumber, int groupNumber, double GPA,
                   GregorianCalendar birthday) {
        this.name = name;
        this.curName = curName;
        this.specialization = specialization;
        this.courseNumber = courseNumber;
        this.groupNumber = groupNumber;
        this.GPA = GPA;
        this.birthday = birthday;
    }
    public Student(String name, String curName, String specialization, int courseNumber, int groupNumber, double GPA) {
        this.name = name;
        this.curName = curName;
        this.specialization = specialization;
        this.courseNumber = courseNumber;
        this.groupNumber = groupNumber;
        this.GPA = GPA;
        this.birthday = new GregorianCalendar();
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCurName() {
        return curName;
    }

    public void setCurName(String curName) {
        this.curName = curName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public int getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(int courseNumber) {
        this.courseNumber = courseNumber;
    }

    public int getGroupNumber() {
        return groupNumber;
    }

    public void setGroupNumber(int groupNumber) {
        this.groupNumber = groupNumber;
    }

    public double getGPA() {
        return GPA;
    }

    public void setGPA(double GPA) {
        this.GPA = GPA;
    }

    public GregorianCalendar getBirthday() {
        return birthday;
    }

    public void setBirthday(GregorianCalendar birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {

        return String.format("Student{" +
                "name='" + name + '\'' +
                ", curName='" + curName + '\'' +
                ", specialization='" + specialization + '\'' +
                ", courseNumber=" + courseNumber +
                ", groupNumber=" + groupNumber +
                ", GPA=%.2f" +
                '}', GPA);
    }
}
