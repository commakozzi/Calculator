import java.util.Scanner;

public class MainActivity {
    public static void main(String[] args) {

        // Members:
        String mUserCalc;
        String mUserReply = "";

        // Load utilities:
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        // Get calculation from user and confirm:
        System.out.println("Enter your calculation:");
        mUserCalc = scanner.nextLine();

        // Send equation to RegExp to find equation:
        if (mUserReply != null) {
            calculator.calculate(mUserCalc);
        } else {
            System.out.println("You didn't enter a valid calculation.  Goodbye.");
            System.exit(1);
        }

    }
}
