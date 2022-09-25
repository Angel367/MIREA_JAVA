import java.text.SimpleDateFormat;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //task1();
        task2();
    }
    public static void task1() {
        System.out.println("Волков\nДата и время получения задания:\n12:40 10 сентября 2022 года\nТекущая дата: ");
        Date date = new Date();
        Calendar now = Calendar.getInstance();
        now.setTimeInMillis(date.getTime());
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy HH:mm");
        /*
        long currDate = date.getTime() / 60000;
        int year = (int) (currDate/(60*24*365));
        int month = (int) ((currDate - year*60*24*365)/(60*24*30));
        int day = (int) ((currDate - year*60*24*365 - month*60*24*30));///(60*24));
        int hour = (int) ((currDate - year*60*24*365 - month*60*24*30 - day*60*24)/60);
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH) + "." + calendar.get(Calendar.MONTH) + "."
                + calendar.get(Calendar.YEAR));
        */
        System.out.println(sdf.format(now.getTime()));

    }
    public static void task2() {
        Scanner scanner = new Scanner(System.in);
        GregorianCalendar now = new GregorianCalendar();
        GregorianCalendar userData = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd MMMM yyyy");
        int day, month, year;

        System.out.print("Введите день: "); day = scanner.nextInt();
        System.out.print("Введите месяц: "); month = scanner.nextInt();
        System.out.print("Введите год: "); year = scanner.nextInt();

        userData.set(GregorianCalendar.DAY_OF_MONTH, day);
        userData.set(GregorianCalendar.MONTH, month-1);
        userData.set(GregorianCalendar.YEAR, year);

        System.out.println("Текущая дата:");
        System.out.println(sdf.format(now.getTime()));
        System.out.println("Введённая дата:");
        System.out.println(sdf.format(userData.getTime()));

        GregorianCalendar difference = new GregorianCalendar();
        difference.setTimeInMillis(Math.abs(userData.getTimeInMillis()-now.getTimeInMillis()));

        System.out.println("Разница составляет:\nДней: " + (difference.get(GregorianCalendar.DAY_OF_MONTH)-1) +
                "\nМесяцев: " + difference.get(GregorianCalendar.MONTH) +
                "\nЛет: " + (difference.get(GregorianCalendar.YEAR)-1970));
    }
}
