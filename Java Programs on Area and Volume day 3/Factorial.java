/*
q4. This is a Java Program to Find Factorial Value With Using Recursion
auther: ankit patel
date:05/11/2022
*/
import java.util.Scanner;
public class Factorial
{
    public static void main(String[] args) 
    {
        int n, mul;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter any integer:");
        n = s.nextInt();
        Factorial obj = new Factorial();
        mul = obj.fact(n);
        System.out.println("Factorial of "+n+" :"+mul);
    }
    int fact(int x)
    {
        if(x > 1)
        {
            return(x * fact(x - 1));
        }
        return 1;
    }
}