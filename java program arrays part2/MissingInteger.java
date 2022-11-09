/*
q8. This is the Java Program to Find the Missing Element in an Integer Array
auther: ankit patel
date: 08/11/2022
*/
 
//Java Program to Find the Missing Element in an Integer Array.
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class MissingInteger {
    // Function to calculate XOR values and return the missing integer.
    static int findMissingInteger(int[] array){
        int i;
        int XOR1, XOR2;
        XOR1 = array[0];
        XOR2 = 1;
        for(i=1;i<array.length;i++){
            XOR1 ^= array[i];
            XOR2 ^= (i+1);
        }
        XOR2 ^=(i+1);
        return (XOR2 ^ XOR1);
    }
    // Function to read the input and display the output
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size;
        System.out.println("Enter the range of the values (starts from 1)");
        try {
            size = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("Invalid Input");
            return;
        }
        int[] array = new int[size-1];
        System.out.println("Enter array elements");
        int i;
        for (i = 0; i < array.length; i++) {
            try {
                array[i] = Integer.parseInt(br.readLine());
            } catch (Exception e) {
                System.out.println("An error occurred");
                return;
            }
        }
        int missing = findMissingInteger(array);
        System.out.println("The missing integer is " + missing);
    }
}