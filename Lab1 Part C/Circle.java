import java.util.Scanner;
import java.lang.Math;
public class round{



    public static void main(String args[]){
        Scanner circle = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter the radius: ");
        int number = circle.nextInt(); // Scans the next token of the input as an int.
        System.out.println(number);
        
        //once finished
        
        double area = Math.PI * Math.pow(number,2);
        
        double circum = 2* (Math.PI) * number;
       

        double a = area;
        double c = circum;
        double roundOff = Math.round(a*100.0)/100.0;
        double roundOff2 = Math.round(c*100.0)/100.0;
    
        System.out.println("Area is " + roundOff);
        System.out.println("Circumference  is " + roundOff2);
        
        circle.close();
    }
}
