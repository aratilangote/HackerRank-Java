/*Given an integer, , perform the following conditional actions:
If  is odd, print Weird
If  is even and in the inclusive range of  to , print Not Weird
If  is even and in the inclusive range of  to , print Weird
If  is even and greater than , print Not Weird
Complete the stub code provided in your editor to print whether or not  is weird.
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Integer
{
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        if(n%2!=0)
        {
            System.out.println("Weird");
        }
        else
        {
            if(n>=2&&n<=5)
            {
                System.out.println("Not Weird");
            }
            else if(n>=6&&n<=20)
            {
                System.out.println("Weird");
            }
            else
            {
                System.out.println("Not Weird");
            }
        }

        scanner.close();
    }
}