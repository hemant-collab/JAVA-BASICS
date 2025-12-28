public class String_methods {
    public static void main(String[] args){

        String name = "  Java Code  ";

        int length = name.length();
        System.out.printf("length of given string  is: %s\n", length);

        char letter = name.charAt(0);
        System.out.printf("The letter is: %c\n ", letter);

        int index = name.indexOf('d');
        System.out.printf("The index of given is: %d\n",index);

        int lastIndex = name.lastIndexOf("o");
        System.out.printf("Last index is : %d" , lastIndex);

        name = name.toUpperCase();
        System.out.printf("The upper case of string is :%s\n",name);

        name = name.toLowerCase();
         System.out.printf("The lower case of string is :%s\n",name);

         name = name.trim();
         System.out.printf("String after trimming the spaces is: %s\n",name);

         name = name.replace("o","a");
         System.out.printf("The string after replacing is: %s\n",name);

         if(name.isEmpty()){
            System.out.println("Your name is empty");
         }
         else{
            System.out.println("Hello " + name);
         }
         
         if(name.contains(" ")){
            System.out.println("Your name contains spaces");
         }
         else{
            System.out.println("Your nsme doesn't contains spaces");
         }

         if(name.equalsIgnoreCase("password")){
            System.out.println("Your name can't be password");
         }
         else{
            System.out.println("Hello " +name);
         }
    }
}
