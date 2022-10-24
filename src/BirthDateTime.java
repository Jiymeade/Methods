import java.util.Scanner;

public class BirthDateTime {
    public static void main(String[] args) {
        Scanner pipe = new Scanner(System.in);

        System.out.println("Select your options, S-Start, Q-quit");
        String option = pipe.nextLine();
        option = option.toUpperCase();
        switch(option){

            case"S":
                year();
                month();
                day();
                hour();
                Minute();
                break;
            default:
                System.out.println("Invalid Input");
            case"Q":
                quit();
                break;
        }

        }
    public static void year() {
        Scanner pipe = new Scanner(System.in);
        int year = getRangedInt.getRangedInt(pipe, "What is your birth year?", 1950, 2010);
    } public static void month() {
        Scanner pipe = new Scanner(System.in);
        int year = getRangedInt.getRangedInt(pipe, "What is your birth month?", 1, 12);
    }public static void day() {
        Scanner pipe = new Scanner(System.in);
        int day = getRangedInt.getRangedInt(pipe,"What day where you born?",1,31);
    }private static void Minute() {
        Scanner pipe = new Scanner(System.in);
        int Minute = getRangedInt.getRangedInt(pipe, "What is the minute you where born?", 1, 59);
    }private static void hour() {
        Scanner pipe = new Scanner(System.in);
        int hour = getRangedInt.getRangedInt(pipe, "What hour where you born?", 1, 24);
    }
    private static void quit() {
        System.out.println("Goodbye");
        System.exit(0);
    }

}