/*
13q.This is a Java Program to Convert Hex to Decimal.
auther:ankit patel
date:04/11/2022
*/
import java.util.Scanner;
class Hexa_Decimal
{
    Scanner scan;
    int num;
     void getVal()
      {
        System.out.println("HexaDecimal to Decimal");
        scan = new Scanner(System.in);
        System.out.println("Enter the number :");
        num = Integer.parseInt(scan.nextLine(), 16);
      }
    void convert()
     {
        String decimal = Integer.toString(num);
        System.out.println("Decimal Value is : " + decimal);
     }
}
class Hexa_Decimal_Main
{
       public static void main(String args[])
         {
	Hexa_Decimal obj = new Hexa_Decimal();
	obj.getVal();
	obj.convert();
         }
}