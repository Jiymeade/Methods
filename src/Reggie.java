import java.util.Scanner;
public class Reggie {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String prompt = "Enter your SSN";
        String ssnPattern = "\\d{3}-\\d{2}-\\d{4}";
        String SSN = getRegExString.getRegExString(scanner,prompt, ssnPattern);
        System.out.println("Your ssn is this: " + SSN);
    }
}

