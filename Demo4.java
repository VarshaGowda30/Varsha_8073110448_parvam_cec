    import java.util.Scanner;

public class Demo2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter signal color (red/yellow/green)");
        String signal = sc.nextLine();

        if (signal.equalsIgnoreCase("red")) {
            System.out.println("STOP");
        }
        else if (signal.equalsIgnoreCase("yellow")) {
            System.out.println("READY");
        }
        else if (signal.equalsIgnoreCase("green")) {
            System.out.println("GO");
        }
        else {
            System.out.println("Invalid signal");
        }
    }
}
