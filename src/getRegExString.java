import java.util.Scanner;

public class getRegExString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String prompt = "Enter your SSN";
        String ssnPattern = "\\d{3}-\\d{2}-\\d{4}";
        String SSN = getRegExString(scanner,prompt, ssnPattern);
        System.out.println("Your ssn is this: " + SSN);
        prompt = "Enter you bearcat M";
        String bearcatM = "\\d{5}";
        String mNumber = getRegExString(scanner,prompt,bearcatM);
        System.out.println("Your bearcat M is : " + mNumber);
        System.out.println("Select your options, S-Start, Q-quit");
        Scanner pipe = new Scanner(System.in);
        String option = pipe.nextLine();
        option = option.toUpperCase();
    }
        public static String getRegExString(Scanner pipe, String prompt, String regExPattern) {
        String value = "";
        boolean gotAValue = false;

            do {
                // show the prompt
                System.out.print(prompt + ": ");
                // input the data
                value = pipe.nextLine();
                // test to see if it is correct
                if (value.matches(regExPattern)) {
                    // We have a match this String passes!
                    gotAValue = true;
                } else {
                    System.out.println("\nInvalid input: " + value);
                }

            } while (!gotAValue);

            return value;
        }
    }
