/*
11Q. This is a Java Program to Accept the Marks of a Student into a 1D Array and find Total Marks and Percentage. A one-dimensional array is, essentially, a list of like-typed variables.
auther: ankit patel
date: 03/11/2022
*/
import java.util.Scanner;
public class Student_Marks
{
    public static void main(String[] args) 
    {
        int n, total = 0, percentage;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of subject:");
        n = s.nextInt();
        int marks[] = new int[n];
        System.out.println("Enter marks out of 100:");
        for(int i = 0; i < n; i++)
        {
            marks[i] = s.nextInt();
            total = total + marks[i];
        }
        percentage = total / n;
        System.out.println("Sum:"+total);
        System.out.println("Percentage:"+percentage);
    }
}