package amalitech.solution;

import java.text.NumberFormat;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MortgageCalculatorSolution {
    public static void main(String[] args) {
        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENT = 100;
        int principal = 0;
        float annualInterestRate = 0;
        byte years = 0;

        Scanner scanner = new Scanner(System.in);

        principal = getPrincipal(scanner);

        annualInterestRate = getAnnualInterestRate(scanner);

        years = getYears(scanner);

        // Calculate mortgage
        double mortgage = calculateMortgage(principal, annualInterestRate, MONTHS_IN_YEAR, years,PERCENT);

        // Format and display mortgage
        String mortgageFormatted = NumberFormat.getCurrencyInstance().format(mortgage);
        System.out.println("Mortgage: " + mortgageFormatted);

        // Close the scanner
        scanner.close();
    }


    private static int getPrincipal(Scanner scanner) {
        int principal;
        while (true) {
            try {
                System.out.println("Principal (between $1,000 and $1,000,000):");
                principal = scanner.nextInt();
                if (principal >= 1000 && principal <= 1_000_000) {
                    return principal;
                } else {
                    System.out.println("Enter a value between $1,000 and $1,000,000.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear invalid input
            }
        }
    }

    private static float getAnnualInterestRate(Scanner scanner) {
        float annualInterestRate;
        while (true) {
            try {
                System.out.println("Annual Interest Rate (as a percentage):");
                annualInterestRate = scanner.nextFloat();
                if (annualInterestRate > 0) {
                    return annualInterestRate;
                } else {
                    System.out.println("Enter a positive value for the annual interest rate.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear invalid input
            }
        }
    }

    private static byte getYears(Scanner scanner) {
        byte years;
        while (true) {
            try {
                System.out.println("Period (Years):");
                years = scanner.nextByte();
                if (years > 0) {
                    return years;
                } else {
                    System.out.println("Enter a positive number of years.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric value.");
                scanner.next(); // Clear invalid input
            }
        }
    }

    private static double calculateMortgage(int principal, float annualInterestRate, byte monthsInYear, byte years, byte PERCENT) {
        float monthlyInterest = annualInterestRate / PERCENT / monthsInYear;
        int numberOfPayments = years * monthsInYear;

        return principal * (monthlyInterest * Math.pow(1 + monthlyInterest, numberOfPayments)) /
                (Math.pow(1 + monthlyInterest, numberOfPayments) - 1);
    }


}
