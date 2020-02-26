package format;

/**
   This program demonstrates how to use the System.out.printf
   method to format a number as currency.
*/

public class CurrencyFormat
{
   public static void main(String[] args)
   {
      double monthlyPay = 5000.0;
      double annualPay = monthlyPay * 1;
      double annualPay1 = monthlyPay * 10;
      double annualPay2 = monthlyPay * 100;
      double annualPay3 = monthlyPay * 1000;
      double annualPay4 = monthlyPay * 10000;
      
      System.out.printf("Your annual pay is $%,10.1f\n", annualPay);
      System.out.printf("Your annual pay is $%,.2f\n", annualPay1);
      System.out.printf("Your annual pay is $%,.3f\n", annualPay2);
      System.out.printf("Your annual pay is $%,.4f\n", annualPay3);
      System.out.printf("Your annual pay is $%,8.5f\n", annualPay4);
      
   }
}