import java.util.Scanner;
public class Q2 {
    public static void main(String[] args){
//Shopping cart program
        String item;
        double price;
        int quantity;
        double total;

        Scanner sc =  new Scanner(System.in);

        System.out.println("WHat item do you like to buy? ");
        item  = sc.nextLine();

        System.out.println("What is the price of each "+item + "?");
        price = sc.nextDouble();

        System.out.println("How many " +item+ " do you want to buy?");
        quantity =  sc.nextInt();

        total = price*quantity;

        System.out.println("You have bought " +quantity+ " " +item+ " at a price of " +price+  " each.");
        System.out.println("Your total is: " +total);
        
sc.close();
    }

}