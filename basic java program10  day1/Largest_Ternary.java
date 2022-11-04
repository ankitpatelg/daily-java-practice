/*
6 Q. This is a Java Program to Find Largest Between Three Numbers Using Ternary Operator.
auther: ankit patel 
date:03/11/2022
*/
import java.util.Scanner;
public class Largest_Ternary 
{
    public static void main(String[] args) 
    {
        int a, b, c, d;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter all three numbers:");
        a = s.nextInt();
        b = s.nextInt();
        c = s.nextInt();
        d = c > (a > b ? a : b) ? c : ((a > b) ? a : b);
        System.out.println("Largest Number:"+d);
    }
}