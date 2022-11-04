/*
10Q.This is a Java Program to Accept Array Elements and Calculate Sum. An array is a group of like-typed variables that are referred to by a common name. Arrays of any type can be created and may have one or more dimensions. Aspecific element in an array is accessed by its index
auther : ankit patel
date:03/11/2022
*/
import java.util.Scanner;
public class Array_Sum
{
    public static void main(String[] args) 
    {
        int n, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array:");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for(int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
            sum = sum + a[i];
        }
        System.out.println("Sum:"+sum);
    }
}