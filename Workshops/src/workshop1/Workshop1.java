/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package workshop1;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Sergio Sanchez
 */
public class Workshop1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner keyboard = new Scanner(System.in);
         // ============== Desicion Structures ======================
        // 1) Single Decision structure if
        // 2) Dual alternative decision structures if-else
        // 3) Nested decision structures if-else-then
        // ============== function ======================
        // 3 int as input
        // sum()  ---> result in int form
        // avg () ---> result in double form [ you have call the sum() here ]
        // the_biggest() ---> return the bigest of 3
//        System.out.println("Please enter 3 integers: ");
//        int a = keyboard.nextInt();
//        int b = keyboard.nextInt();
//        int c = keyboard.nextInt();
//        System.out.println("The sum is " + summ(a,b,c));
//        System.out.println("The average is " + avg(a,b,c));
//        System.out.println("The biggest number is " + theBiggest(a,b,c));
        
        // ==================== Create a game ===========================
        /*
        1) ask the user to guess a number b/w 1-100
        2) generate a ramdom int b/w 1 to 100
            input_num > guess_num : Display "guess something smaller"
        3) if input_num
        
        */
        
        Random rand = new Random();
        int input_guess, rand_guess, counter;
        String answer;
        
        
        do {
            rand_guess = rand.nextInt(100) + 1;
            System.out.println("Enter a number b/w 1 to 100 ");
            input_guess = keyboard.nextInt();
            counter = 1;
            while (input_guess != rand_guess) {
                
                if (input_guess > rand_guess){
                    System.out.println("Guess something smaller");
                }
                else{
                    System.out.println("Guess something greater");
                }
                counter++;
                System.out.println("guess again from 1 to 100 ");
                input_guess = keyboard.nextInt();
            }
            
            System.out.printf("Game is over it only took you %d" 
                                + " time to guess.\n", counter);
            
            System.out.println("would you like to play again? ");
            answer = keyboard.next();
            
            if (answer.charAt(0) != 'y'){
                break;
            }

            
        }while (true);
        
        
        
        
        
        //============== Panels =======================
//        String namePanel = JOptionPane.showInputDialog(null, "Whats your name?");
//        
//        int age2 = Integer.parseInt(JOptionPane.showInputDialog(null, "How old are you?"));
//        
//        JOptionPane.showMessageDialog(null, "Your name is " + namePanel 
//                + " and you are " + age2 + " years old" );
        // parse()
        // any variable in Java has its own class!
        // int ----- Integer
        //Integer.parseInt(age2);
        
        
        
//        System.out.println("This is Sergio Sanchez");
//        System.out.print("This is one line\n");
//        System.out.print("This is another line\n");
        
        // have input through console?
        // import Scanner
        // create object out of scanner
        // collect your input
        
        // prompt = message you show to the user!
//        System.out.println("Enter your name");
//        String name = keyboard.next();
//        System.out.println("Your name is " + name);
//        System.out.println("How old are you?");
//        int age = keyboard.nextInt();
//        System.out.println("You are + age" + age + " years old");
        
        
       
        
        
        
        
        System.exit(0);
        
        
        
    }
    
    public static int summ(int a, int b, int c) {
        return a + b + c;
    }
    
    public static double avg(int a, int b, int c){
        int dummy = 3;
        return (double)summ(a, b, c)/dummy;
    }
    
    public static int theBiggest(int a, int b, int c) {
        int biggest;
        if (a > b && a > c ) {
            biggest = a;
        } else if (b > a && b > c){
            biggest = b;
        } else {
            biggest = c;
        }
        return biggest;
    }
    
}
