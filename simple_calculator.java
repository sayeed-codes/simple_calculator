
import java.util.Scanner;

/**
 *
 * @author sayeed-codes
 */
public class simple_calculator {
    public static void main(String[] args) {
        sum();
    }
    
    public static void sum (){
        Scanner sc = new Scanner (System.in);
        int num1 , num2 ; 
        
        System.out.println(" ");
        System.out.println("-------- simple calculator --------");
                
        System.out.println(" ");
        
        System.out.println("1. Addition       | +");
        System.out.println("2. Subtraction    | -");
        System.out.println("3. Multiplication | *");
        System.out.println("4. Division       | /");
        System.out.println("5. Exit.");
        System.out.print("Enter operator menu number 1-5(ex 4) : ");
        int operator = sc.nextInt();
            int result ;
            switch (operator){
                case 1 :
                    System.out.println("");
                    System.out.println("-------- Calculation of two numbers --------"); 
                    System.out.println("");
                    System.out.print("Enter first number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextInt();

                    result = num1 + num2;
                    
                    System.out.println(" ");
                    System.out.println("summation is: "+result);
                    System.out.println(" ");
                    System.out.println("----------------------------------------------");
                    sum();
                    break;

                case 2 :
                    System.out.println("");
                    System.out.println("-------- Calculation of two numbers --------"); 
                    System.out.println("");
                    System.out.print("Enter first number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextInt();

                    result = num1 - num2;
                    
                    System.out.println(" ");
                    System.out.println("summation is: "+result);
                    System.out.println(" ");
                    System.out.println("----------------------------------------------");
                    sum();
                    break;

                case 3 :
                    System.out.println("");
                    System.out.println("-------- Calculation of two numbers --------"); 
                    System.out.println("");
                    System.out.print("Enter first number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextInt();

                    result = num1 * num2;
                    
                    System.out.println(" ");
                    System.out.println("summation is: "+result);
                    System.out.println(" ");
                    System.out.println("----------------------------------------------");
                    sum();
                    break;

                case 4 :
                    System.out.println("");
                    System.out.println("-------- Calculation of two numbers --------"); 
                    System.out.println("");
                    System.out.print("Enter first number: ");
                    num1 = sc.nextInt();
                    System.out.print("Enter second number: ");
                    num2 = sc.nextInt();

                    result = num1 / num2; 
                    
                    System.out.println(" ");
                    System.out.println("summation is: "+result);
                    System.out.println(" ");
                    System.out.println("----------------------------------------------");
                    sum();
                    break;

                case 5: 
                    System.out.println("Thanks for using");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid operator menu number, enter valid menu number.");
                    System.out.println("---------------------------------------------------");
                    sum();
            }
    }
}
