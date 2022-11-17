// This is the Java Program to Find the Area of a Triangle Using Heron’s formula.
/*
The area of a triangle can be calulated as (s*(s-a)*(s-b)*(s-c))^(1/2), where s is semi-perimeter of the triangle
s = (a + b + c)/2
*/
//Java Program to Find the Area of a Triangle Using Heron's formula
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class HeronsFormula {
    // Function to calculate area using Heron's Formula
    static void area(double a, double b, double c){
        double s = (a+b+c)/2;
        s = s*(s-a)*(s-b)*(s-c);
        System.out.println("Area of the triangle is " + Math.sqrt(s));
    }
    // Function to read user input
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double a,b,c;
        System.out.println("Enter the three sides of the triangle");
        try{
            a = Double.parseDouble(br.readLine());
            b = Double.parseDouble(br.readLine());
            c = Double.parseDouble(br.readLine());
        }catch (Exception e){
            System.out.println("An error occurred");
            return;
        }
        if(a<0 || b<0 || c<0){
            System.out.println("Invalid Input");
            return;
        }
        area(a,b,c);
    }
}