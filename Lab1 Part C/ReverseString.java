import java.util.Scanner;
import java.lang.StringBuilder;

public class Reverse{

     public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        System.out.println("type a sentence");
         // get what the user types
        // System.out.println(words);
        
        // String part = words.split(" ");
        // System.out.println(words);
        
        String words = input.next();
        while (words != null){
            
            for (String part : words.split(" "))   {
                System.out.print(new StringBuilder(part).reverse().toString());
            System.out.print(" ");
            }
            
         words = input.next();
            
        }

        input.close();
     }
    
}
