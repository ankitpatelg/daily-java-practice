/*
8Q. This is a Java Program to Find Out the Number of Objects Created of a Class.
auther: ankit patel 
date:03/11/2022
*/
public class Number_Objects 
{
    static int count=0;
    Number_Objects()
    {
        count++;
    }
    public static void main(String[] args) 
    {
        Number_Objects obj1 = new Number_Objects();
        Number_Objects obj2 = new Number_Objects();
        Number_Objects obj3 = new Number_Objects();
        Number_Objects obj4 = new Number_Objects();
        System.out.println("Number of objects created:"+count);
    }
}