import java.util.Scanner;

public class getYNConfirm {
    public static boolean getYNConfirm(Scanner pipe, String prompt) {
        boolean done = false;
        String userResp;
        System.out.println(prompt + "[Y or N]: ");
        do {
            userResp = pipe.nextLine();
            if (userResp.equalsIgnoreCase("Y")) {
                done = false;
            } else {
                if (userResp.equalsIgnoreCase("N")) {
                    done = true;
                } else {
                    System.out.println("Invalid option :Y or N");
                }
            }
        }while (!done) ;
        return true;
    }
}