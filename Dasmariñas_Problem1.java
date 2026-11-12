/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livecoding;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Dasmariñas_Problem1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("---Sum of Digits---");
        System.out.print("Input non-negative integer: ");
        int number = input.nextInt();
        int sum = sumOfDigits(number);
        if (sum == -1) {
            System.out.println("Invalid number. The number must be non-negative.");
        } else if (sum == 0) {
            System.out.println("Sum of digits: " + sum);
        } else {
            System.out.println("Sum of digits: " + sum);
        }
    }
    
    public static int sumOfDigits(int number) {
        //Base case #1
        if (number < 0) {
            return -1;
        }
        //Base case #2
        if (number == 0) {
            return 0;
        }
        //Recursive case
        return (number % 10) + sumOfDigits(number / 10);
    }
}
