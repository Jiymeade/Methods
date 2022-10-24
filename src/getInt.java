import java.util.Scanner;

public class getInt {
    public static int getInt(Scanner pipe, String prompt) {
        String trash = "";
        boolean done = false;
        int Value = 0;

        do{
            System.out.println("\n" + prompt);
            if(pipe.hasNextInt()){
                Value = pipe.nextInt();
                pipe.nextLine(); //clears the input buffer
                done = true;

            }else{
                trash = pipe.nextLine();
                System.out.println("You must enter an interget! You entered: " + trash);
            }

        }while(!done);
        return Value;
    }
}
