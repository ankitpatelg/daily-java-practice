/*
q6. This is the Java Program to Find Repeated Elements and the Frequency of Repetition
auther: ankit patel
date: 08/11/2022
*/
 
// Java Program to Find Repeated Elements and the Frequency of Repetition.
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
 
public class RepeatedElementsFrequency {
    // Function to display the repeated elements and their frequencies 
    static void displayOutput(int[] array){
        int i,j,frequency;
        for(i=0; i<array.length; i++){
            frequency = 1;
            for(j=i+1; j<array.length; j++){
                if(array[j] == array[i]){
                    frequency++;
                }
                else{
                    break;
                }
            }
            i=j-1;
            if(frequency > 1){
                System.out.println("The element is " + array[i] 
                                   + " and its frequency is " + frequency);
            }
        }
    }
    // Function to read input
    public static void main(String[] args){
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
        Arrays.sort(array);
        displayOutput(array);
    }
}