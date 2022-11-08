/*
q3. This is a Java Program to Show Method Overriding in a Class Using Inheritance Class.
auther: ankit patel
date:08/11/2021
*/
class Base
{
    void showme()
    {
        System.out.println(" Base class method");
    }
}
 class Child0 extends Base
{
    void showme()
    {
      System.out.println("Child class method");
    }
    public static void main(String... a)
    {
       Child0 obj = new Child0();
       obj.showme();
    }
}