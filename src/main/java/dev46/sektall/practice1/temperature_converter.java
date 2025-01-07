package dev46.sektall.practice1;

// Imports
import java.util.Scanner;

public class temperature_converter {
    public static void main(String[] args) {

        System.out.println("Temperature Converter");

        // Relation among Celsius (°C), Fahrenheit(°F) & Kelvin(K)
        /*
        * Fahrenheit To Celsius:    C = (F - 32) * 5 / 9 °C
        * Celsius To Fahrenheit:    F = ((9 * C / 5) + 32) °F
        * Celsius To Kelvin:        K = C + 273.15f K
        * Kelvin To Celsius:        C = K - 273.15f °C
        * Fahrenheit To Kelvin:     K = (((F - 32) * 5 / 9) + 273.15f) K
        * Kelvin TO Fahrenheit:     F = (((K - 273.15f) * 9 / 5) + 32) °F
        *
        * */

        // Relationship for Temperature Difference
        /*
        * 1°C = 1K (a difference of 1°C is the same as a difference of 1 K)
        * 1°C = 9/5 °F
        * 1°F = 5/9 °C
        * Thus, 180°F = 100°C = 100K
        *
        * */

        // Algorithm for Temperature Converter
        /*
        * Celsius (C) @ 36.9f °C
        * Fahrenheit (F) @ 96.7f °F
        * Kelvin (K) @ 321.49f K
        * Fahrenheit To Celsius (FC), C = (F - 32) * 5 / 9
        * Celsius To Fahrenheit (CF), F = ((9 * C / 5) + 32)
        * Kelvin To Celsius (KC), C = K - 273.15f
        * Celsius To Kelvin (CK), K = C + 273.15f
        * Kelvin To Fahrenheit (KF), F = (((K - 273.15f) * 9 / 5) + 32)
        * Fahrenheit To Kelvin (FK), K = (((F - 32) * 5 / 9) + 273.15f)
        * Display (FC=C), (CF=F), (KC=C), (CK=K), (KF=F), (FK=K)
        *
        * */

        // Process for Temperature Converter with Hard-Coded Values (C, F, C, K, F, K)
        // Defining Variables (C, F, K)
        float C, F, K;

        // Initialization (C, F, K)
        // C = 36.9f;
        // F = 96.7f;
        // K = 321.49f;

        // Process for Temperature Converter with User-defined Values
        Scanner sc = new Scanner(System.in);

        // Takes data from the user
        System.out.print("Enter the temperature in C ");
        C = sc.nextFloat();

        System.out.print("Enter the temperature in F ");
        F = sc.nextFloat();

        System.out.print("Enter the temperature in K ");
        K = sc.nextFloat();


        /* Convert Temperature (C, F, C, K, F, K) */
        // Fahrenheit To Celsius (FC), C = (F - 32) * 5 / 9
        float FC = (F - 32) * 5 / 9;

        // Convert Celsius To Fahrenheit (CF), F = ((9 * C / 5) + 32)
        float CF = ((9 * C / 5) + 32);

        // Convert Kelvin To Celsius (KC), C = K - 273.15f
        float KC = K - 273.15f;

        // Convert Celsius To Kelvin (CK), K = C + 273.15f
        float CK = C + 273.15f;

        // Convert Kelvin To Fahrenheit (KF), F = (((K - 273.15f) * 9 / 5) + 32)
        float KF = (((K - 273.15f) * 9 / 5) + 32);

        // Convert Fahrenheit To Kelvin (FK), K = (((F - 32) * 5 / 9) + 273.15f)
        float FK = (((F - 32) * 5 / 9) + 273.15f);
        /* Stop Convert Temperature (C, F, C, K, F, K) */


        /* Display Temperature (C, F, C, K, F, K) */
        System.out.println(" ");
        // Display (FC=C)
        System.out.println("Fahrenheit To Celsius, C = " + FC + "C" + " For " + F + "F");

        // Display (CF=F)
        System.out.println("Celsius To Fahrenheit, F = " + CF + "F " + " For " + C + "C");

        // Display (KC=C)
        System.out.println("Kelvin To Celsius, C = " + KC + "C " + " For " + K + "K");

        // Display (CK=K)
        System.out.println("Celsius To Kelvin, K = " + CK + "K " + " For " + C + "C");

        // Display (KF=F)
        System.out.println("Kelvin To Fahrenheit, F = " + KF + "F " + " For " + K + "K");

        // Display (FK=K)
        System.out.println("Fahrenheit To Kelvin, K = " + FK + "K " + " For " + F + "F");
        /* Stop Display Temperature (C, F, C, K, F, K) */
    }
}
