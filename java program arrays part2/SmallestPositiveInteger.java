/*
q5. This is the Java Program to Find the Smallest Positive Integer Missing in an Unsorted Integer Array
auther:ankit patel
date:08/11/2022
*/
 
//Java Program to Find the Smallest Positive Integer Missing in
//an Unsorted Integer Array
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class SmallestPositiveInteger {
    // Function to find the smallest positive missing integer
    static int findSmallestPositiveMissingInteger(int[] array){
      //   arrays.sort(array);
        int j,i = 1;
        for(j = 0; j<array.length; j++){
           if(array[j] == i){
              i++;
           }
        } 
        return i;
    }
    // Function to read input and display the output
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int size;
        System.out.println("Enter the size of the array");
        try {
            size = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("Invalid Input");
            return;
        }
        int[] array = new int[size];
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
        int missing = findSmallestPositiveMissingInteger(array);
        System.out.println("The smallest positive missing integer is " + missing);
    }
}