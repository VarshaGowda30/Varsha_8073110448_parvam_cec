import java.util.Scanner;

public class Demo5{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter day number (1-7): ");
        int day = sc.nextInt();

        switch (day) {

            case 1:
                System.out.println("Monday");
                System.out.println("Weekday: Time to work.");
                break;

            case 2:
                System.out.println("Tuesday");
                System.out.println("Weekday: Staying productive.");
                break;

            case 3:
                System.out.println("Wednesday");
                System.out.println("Weekday: Midweek check-in.");
                break;

            case 4:
                System.out.println("Thursday");
                System.out.println("Weekday: Weekend is approaching.");
                break;

            case 5:
                System.out.println("Friday");
                System.out.println("Weekday: Last workday of the week.");
                break;

            case 6:
            case 7:
                System.out.println("Weekend");
                System.out.println("Time to relax.");
                break;

            default:
                System.out.println("Invalid input! Enter 1 to 7.");
        }
    }
}