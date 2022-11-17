import java.util.Scanner;
public class Euclid1
{
    void gcd(long a, long b)
    {
        while (b > 0)
        {
             long temp = b;
             b = a % b; // % is remainder
             a = temp;
        }
        System.out.println("GCD is "+a);
    }
    void lcm(long a, long b)
    {
        long x = a;
        long y = b;
        while (b > 0)
        {
            long temp = b;
            b = a % b; // % is remainder
            a = temp;
        }
        long gcd = a;
        long lcm = (x * (y / gcd));
        System.out.println("LCM is "+ lcm);
    }
    public static void main(String... a)
    {
        Euclid1 abc = new  Euclid1();
        System.out.println("Enter any two numbers to calculate GCD");
        Scanner s = new Scanner(System.in);
        long x = s.nextLong();
        long y = s.nextLong();
        abc.gcd(x, y);
        System.out.println("Enter any two numbers to calculate LCM");
        long l = s.nextLong();
        long m = s.nextLong();
        abc.lcm(l, m);
    }
}