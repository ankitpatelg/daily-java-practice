/*
6Q. This is the Java Program to Implement the pow() Function
auther : ankit patel
date:04/11/2022
*/
// Java Program to Implement the pow() Function
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Power {
    // Function to calculate power of x raised to n
    static double pow(double x, int n){
        if(n<0){
            return pow(1/x,-n);
        }
        if(n==1)
            return x;
        else if(n%2 == 0){
            double y = pow(x,n/2);
            return y*y;
        }
        double y = pow(x,n/2);
        return y*y*x;
    }
    // Function to read user input
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double x;
        int n;
        try {
            System.out.println("Enter the number");
            x = Double.parseDouble(br.readLine());
            System.out.println("Enter the exponent (in integer)");
            n = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("An error occurred");
            return;
        }
        double result = pow(x,n);
        System.out.printf(x + " raised to " + n + " is %f", result);
    }
}