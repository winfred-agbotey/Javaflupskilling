package amalitech.solution;

import java.util.Scanner;

public class FizzBuzzChallengeSolution {
    public static void main(String...args){

        Scanner scanner=new Scanner(System.in);
        //Example #1: What specific problem are in this code?
        System.out.println("Number:");
        int number=scanner.nextInt();

        if(number%5==0 && number%3==0){
            System.out.println("FizzBuzz");
        }
        else if(number%5==0){
            System.out.println("Fizz");

        }else if(number%3==0){
            System.out.println("Buzz");
        } else{
            System.out.println(number);
        }

        //Example #2: How Can we improve this code?
        //By placing most specific on top and most generic on bottom
        //This block of code has a bitof repletion?
        //Does this block of code has a flat structure without nesting? T
        //This code is cleaner and easier to read?

        System.out.println("Number:");

        int numberTwo=scanner.nextInt();
        if(numberTwo%5==0 && numberTwo%3==0){
            System.out.println("FizzBuzz");
        }else if(numberTwo%5==0){
            System.out.println("Fizz");
        }else if(numberTwo%3==0){
            System.out.println("Buzz");

        }else{
            System.out.println(numberTwo);
        }

        //Can we apply DRY- don’t repeat yourself principle??
        System.out.println("Number:");
        int numberThree=scanner.nextInt();
        String results = "";

        if(numberThree%5==0){
            results += "Fizz";
        }
        if(numberThree%3==0){
            results += "Buzz";
        }

        System.out.println(results.isEmpty() ? numberThree: results);
        scanner.close();
    }

}
