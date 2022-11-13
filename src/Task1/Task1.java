package Task1;

public class Task1 {
    /*
    Метод main является методом входа в приложение Java,
    через этот метод программа начинает выполнятся.
    Программа Java всегда начинает выполнятся с этого метода
    */
    public static void main(String[] args) {
        int age = 35;
        char learn = 'A';
        int numberClass = 11;
        int build = 6;
        String adress = "Progressivna st number " + build;
        String fullName = "Myroshnychenko Inna";
        String sonName = "Rostik";
        int sonAge = 5;
        System.out.println("Мое полное имя: " + fullName);
        System.out.println("Мой адрес: " + adress);
        System.out.println("Мой возраст: " + age + " лет");
        System.out.println("Я училась в " + numberClass + "-" + learn+ " классе");
        System.out.println("У меня есть сын. ");
        System.out.println("Его имя " + sonName);
        System.out.println("Его возраст " + sonAge + " лет");
        System.out.println("");
        System.out.println("У меня есть кошка,");
        System.out.println("a зовут ее Картошка");


    }
}