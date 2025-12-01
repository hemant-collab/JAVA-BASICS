import java.util.Scanner;
public class ifelse {
    public static void main(String[] args) {
        Scanner scan =  new Scanner(System.in);
        String name;
        int age;
        boolean isStudent;
        System.out.println("Enter your name: ");
        name =  scan.nextLine();

        System.out.println("Enter your age ");
        age =  scan.nextInt();

        System.out.println("Are you a Student (true/false): ");
        isStudent = scan.nextBoolean();

//Group 2 for name 
if(name.isEmpty()){
    System.out.println("You didn't enter your name");
}
else{
    System.out.println("Hello " +name);
}

//Group 1 for age
        if(age>=65){
            System.out.println("You are senior citizen");   
        }
        else if(age>=18){
            System.out.println("You are an adult ");
        }
        else if(age>=13){
            System.out.println("You are a teenager");
        }
        else{
            System.out.println("You are a child");
        }
        // System.out.println("You name is " +name+ " and your age is " +age);
        //Group 3 for student status
        if(isStudent){
            System.out.println("You are a student");
        }
        else{
            System.out.println("You are not a student ");
        }
        
        scan.close();
    
    }
    
}
