import java.util.Scanner;
import java.text.NumberFormat;

public class TestScoreApp {

    public static void main(String[] args) {
        // display operational messages
        System.out.println("Enter test scores that range from 0 to 100.");
        System.out.println("To end the program, enter 999.");
        System.out.println();  // print a blank line

        // initialize variables and create a Scanner object
        int scoreTotal = 0;
        int scoreCount = 0;
        int testScore = 0;
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int min = 999;
        int max = 0;

        // get a series of test scores from the user
        while (testScore != 999)
        {
            // get the input from the user
            System.out.print("Enter score: ");
            testScore = sc.nextInt();

            // accumulate score count and score total
            if (testScore <= 100)
            {
                scoreCount++; //3-2 #2
                scoreTotal += testScore; // 3-2 #3
                
                max = Math.max(testScore, max); //3-2 #3
                min = Math.min(testScore, min); //3-2 #4
            }
            else if (testScore != 999)
                System.out.println("Invalid entry, not counted");
        }

        // display the score count, score total, and average score
        double averageScore = (double) scoreTotal / scoreCount;
        NumberFormat number = NumberFormat.getNumberInstance();
        number.setMinimumFractionDigits(2);
        String avgScoreString = number.format(averageScore);
        String message = "\n"
                + "Score count:   " + scoreCount + "\n"
                + "Score total:   " + scoreTotal + "\n"
                + "Average score: " + averageScore + "\n"
                + "Max test score " + max + "\n"
                + "Min test score " + min + "\n";
        		
        System.out.println(message);
    }
}