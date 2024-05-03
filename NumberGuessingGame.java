import java.util.Scanner;
public class NumberGuessingGame
{
   public static void main(String args [])
   {
      Scanner scanner = new Scanner(System.in);
      int randomNumber = (int)(Math.random() * 100) + 1;
      int userGuess;
      int attempts = 0;
      System.out.println("Welcome to the Number Guessing Game! Guess a number between 1 and 100:");
      
      do
      {
         System.out.println("Enter your guess:");
         userGuess = scanner.nextInt();
         attempts++;

         if(userGuess < randomNumber)
         {
            System.out.println("Too low. Try again!");
         }
         else if(userGuess > randomNumber)
         {
            System.out.println("Too high. Try again!");
         }
         else
         {
            System.out.println("Congratulations! You guessed the correct number in" + attempts +"attempts.");
         }
      }
      while(userGuess != randomNumber);
      scanner.close();
   }
}