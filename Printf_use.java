public class Printf_use {
public static void main(String[] args){
    //printf() = is a method used to format output

    // %[flags][width][.precision][specifier-character]

    String name = "Hello";
    char firstletter = 'H';
    int age = 43;
    double height = 60.3;
    boolean isEmployed = true;
    //For Precision
    double price1 = 9.99;
    double price2 = 100000.15;
    double price3 = -54.01;

    System.out.printf("%.1f\n",price1);
System.out.printf("%.2f\n",price2);
System.out.printf("%.3f\n",price3);
//Flags
// + = output a plus
// , = comma grouping separator 
// ( = negative numbers are enclosed in ()
// space = display a minus if negative, space if positive

System.out.printf("%+.1f\n",price1);
System.out.printf("%,.3f\n",price2);
System.out.printf("%(.1f\n",price3);

//width/padding
// 0 = zero padding
// number = right justified padding
// negative number = left justified padding

System.out.printf("%09.2f\n",price1);
System.out.printf("%10.2f\n",price2);
System.out.printf("%-10.2f\n",price3);
    System.out.printf("Hii %s\n", name);
    System.out.printf("Your name starts with  %c\n", firstletter);
    System.out.printf("Your age is %d\n", age);
    System.out.printf("Your height is %.2f\n", height);
System.out.printf( "Are you employed? %b\n", isEmployed);
System.out.printf("%s is %d years old",name ,age);
}
}
