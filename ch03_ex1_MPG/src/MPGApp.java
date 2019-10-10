import java.util.Scanner;
import java.text.NumberFormat;
import java.math.BigDecimal;
import java.math.RoundingMode;

public class MPGApp {

    public static void main(String[] args) {
        System.out.println("Welcome to the Miles Per Gallon calculator");
        System.out.println();  // print a blank line
        
        @SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
        
        
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
            System.out.print("Enter miles driven: ");
            double miles = sc.nextDouble();
            
            System.out.print("Enter gallons of gas used: ");
            double gallons = sc.nextDouble();
            BigDecimal milesbd = new BigDecimal(miles);
            BigDecimal gallonsbd = new BigDecimal(gallons);
            
            
          // switching to big decimal for #8 (uncomment for prior answers)  double mpg = miles/gallons;
         //#3-1 #3  mpg = (int) Math.round(mpg);
         // 3-1 #5  mpg = (double) Math.round(mpg * 100)/100;
         /* #6 and #7   NumberFormat number = NumberFormat.getNumberInstance();
          * number.setMaximumFractionDigits(2);
           * String mpgString = number.format(mpg);*/
            
            BigDecimal mpg = milesbd.divide(gallonsbd, 2, RoundingMode.HALF_UP);
            System.out.println("Miles per gallon is " + mpg + ".");
            System.out.println(); 
            
            
            System.out.print("Calculate another MPG? (y/n): ");
            choice = sc.next();
            System.out.println();
        }
    }
    
}
