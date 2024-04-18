package Exceptionhandling;
import java.util.InputMismatchException;
import java.util.Scanner;
public class Example {
    public static void main(String[] args)
    {
        try
        {
        int a;
        int b;
          Scanner scanner= new Scanner(System.in);
        System.out.println("enter the value of a and b");
        a=scanner.nextInt();
        b=scanner.nextInt();
        int result =a/b;
        System.out.println("result="+result);

        }
        // it catch those exception wich is occured when divided by zero 
        catch(ArithmeticException e)
        {
            System.out.println(e.getMessage());
        }
        // it occurs when data type is mismatched  ex putting alphabates in int 
        catch(InputMismatchException e)
        {
            System.out.println("enter only number");
        }
        // it occur when  user forget the initilization of data 
        catch(NullPointerException e)
        {
            System.out.println(" initilize the value ");
        }
        //occur when user provide data out of array bound 
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("check the size and enter number ");
        }
        // it occur when user tries to convert data 
        catch(NumberFormatException e)
        {
            System.out.println("string also contain numbers ");
        }
    
    
    
    // it is used to end the program or to display final message 
        finally
        {
            System.out.println("end ");
        }
    }
    
}
