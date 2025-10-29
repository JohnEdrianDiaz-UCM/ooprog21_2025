import java.util.*;

class BankBalanceByRateAndYear {
    public static void main(String[] args){
        Scanner inpot = new Scanner(System.in);

        System.out.print("Enter initial bank balance > ");
        double balance = inpot.nextDouble();

        double rate = 0.02;
        double originalBalnce = balance;

          for(int i = 1; i <= 4; i++){
            System.out.println("\nWith an initial balance of $" + balance + ", at an interest rate of " + rate);
            for (int x = 1; x <= 4; x++){
                balance += balance * rate;
                System.out.println("  After year " + x + ", the balance is $" + balance);
            }
            rate += 0.01;
            balance = originalBalnce;
        }
    }
}
