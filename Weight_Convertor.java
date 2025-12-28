import java.util.Scanner;
public class Weight_Convertor {
    public static void main(String[] args){

        // WEIGHT CONVERSION PROGRAM

        Scanner scanner = new Scanner(System.in);

        double weight;
        double newWeight;
        int choice;

        System.out.println("Weight Conversion Program");
        System.out.println("1: Convert gram to kgs");
        System.out.println("2: Convert kgs to grams");

         System.out.print("Choose an option (1 OR 2) : ");
         choice = scanner.nextInt();

         if(choice == 1){
            System.out.print("Enter the weight in grams : ");
            weight = scanner.nextInt();
            newWeight = weight / 1000;
            System.out.println("The new weight in kgs is: " + newWeight  + " kgs");
         }
         if(choice == 2) {
            System.out.print("Enter the weight in Kilograms :");
            weight = scanner.nextInt();
            newWeight = weight *1000;
            System.out.println("The new weight in grams is: " + newWeight + " grams");
         }
         else{
            System.out.println("You Enter an Invalid Option");
         }
         scanner.close();
    }
}
