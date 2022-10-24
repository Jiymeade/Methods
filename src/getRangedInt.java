import java.util.Scanner;

public class getRangedInt {
    public static int getRangedInt(Scanner pipe, String prompt, int low, int high) {

        int retVal = 0;
        String trash = "";
        boolean done = false;
        do {
            System.out.println("\n" + prompt);
            if (pipe.hasNextInt()) {
                retVal = pipe.nextInt();
                pipe.nextLine(); //clears the input buffer
                if (retVal >= low && retVal <= high) {
                    done = true;
                } else {
                    System.out.println("\n" + "The number is out of rangle [" + low + "-" + high + "]: " + retVal);
                }

            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an interget! You entered: " + trash);
            }

        } while (!done);
        return retVal;
    }
}


