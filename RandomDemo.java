import java.util.Random;
public class RandomDemo{
    public static void main(String[] args){
        Random ran= new Random();

int number1;
int number2;
int number3;

number1 = ran.nextInt(100) +1;
number2 = ran.nextInt(100) +1;
number3 =ran.nextInt(100) +1;

System.out.println(number1);
System.out.println(number2);
System.out.println(number3);
    }
}
