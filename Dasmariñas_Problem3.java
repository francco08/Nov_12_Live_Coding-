/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dasmariñas_problem3;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Dasmariñas_Problem3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("---Recursive Array Analysis---");
        System.out.print("Input number of values: ");
        int amountOfValues = input.nextInt();
        if (amountOfValues <= 0) {
            System.out.println("Invalid number of values.");
        } else {
            int[] values = new int[amountOfValues];
            System.out.println("Enter " + amountOfValues + " values:");
            for (int i = 0; i < amountOfValues; i++) {
                System.out.print("Value " + (i + 1) + ": ");
                values[i] = input.nextInt();
            }
            int index = values.length;
            System.out.println("Sum: " + arraySum(values, index));
            System.out.println("Maximum: " + findMaximum(values, index));
            System.out.println("Even count: " + countEven(values, index));
        }
    }
    
    public static int arraySum(int[] values, int index) {
        //Base case
        if (index <= 0) {
            return 0;
        }
        //Recursive case
        return (values[index - 1] + arraySum(values, index - 1));
    }
    
    public static int findMaximum(int[] values, int index) {
        // Base case
        if (index == 1) {
            return values[0];
        }
        // Recursive case
        int maximum = findMaximum(values, index - 1);
        if (values[index - 1] > maximum) {
            return values[index - 1];
        } else {
            return maximum;
        }
    }
    
    public static int countEven(int[] values, int index) {
        //Base case
        if (index <= 0) {
            return 0;
        }
        //Recursive case
        if (values[index - 1] % 2 == 0) {
            return (1 + countEven(values, index - 1));
        } else {
            return countEven(values, index - 1);
        }
    }
}