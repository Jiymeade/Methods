import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       double price = 0;
       double total = 0;
       double end;
       boolean done = false;
       do{
           price = getRangedDouble.getRangedDouble(in,"Enter you item price :", .50 , 9.99);
           end = price + total;
           done = getYNConfirm.getYNConfirm(in,"Would you like to inter another item?");
       }while(!done);
        System.out.println("The total cost of your item is" + end);


    }
}
