/****************************************************************************
 *
 * Created on : 14 Oct. 2017
 * Created for : ICS3UR
 * Daily Assignment - Unit3-03
 * This program displays a rock, paper, scissor game
 *
 ****************************************************************************/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.*;

public class rockPaperScissor 
{

    //variable
    static int computerChoice = (int )(Math.random() * 3 + 1);
  
    public static void main(String[] args)
    {
          try 
          {
              int numberInputed;
              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));         
              System.out.println("Type '1' for rock.");
              System.out.println("Type '2' paper");
              System.out.println("Type '3' scissor");
              numberInputed = Integer.parseInt(br.readLine());
             
              if (numberInputed == 1 && computerChoice == 1)
              {
                  System.out.println("Computer chose rock");
                  System.out.println("You chose Rock");
                  System.out.println("It's a tie");
              }       
              else if (numberInputed == 1 && computerChoice == 2)
              {
                  System.out.println("Computer chose paper");
                  System.out.println("You chose Rock");
                  System.out.println("You lose!");
              }
              else if (numberInputed == 1 && computerChoice == 3)
              {
                  System.out.println("Computer chose scissor");
                  System.out.println("You chose Rock");
                  System.out.println("You win!");
              }
              else if (numberInputed == 2 && computerChoice == 1)
              {
                  System.out.println("Computer chose rock");
                  System.out.println("You chose Paper");
                  System.out.println("You win!");
              }       
              else if (numberInputed == 2 && computerChoice == 2)
              {
                  System.out.println("Computer chose paper");
                  System.out.println("You chose Paper");
                  System.out.println("It's a tie");
              }
              else if (numberInputed == 2 && computerChoice == 3)
              {
                  System.out.println("Computer chose scissor");
                  System.out.println("You chose Paper");
                  System.out.println("You lose!");
              }
              else if (numberInputed == 3 && computerChoice == 1)
              {                                                                                   
                  System.out.println("Computer chose rock");
                  System.out.println("You chose Scissor");
                  System.out.println("You lose!");
              }       
              else if (numberInputed == 3 && computerChoice == 2)
              {
                  System.out.println("Computer chose paper");
                  System.out.println("You chose Scissor");
                  System.out.println("You win!");                  
              }
              else if (numberInputed == 3 && computerChoice == 3)
              {
                  System.out.println("Computer chose scissor");
                  System.out.println("You chose Scissor");
                  System.out.println("It's a tie");
              }
           }                   
           catch(Exception nfe) 
           {
               System.err.println("Invalid input!");
            }  
       }
}
