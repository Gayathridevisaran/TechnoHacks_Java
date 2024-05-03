import java.util.Scanner;
public class RockPaperScissors
{
   public static void main(String args [])
   {
      Scanner scanner = new Scanner(System.in);
      String [] options = {"rock","paper","scissors"};
      System.out.println("Welcome to Rock, Paper, Scissors!");
      while(true)
      {
         System.out.println("Enter your choice(rock,paper,or scissors):");
         String userChoice = scanner.next().toLowerCase();
         int computerChoiceIndex = (int)(Math.random() * 3);
         String computerChoice = options[computerChoiceIndex];
         if(userChoice.equals(computerChoice))
         {
            System.out.println("It's a tie!");
         }
         else if((userChoice.equals("rock")&&computerChoice.equals("scissors")) || (userChoice.equals("paper")&&computerChoice.equals("rock")) || (userChoice.equals("scissors")&&computerChoice.equals("paper")))
         {
            System.out.println("You win! Computer chose" + computerChoice +".");
         }
         else
         {
            Sysytem.out.println("You lose! Computer chose" + computerChoice +".");
         }
         System.out.println("Do you want to play again? (yes/no):");
         String playAgain = scanner.next().toLowerCase();
         if(!playAgain.equals("yes"))
         {
            break;
         }
      }
      scanner.close();
   }
}