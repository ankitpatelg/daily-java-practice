/*
q1. This is a Java Program to Find the Area of a Circle Given the Radius.
Area = pi * r * r
Enter the radius of the circle as an input. Now we use the given formula to calculate the area of the circle
auther: ankit patel
date:05/11/2022
*/
import java.util.Scanner;
public class Circle 
{
    public static void main(String[] args) 
    {
        int r;
        double pi = 3.14, area;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        r = s.nextInt();
        area = pi * r * r;
        System.out.println("Area of circle:"+area);
    }            
}