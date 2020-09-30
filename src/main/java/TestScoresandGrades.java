
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephenlynn
 */
public class TestScoresandGrades {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("Please input your first test score.");

        
        float firstTestScore = keyboard.nextFloat();
        System.out.println("Please input your second test score.");
        float secondTestScore = keyboard.nextFloat();
        System.out.println("Please input your third test score.");
        float thirdTestScore = keyboard.nextFloat();
        float testScoreAverages;
        try {
            testScoreAverages = (firstTestScore + secondTestScore + thirdTestScore) / 3;
            if (testScoreAverages >= 90 && testScoreAverages <= 100) {
                System.out.println("Your test score average is: " + testScoreAverages + "You earned an A");
            }
            if (testScoreAverages >= 80 && testScoreAverages <= 89) {
                System.out.println("Your test score average is: " + testScoreAverages + " You earned a B");
            }
            if (testScoreAverages >= 70 && testScoreAverages <= 79) {
                System.out.println("Your test score average is: " + testScoreAverages + " You earned a C");
            }
            if (testScoreAverages >= 60 && testScoreAverages <= 69) {
                System.out.println("Your test score average is: " + testScoreAverages + " You earned a D");
            }
            if (testScoreAverages < 60) {
                System.out.println("Your test score average is: " + testScoreAverages + " You earned and F");
            }
        } catch (Exception x) {
            System.out.println("Please input a valid test score ");
        }
    }
}
