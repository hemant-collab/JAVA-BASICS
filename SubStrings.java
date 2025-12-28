import java.util.Scanner;
public class SubStrings {
    public static void main(String[] args){
         
        // .substring() = A method used to extract a portion of a string 
        //        string.substring(start, end)

        Scanner scanner = new Scanner(System.in);

        String email;
        String username;
        String domain;

        System.out.print("Enter your email: ");
        email = scanner.nextLine();

        if(email.contains("@")){
        username = email.substring(0,email.indexOf("@"));
        domain = email.substring(email.indexOf("@")+1);
    
        System.out.println(domain);
         System.out.println(username);
        }
else{
    System.out.println("Email must contain @");
}
        // String email = "Java123@gmail.com";
        // String username = email.substring(0,6);
        // String username = email.substring(0,email.indexOf("@"));
        // System.out.println(username);
        // String domain = email.substring(8,17);
        // String domain = email.substring(email.indexOf("@"));
        // System.out.println(domain);
        scanner.close();
    }
    
}
