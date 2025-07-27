import java.util.Scanner;
class cal
{
   public static void main(String args[])
   {

      Scanner sc = new Scanner(System.in);
       boolean running = true;

        while (running)
    {
         System.out.println("Enter the first number: ");
         int a = sc.nextInt();

         System.out.println("Enter the second number: ");
         int b = sc.nextInt();

         System.out.println("Enter the  condition of number: 1 =  Addition, 2 = Subtraction, 3 = Multiplication, 4 = Division");
         int c = sc.nextInt();
        
         switch(c)
       {
            case 1:
            System.out.println("result: "+ (a+b));
            break;
            case 2:
            System.out.println("result: "+ (b-c));
            break;
            case 3:
            System.out.println("result: "+ (b*c));
            break;
            case 4:
                  if (b != 0) {
                        System.out.println("Result: " + (a / b));
                    } else {
                        System.out.println("Cannot divide by zero.");
                    }
            break;
            default:
            System.out.println("exiting...");
            running = false;
            break;
            
         }
      }
   }
 }
