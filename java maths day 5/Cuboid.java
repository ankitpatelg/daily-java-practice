/*
This is the Java Program to Find the Surface Area and Volume of a Cuboid
*/
//Java Program to Find the Surface Area and Volume of a Cuboid
 
import java.io.BufferedReader;
import java.io.InputStreamReader;
 
public class Cuboid {
    // Function to calculate the Surface Area and Volume of a Cuboid
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double length,breadth,height;
        System.out.println("Enter the length, breadth and height of the cuboid");
        try{
            length=Double.parseDouble(br.readLine());
            breadth=Double.parseDouble(br.readLine());
            height=Double.parseDouble(br.readLine());
        }catch (Exception e){
            System.out.println("An error occurred");
            return;
        }
        if(length<=0 || breadth<=0 || height<=0){
            System.out.println("Wrong Input");
            return;
        }
        System.out.println("Volume = " + length*breadth*height);
        System.out.println("Surface area = " + 
                            2*(length*breadth + breadth*height + height*length));
    }
}