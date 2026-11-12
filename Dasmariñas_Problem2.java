/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dasmariñas_problem2;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Dasmariñas_Problem2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("---Greatest Common Divisor---");
        System.out.print("Input first non-negative integer: ");
        int a = input.nextInt();
        System.out.print("Input second non-negative integer: ");
        int b = input.nextInt();
        if (a < 0 || b < 0) {
            System.out.println("Invalid number. The number must be non-negative.");
        } else if (a == 0 && b == 0) {
            System.out.println("Greatest Common Divisor: Undefined");
        } else {
            int gCD = gcd(a, b);
            if (gCD == 0) {
                System.out.println("Greatest Common Divisor: " + gCD);
            } else {
                System.out.println("Greatest Common Divisor: " + gCD);
            }
        }
    }
    
    public static int gcd(int a, int b) {
        //Base case
        if (b == 0) {
            return a;
        }
        //Recursive case
        return gcd(b, a % b);
    }
}
