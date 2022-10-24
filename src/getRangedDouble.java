import java.util.Scanner;

public class getRangedDouble {
    public static double getRangedDouble (Scanner pipe, String prompt, double low, double high) {
        Double Value = null;
        String trash = "";
        boolean done = false;
        do {
            System.out.println("\n" + prompt);
            if(pipe.hasNextDouble()){
                Value = pipe.nextDouble();
                pipe.nextLine();
                if (Value >= low && Value <= high) {
                    done = true;
                } else {
                    System.out.println("\n" + "The number is out of rangle [" + low + "-" + high + "]: " + Value);
                }
            } else {
                trash = pipe.nextLine();
                System.out.println("You must enter an Number! You entered: " + trash);
            }

        } while (!done);

        return 0;
    }
}
