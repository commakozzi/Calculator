import java.util.Scanner;

public class MainActivity {
    public static void main(String[] args) {

        // Members:
        String mUserCalc;
        String mUserReply;

        // Start utilities:
        Scanner scanner = new Scanner(System.in);
        RegExp regExp = new RegExp();

        // Get calculation from user and confirm:
        System.out.println("Enter your calculation:");
        mUserCalc = scanner.nextLine();
        System.out.println("You entered " + mUserCalc + " is that correct?");
        mUserReply = scanner.nextLine();

        // Send equation to RegExp to find equation:
        if (mUserReply.toLowerCase().equals("yes")) {
            regExp.findEquation(mUserCalc);
        } else {
            System.out.println("Ok, program ending");
            System.exit(1);
        }

        // Empty for loop to keep program running:
        for(;;) {
        }

    }
}
