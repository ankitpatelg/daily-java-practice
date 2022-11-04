/*
q3.Iterate through the loop from 1 to n and print the square of the loop variable.
auther:ankit patel
date:04/11/2022
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class PrintNSquareNumbers {
    // Function to read n and display the numbers
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n;
        System.out.println("Enter the value of n");
        try{
            n = Integer.parseInt(br.readLine());
        }catch (Exception e){
            System.out.println("An error occurred");
            return;
        }
        if(n<=0){
            System.out.println("n should be greater than zero");
            return;
        }
        System.out.println("First " + n + " square numbers are ");
        int i;
        for(i=1; i<=n; i++){
            System.out.print(i*i + " ");
        }
    }
}