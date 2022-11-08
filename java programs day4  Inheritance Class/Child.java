/*
q1. This is a Java Program to Use Super Keyword in Inheritance Class
auther : ankit patel
date: 08/11/2021
*/
class Base 
{
  int x = 19;
}
 
class Child extends Base 
{
    int x = 20;
    void shows() 
    {
        System.out.println("The base class data member (x) by Super Keyword :" + super.x);
        System.out.println("The child class data member :" + x);
 
    }
    public static void main(String... a) 
    {
        Child obj = new Child();
        obj.shows();       
    }
}