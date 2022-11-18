package Task1;

public class nd {
    public static void main(String[] args) {
        double salary = 1700;
        if (!(salary > 0)) {
            System.out.println("начение должно быть больше нуля");
        } else {
            if (salary > 500 && salary < 1500) {
                System.out.println("You JUNIOR");
            } else if (salary > 1500 && salary < 2500) {
                System.out.println("You MIDDLE");
            }
        }


    }


}
