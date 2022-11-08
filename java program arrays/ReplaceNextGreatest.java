/*
q12. This is the Java Program to Replace the Element with its Next Greatest Element, Rightmost Element will be Replaced by 0
auther: ankit patel
date: 08/11/2021
*/
//Java Program to Replace the Element with its Next Greatest Element, 
//Rightmost Element will be Replaced by 0
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class ReplaceNextGreatest {
        // Function to replace all the array elements
        // with the next greatest element
        static void nextGreatest(int[] array){
            int max=array[array.length-1];
            int i,temp;
            for(i= array.length-2; i>=0; i--){
                    temp = array[i];
                    array[i] = max;
                    if(temp > max)
                        max= temp;
            }
            array[array.length-1] = 0;
        }
        // Function to read input and display the output
        public static void main(String[] args) {
            BufferedReader br = new BufferedReader
                                (new InputStreamReader(System.in));
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
            for(i = 0;i < array.length; i++){
                System.out.print(array[i] + " ");
            }
            nextGreatest(array);
            System.out.println("\nThe final array is");
            for(i = 0;i < array.length; i++){
                System.out.print(array[i] + " ");
            }
        }
}