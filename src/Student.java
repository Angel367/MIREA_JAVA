import java.text.DateFormat;
import java.text.DateFormatSymbols;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Student {
    private String name, curName, specialization;
    private int courseNumber, groupNumber;
    private GregorianCalendar birthday;
    private SimpleDateFormat sdf;

    public Student(String name, String curName, String specialization, int courseNumber, int groupNumber,
                   GregorianCalendar birthday) {
        this.name = name;
        this.curName = curName;
        this.specialization = specialization;
        this.courseNumber = courseNumber;
        this.groupNumber = groupNumber;
        this.birthday = birthday;
    }
    public Student() {
        Random random = new Random();
        this.name = "Карапуз";
        this.curName = "Пельмень";
        this.specialization = "Специалист по детским пельменям";
        this.courseNumber = random.nextInt(4)+1;
        this.groupNumber = random.nextInt(12)+1;
        this.birthday = new GregorianCalendar();
    }

    public Student(String name, String curName, String specialization, int courseNumber, int groupNumber, double GPA){
        Scanner inp = new Scanner(System.in);
        this.name = name;
        this.curName = curName;
        this.specialization = specialization;
        this.courseNumber = courseNumber;
        this.groupNumber = groupNumber;

        System.out.println("Введите дату рождения студента: ");

        SimpleDateFormat sdf1 = new SimpleDateFormat("dd MM yyyy", new Locale("ru"));
        SimpleDateFormat sdf2 = new SimpleDateFormat("dd MMMM yyyy", new Locale("ru"));
        Date date = new Date();
        this.birthday = new GregorianCalendar();
            while (true) {
            String userDate = inp.nextLine();
            try {
                date = sdf1.parse(userDate);
                this.sdf = sdf1;
                break;
            } catch (ParseException ignored) {}
            try {
                date = sdf2.parse(userDate);
                this.sdf = sdf2;
                break;
            } catch (ParseException e) {
                System.out.print("Некорректный формат даты! Попробуйте еще раз: ");
            }
        }
        this.birthday.setTime(date);
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

    public GregorianCalendar getBirthday() {
        return birthday;
    }

    public void setBirthday(GregorianCalendar birthday) {
        this.birthday = birthday;
    }
    public void setBirthday() {
        Scanner inp = new Scanner(System.in);
        int day, month, year;
        this.birthday.set(GregorianCalendar.DAY_OF_MONTH, inp.nextInt());
        this.birthday.set(GregorianCalendar.MONTH, inp.nextInt()-1);
        this.birthday.set(GregorianCalendar.YEAR, inp.nextInt());

    }

    @Override
    public String toString() {
        Date temp = new Date(birthday.getTimeInMillis());
        String formattedDate = this.sdf.format(temp);
        return "Student{" +
                "name='" + name + '\'' +
                ", curName='" + curName + '\'' +
                ", specialization='" + specialization + '\'' +
                ", courseNumber=" + courseNumber +
                ", groupNumber=" + groupNumber +
                ", birthday=" + formattedDate +
                '}';
    }
}
