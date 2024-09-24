public class Main {
    public static void main(String[] args)
    {
        double initialBalance = 5000;
        double interestRate = 0.17;
        double balanceAfterOneMonth;
        double balanceAfterTwoMonths;
        System.out.println("The initial balance is " + initialBalance);
        System.out.println("The monthly interest rate is 17%");
        balanceAfterOneMonth = initialBalance * interestRate + initialBalance;
        System.out.println("The balance after one month is " + balanceAfterOneMonth);
        balanceAfterTwoMonths = balanceAfterOneMonth * interestRate + balanceAfterOneMonth;
        System.out.println("The balance after two months is " + balanceAfterTwoMonths);
    }
}