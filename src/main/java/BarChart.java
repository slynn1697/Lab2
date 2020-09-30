
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
public class BarChart {
        public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("First store's sales");
        float storeOneSales = keyboard.nextFloat();
        String storeOneString = "Store one sales: ";
        int counterOne = 100;
        while (storeOneSales >= counterOne) {
            storeOneString += "*";
            counterOne += 100;
        }

        System.out.println("Second store's sales");
        float storeTwoSales = keyboard.nextFloat();
        String storeTwoString = "Store one sales: ";
        int counterTwo = 100;
        while (storeTwoSales >= counterTwo) {
            storeTwoString += "*";
            counterTwo += 100;
        }

        System.out.println("Third store's sales");
        float storeThreeSales = keyboard.nextFloat();
        String storeThreeString = "Store one sales: ";
        int counterThree = 100;
        while (storeThreeSales >= counterThree) {
            storeThreeString += "*";
            counterThree += 100;
        }

        System.out.println("Fourth store's sales");
        float storeFourSales = keyboard.nextFloat();
        String storeFourString = "Store one sales: ";
        int counterFour = 100;
        while (storeFourSales >= counterFour) {
            storeFourString += "*";
            counterFour += 100;
        }

        System.out.println("Fifth store's sales");
        float storeFiveSales = keyboard.nextFloat();
        String storeFiveString = "Store one sales: ";
        int counterFive = 100;
        while (storeFiveSales >= counterFive) {
            storeFiveString += "*";
            counterFive += 100;
        }

        System.out.println(storeOneString);
        System.out.println(storeTwoString);
        System.out.println(storeThreeString);
        System.out.println(storeFourString);
        System.out.println(storeFiveString);

    }

}
