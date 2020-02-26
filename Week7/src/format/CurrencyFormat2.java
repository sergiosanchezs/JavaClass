package format;

import javax.swing.JOptionPane;

/**
   This program demonstrates how to use the String.format
   method to format a number as currency.
*/

public class CurrencyFormat2
{
   public static void main(String[] args)
   {
      double monthlyPay = 5023.43;
      double annualPay = monthlyPay * 12;
      String output = String.format("Your annual pay is $%,.2f\n", annualPay);
      JOptionPane.showMessageDialog(null, output);
      System.out.println(output);
   }
}