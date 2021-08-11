/*
Task :
Given an integer, n, perform the following conditional actions:
If n is odd, print Weird
If n is even and in the inclusive range of 2 to 5, print Not Weird
If n is even and in the inclusive range of  6 to 20 , print Weird
If n is even and greater than 20, print Not Weird
Complete the stub code provided in your editor to print whether or not n is weird.

Constraints:
   1<=n<=100

Explanation

Sample Case 0: n=3
 n is odd and odd numbers are weird, so we print Weird.

Sample Case 1: n=24
 n>20 and n is even, so it is not weird. Thus, we print Not Weird.
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

public class ContStr 
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);

        int n = sc.nextInt();
        
        if (n%2 == 1)
        {
            System.out.println("Weird");
        }
        else
        {
            if(n>=2 && n<=5)
            {
                System.out.println("Not Weird");
            } 
            else if(n>=6 && n<=20)
            {
                System.out.println("Weird");
            }
            else 
            {
                System.out.println("Not Weird");
            }
        }
        sc.close();
    }
}