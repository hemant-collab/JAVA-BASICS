import java.util.Scanner;
public class Q4 {
 public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double radius;
    double circumference;
    double area ;
    double volume;

    System.out.println("Enter the radius of the circle");
    radius = sc.nextDouble();

    circumference = 2* Math.PI * radius ; 
    area = Math.PI * Math.pow(radius,2);
    volume = (4.0/3.0) * Math.PI *Math.pow(radius,3);

System.out.println("The circumference of the circle is " +circumference+ "cm");
System.out.println("The area of the circle is " +area+ "cm^2");
System.out.println("The volume of the circle is " +volume+ "cm^3");
sc.close();
 }
}
