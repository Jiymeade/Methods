import java.util.Scanner;

public class SafeInput {
    public static String getNonZeroLenString(Scanner pipe, String prompt) {
        String retString = "";

        do {
            System.out.println("\n" + prompt);
            retString = pipe.nextLine();
        }while(retString.length() == 0);

        return retString;

    }

    public static String getRegExString(Scanner pipe, String prompt, String regEx) {
        String retVal = "";
        boolean done = false;

        do{
            System.out.println("\n" + prompt + ": ");
            retVal = pipe.nextLine();
            if(retVal.matches(regEx)){
                done = true;
            }else{
                System.out.println("\n" + retVal + "must match the pattern" + regEx);
                System.out.println("Try again");
            }
        }while(!done);

        return retVal;
    }

}

