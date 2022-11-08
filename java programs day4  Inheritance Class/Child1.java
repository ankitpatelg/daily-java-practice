/*
q2.This is a Java Program to Use This Keyword in Inheritance Class
auther: ankit patel
date: 08/11/2021
*/
class Base1
{
  int x = 19;
}
class Base2 extends Base1
{
  int x = 20;
}
class Child1 extends Base2
{
     int x = 21;
     void show()
     {
        System.out.println("Child Class-"+x);
        System.out.println("Base1 class-"+super.x);
        System.out.println("Accessing value of data member via This Keyword");
        System.out.println("Base2 class-"+(((Base1)this).x));
     }
    public static void main(String... a)
    {
       Child1 obj = new Child1();
        obj.show();
    }
}