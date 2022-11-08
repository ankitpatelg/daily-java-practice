/*
q12. This is the Java Program to Cyclically Permute the Elements of an Array
auther: ankit patel
date: 08/11/2022
*/
 
// Java Program to Cyclically Permute the Elements of an Array.
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class CyclicallyPermuteArray {
    // Function to cyclically permute the array
    static void cyclicallyPermute(int[] array){
        int x = array[0];
        int i;
        for(i=0; i<array.length-1; i++)
            array[i] = array[i+1];
        array[i] = x;
    }
    // Function to read user input and display the output
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
        System.out.println("The initial array is");
        System.out.println(Arrays.toString(array));
        System.out.println();
        cyclicallyPermute(array);
        System.out.println("The array after permutation is");
        System.out.println(Arrays.toString(array));
    }
}