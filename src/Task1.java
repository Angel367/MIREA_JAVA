public class Task1 {
    Task1() {
        subTask1("I like Java!!!");
        subTask2("I like Java!!!");
        subTask3("I like Java!!!");
        subTask4("I like Java!!!");
        subTask5("I like Java!!!");
        subTask6();
        subTask7("I like Java!!!");
        subTask8("I like Java!!!");
        subTask9("I like Java!!!");
        subTask10("I like Java!!!");
    }
    public void subTask1(String str) {}
    public void subTask2(String str) {
        System.out.println("Задача 2: " + str.charAt(str.length()-1));
    }
    public void subTask3(String str) {
        System.out.println("Задача 3: " +str.endsWith("!!!"));
    }
    public void subTask4(String str) {
        System.out.println("Задача 4: " +str.startsWith("!!!"));
    }
    public void subTask5(String str) {
        System.out.println("Задача 5: " +str.contains("!!!"));
    }
    public void subTask6() {
        String str = "I like Java!!!";
        System.out.println("Задача 6: " +str.indexOf("Java"));
    }
    public void subTask7(String str) {
        String resultString = str.replace("a", "o");
        System.out.println("Задача 7: " +resultString);
    }
    public void subTask8(String str) {
        String resultString = str.toUpperCase();
        System.out.println("Задача 8: " +resultString);
    }
    public void subTask9(String str) {
        String resultString = str.toLowerCase();
        System.out.println("Задача 9: " +resultString);
    }
    public void subTask10(String str) {
        String resultString = str.substring(7, 11);
        System.out.println("Задача 10: " +resultString);
    }
}
