/*
3Q . This is a Java Program to Read Two Integers M and N & Swap their Values..
 * @Author: Ankit patel
@Date: 03/11/2022/
*/
import java.util.Scanner;
public class Swap_Integers 
{
    public static void main(String args[])
    {
        int m, n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter the first number:");
        m = s.nextInt();
        System.out.print("Enter the second number:");
        n = s.nextInt();
        temp = m;
        m = n;
        n = temp;
        System.out.println("After Swapping");
        System.out.println("First number:"+m);
        System.out.println("Second number:"+n);
    }
}