
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stephenlynn
 */
public class SumofNumbers {
    public static void main(String[] args) {
        String numberYouEnter = JOptionPane.showInputDialog("Please input a positive integer");

        float numberYouEnterInteger = Float.parseFloat(numberYouEnter);
        int previousNumberInLoop = 0;
        int currentSumOfNumbers = 0;
        int counter = 0;
        while (counter <= numberYouEnterInteger){
        previousNumberInLoop = currentSumOfNumbers;
        currentSumOfNumbers = counter + previousNumberInLoop; 
        counter += 1;
        
        }
        System.out.println("The total sum of all numbers leading up, and including"
                + "the number you have entered is: " + currentSumOfNumbers);
        
    }
}
