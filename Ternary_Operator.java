
public class Ternary_Operator {
    public static void main(String [] args){

        // ternary operator ? = Return 1 of 2 values if a condition is true

        // variable = (condition) ? ifTrue : ifFalse;

        int hours = 20;
        String timeOfDay = (hours <12)? "A.M." : "P.M.";
        System.out.println("Time of day: " + timeOfDay);

        int income = 80000;
        double taxRate = (income < 50000) ? 0.25 : 0.35;
        System.out.println("Tax Rate: " + taxRate);

        }
}
