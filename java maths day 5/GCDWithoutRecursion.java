//Java Program to Calculate GCD of 2 Given Numbers Without Using recursion
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class GCDWithoutRecursion {
    // Function to read two integers and find their gcd
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int i1,j1;
        System.out.println("Enter the two numbers");
        try{
            i1=Integer.parseInt(br.readLine());
            j1=Integer.parseInt(br.readLine());
        }catch (Exception e){
            System.out.println("An error occurred");
            return;
        }
        if(i1 == 0 || j1 == 0){
            System.out.println("The greatest common divisor is " + 1);
            return;
        }
        int i;
        int gcd = 1;
        for(i=2; i<=Math.min(i1,j1); i++){
            if(i1%i == 0 && j1%i == 0){
                gcd = i;
            }
        }
        System.out.println("The greatest common divisor is " + gcd);
    }
}