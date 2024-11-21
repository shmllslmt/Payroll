import java.util.Scanner;

public class Main {
    final static int RATE = 10;
    final static int WORK_WEEK = 40;
    final static double OVERTIME = 1.5;
    final static String QUIT = "ZZZ";
    static String name;
    static int hours;
    static double pay;
    static Scanner input = new Scanner(System.in);

    public static void housekeeping() {
        System.out.println("This program computes payroll based on overtime rate of " + OVERTIME + " after " + WORK_WEEK + " hours.");

        System.out.println("Enter employee name or " + QUIT + " to quit >> ");
        name = input.next();
    }
    public static void detailLoop() {
        System.out.println("Enter hours worked >>");
        hours = input.nextInt();

        if(hours > WORK_WEEK)
            pay = (WORK_WEEK * RATE) + (hours - WORK_WEEK) * RATE * OVERTIME;
        else
            pay = hours * RATE;

        System.out.println("Pay for " + name + " is RM " + pay);

        System.out.println("Enter employee name or " + QUIT + " to quit >> ");
        name = input.next();
    }
    public static void finish() {
        System.out.println("Overtime pay calculations complete");
    }

    public static void main(String[] args) {
        housekeeping();
        // while (name != QUIT)
        while (!(name.equals(QUIT))) {
            detailLoop();
        }
        finish();
    }
}