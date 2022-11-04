/*
8Q. This is the Java Program to Find the Sum and Product of Elements in a Row/Column
auther:ankit patel
date:04/11/2022
*/
//Java Program to Find the Sum and Product of Elements in a Row/Column
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class SumAndProduct {
    // Function to calculate sum and products
    static void displayOutput(int[][] matrix)
    {
        int i,j,sumr,productr,sumc,productc;
        System.out.println("\t\tSum   Product");
        for(i=0; i<matrix.length; i++){
            sumr = sumc = 0;
            productr = productc = 1;
            for(j=0; j<matrix[i].length; j++){
                sumr+=matrix[i][j];
                sumc+=matrix[j][i];
                productr*=matrix[i][j];
                productc*=matrix[j][i];
            }
            System.out.format("%s %d   %3d   %2d\n","Row",i+1,sumr,productr);
            System.out.format("%s %d   %3d   %2d\n","Col",i+1,sumc,productc);
        }
    }
    // Function to read user input
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int order;
        System.out.println("Enter the order of the matrix");
        try {
            order = Integer.parseInt(br.readLine());
        } catch (Exception e) {
            System.out.println("An error occurred");
            return;
        }
        int[][] matrix = new int[order][order];
        System.out.println("Enter matrix elements");
        int i, j;
        for (i = 0; i < order; i++) {
            for (j = 0; j < order; j++) {
                try {
                    matrix[i][j] = Integer.parseInt(br.readLine());
                } catch (Exception e) {
                    System.out.println("An error occurred");
                    return;
                }
            }
        }
        System.out.println("Tha matrix is");
        for (i = 0; i < order; i++) {
            for (j = 0; j < order; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        displayOutput(matrix);
    }
}