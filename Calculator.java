import java.util.SCanner;
public class Calculator
{
   public static void main(String args[])
   {
      Scanner scanner = new Scanner(System.in);
      System.out.println("Welcome to the Basic Calculator!");
      System.out.println("Enter two numbers:");
      System.out.println("First number:");
      double num1 = scanner.nextDouble();
      System.out.println("Second number:");
      double num1 = scanner.nextDouble();
      System.out.println("Select operation:");
      System.out.println("1. Addition (+)");
      System.out.println("2. Subtraction (-)");
      System.out.println("3. Multiplication (*)");
      System.out.println("4. Division (/)");
      System.out.println("Enter your choice (1, 2, 3, or 4):");
      int choice =scanner.nextInt();
      double result = 0;
      switch(choice)
      {  
         case 1:
             result = num1 + num2;
             break;
         case 2:
             result = num1 - num2;
             break;
         case 3:
             result = num1 * num2;
             break;
         case 4:
             if(num2 != 0)
             {
                result = num1/num2;
             }
             else
             {
                System.out.println("Error:Division by zero!");
                return;
             }
             break;
        default:
             System.out.println("Invalid choice!");
             return;
     }
     System.out.println("Result:"+result);
     scanner.close();
  }
}   