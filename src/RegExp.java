import java.util.Scanner;

public class RegExp {

    // Start utilities:
    Scanner scanner = new Scanner(System.in);

    // findEquation regex:
    void findEquation(String str) {

        String mUserReply;
        System.out.println("You want to RegEx " + str + " is that correct?");
        mUserReply = scanner.nextLine();
        if (mUserReply.toLowerCase().equals("yes")) {
            System.out.println("fake regex operattion was performed.  Goodbye.");
            System.exit(1);
        } else {
            System.out.println("Are you sure?");
            mUserReply = scanner.nextLine();
            if (mUserReply.toLowerCase().equals("yes")) {
                System.out.println("Ok, thank you.  Have a good day.");
                System.exit(1);
            } else {
                findEquation(str);
            }
        }

    }
}
