import java.util.Scanner;
public class Q3 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
double a;
double b; 
double c;

System.out.println("Enter the length of a:");
a = sc.nextDouble();
System.out.println("Enter the length of b :");
b = sc.nextDouble();
c = Math.sqrt(Math.pow(a,2.0)+ Math.pow(b,2.0));
System.out.println("The length of the hypotenuse is : " +c);
sc.close();

    }

}
