/*
4Q. This is a Java Program to Illustrate how User Authentication is Done
auther : ankit patel
date:03/11/2022
*/
import java.util.Scanner;
public class User_Authentication 
{
    public static void main(String args[])
    {
        String username, password;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter username:");//username:user
        username = s.nextLine();
        System.out.print("Enter password:");//password:user
        password = s.nextLine();
        if(username.equals("user") && password.equals("user"))
        {
            System.out.println("Authentication Successful");
        }
        else
        {
            System.out.println("Authentication Failed");
        }
    }
}