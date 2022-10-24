import java.util.Scanner;
public class getDouble {
    public static Double getDouble (Scanner pipe, String prompt) {
        String trash = "";
        boolean done = false;
        Double Val = null;

        do{

            System.out.println("\n" + prompt);
            if(pipe.hasNextDouble()){
                Val = pipe.nextDouble();
                pipe.nextLine(); //clears the input buffer
                done = true;

            }else{
                trash = pipe.nextLine();
                System.out.println("You must enter an interget! You entered: " + trash);
            }

        }while(!done);
        return Val;
    }
}

