package dev46.sektall.practice1;

// Imports
import java.util.Scanner; // takes input from the user

public class si_calculator {
    public static void main(String[] args) {

        System.out.println("SI Calculator");

        // Algorithm fo SI Calculator
        /*
        * Rate of Interest (R) @ 15.39%
        * Time Period (T) for 5.3f years
        * Principal Amount (P) is 39931.69f
        * Simple Interest (SI) = P * T * R / 100
        * Display SI
        *
        * */

        // Process for SI Calculator with Hard-Coded Values
        // float P = 39931.69f;
        // float T = 5.3f;
        // float R = 15.39f;

        // Process for SI Calculator with User-defined Values
        float P, T, R;

        // Take Values for P, T, R form the user
        Scanner sc = new Scanner(System.in);

        System.out.print("Provide Principal Amount (P): ");
        P = sc.nextFloat();

        System.out.print("Provide Time Period (T): ");
        T = sc.nextFloat();

        System.out.print("Provide Rate of Interest (R): ");
        R = sc.nextFloat();

        // Calculate SI
        float SI = P * T * R / 100;

        // Display SI
        System.out.println("Simple Interest (SI) = " + SI);
    }
}
