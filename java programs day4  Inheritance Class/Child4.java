/*
q4. This is a Java Program to Access Super Class in a Method Overriding.
authr: ankit patel
date:08/11/2021
*/
class Base
{
    void get()
    {
        System.out.println(" Base class method via Super keyword");
    }
}
class Child4 extends Base
{
    void get()
    {
       super.get();
       System.out.println("Child class method");
    }
    public static void main(String... a)
    {
       Child4 obj1 = new Child4();
       obj1.get();
    }
}