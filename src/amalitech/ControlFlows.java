package amalitech;

/**
 * Key Things To Know at Foundational Core Java Level:
 * 1. Comparison Operators
 * 2. Logical Operators
 * 3. Conditional Statement
 * 4. Loops
 */
public class ControlFlows {

    public static void main(String... args) {
        //Slide #20:Let's dive into Conditional Operators
        //Bolean operation & inequality operation
        //Are we comparing x & y here?
        int x = 1;
        int y = 1;
        System.out.println(x == y);

        //Are we comparing x & y here?
        System.out.println(x != y);
        System.out.println(x < y);

        //Slide #21:Logical Operators
        int a = 1;
        int b = 2;
        System.out.println(!(a <= b));

        int temperature = 12;
        boolean isWarm = temperature > 20 && temperature < 30;
        System.out.println(!(isWarm));

        boolean hasHighIncome = false;
        boolean hasGoodCredit = true;
//        boolean isEligible= hasHighIncome || hasGoodCredit;

        //Let's add another variable: hasCriminalRecord
        boolean hasCriminalRecord = false;
        boolean isEligible = (hasHighIncome || hasGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);


        //Slide #22:If Statement
        /**
         * Pseudocode - Algorithm -Problem Solving
         * 1. If temp is greater than 30
         * it's a hot day
         * Drink plenty of water
         * Otherwise, if it's been 20 and 30
         * It's a nice day
         * Otherwise
         * It's cold
         * */
        int temp = 30;
        checkTemperature(temp);

        //Slide #23:Simplifying If Statement
        //Any observed Error - Declaration is not Allowed under a function?
        // How Can we Improve the code as Professional Developer??
        //Add an initial value

        boolean hasHigherIncome = simplifyIf();

        System.out.println(hasHigherIncome);

        //Can we improve the code using ternary operation??
        //Example:#1
        int incomeTwo = 120_000;
        String className = ternaryEx1(incomeTwo);
        System.out.println(className);

        //Example:#1
        int incomeThree = 120_000;
        String classNameThree = ternaryEx2(incomeThree);
        System.out.println(classNameThree);


        //Example:#3
        int incomeFour = 120_000;
        String classNameFour = ternaryEx3(incomeFour);
        System.out.println(classNameFour);


        //Slide #24:Switch Statement
        String role = "Admin";
        //Example #1:
        switchStatementEX1(role);

        //Example #2:
        switchStatementEX2(role);
    }

    public static boolean simplifyIf(){
        int income = 120_000;
        return income > 100_000;
    }
    public static void checkTemperature(int temp){
        if (temp > 30) {
            System.out.println("It's a hot day");
            System.out.println("Drink Water");
            //We can remove : && temp<=30
        } else if (temp >= 20) {
            System.out.println("Beautiful Day");
        } else {
            System.out.println("Cold Day");
        }
    }

    public static String ternaryEx1(int incomeTwo) {
        return incomeTwo > 100_000 ? "First":"Economy";
    }

    public static String ternaryEx2(int incomeThree) {
        String classNameTwo = "Economy";
        return incomeThree > 100_000 ? "First" : classNameTwo;
    }

    public static String ternaryEx3(int incomeFour) {
        return incomeFour > 100_000 ? "First" : "Economy";
    }

    public static void switchStatementEX1(String role) {
        switch (role) {
            case "Admin" -> System.out.println("You're an Admin");
            case "Moderator" -> System.out.println("You're a Moderator");
            default -> System.out.println("You're a guest");
        }
    }

    public static void switchStatementEX2(String role) {
        switch (role) {
            case "Admin" -> System.out.println("You're an Admin");
            case "Moderator" -> System.out.println("You're a Moderator");
            default -> System.out.println("You're a guest");
        }
    }
}
