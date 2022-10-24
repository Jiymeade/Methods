import java.util.Scanner;

public class FavNumber {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);
        int faveInterger = getInt.getInt(pipe,"What is your favorite Interger?");
        System.out.println("Your favorite interger is :" + faveInterger);

        double faveD = getDouble.getDouble(pipe,"What is you favorite double?");
        System.out.println("Your favorite double is :" + faveD);

    }
}
