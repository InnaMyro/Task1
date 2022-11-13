package Task2;

public class Task02 {
    public static void main(String[] args) {
        int n = 526;
        int firstNumber = n / 100;
        int secondNumber = (n % 100) /10;
        int thirdNumber = n % 10;

        System.out.println("сумма цифр числа " + n + " равно " + (firstNumber + secondNumber + thirdNumber));





    }
}
