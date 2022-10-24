import java.util.Scanner;

public class getUsername {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        String userName = SafeInput.getNonZeroLenString(pipe,"What is your name?");
        System.out.println("You entered the name  :" + userName);
    }
}
