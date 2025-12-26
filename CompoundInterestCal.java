import java.util.Scanner;

public class CompoundInterestCal {
    public static void main(String[] args){

        //Compound Interest Calculator
        Scanner scanner = new Scanner(System.in);

        double principal;
        double rate;
        int timesCompounded;
        int years;
        double amount;

        System.out.print("Enter the principal amount: ");
        principal = scanner.nextDouble();

        System.out.print("Enter the interst rate (in %): ");
        rate = scanner.nextDouble()/100;

        System.out.print("Enter the # of times compounded per year: ");
        timesCompounded = scanner.nextInt();

        System.out.print("Enter the # years: ");
        years = scanner.nextInt();

        amount = principal * Math.pow(1 + rate / timesCompounded, timesCompounded *years);

        System.out.println("The amount after " +years + " is: " + amount);


        scanner.close();
    }
}
