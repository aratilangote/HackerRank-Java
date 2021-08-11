/*
Task :
Given the meal price (base cost of a meal), tip percent (the percentage of the meal price being added as tip), and tax percent (the percentage of the meal price being added as tax) for a meal, find and print the meal's total cost. Round the result to the nearest integer.

Input Format:
There are  lines of numeric input:
The first line has a double,  (the cost of the meal before tax and tip).
The second line has an integer,  (the percentage of  being added as tip).
The third line has an integer,  (the percentage of  being added as tax).

Sample Input:
12.00
20
8
Sample Output:
15
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


public class OperatorHackEx 
{
    static void solve(double meal_cost, int tip_percent, int tax_percent) 
    {
    // Write your code here
        double tip=meal_cost*tip_percent/100;
        double tax=meal_cost*tax_percent/100;
        int totalcost=(int)Math.round(meal_cost+tip+tax);
        
      System.out.println(totalcost);
    }
     private static final Scanner sc = new Scanner(System.in);
     
    public static void main(String[] args)
     {
        

        double meal_cost = sc.nextDouble();
        

        int tip_percent = sc.nextInt();

        int tax_percent = sc.nextInt();

        solve(meal_cost, tip_percent, tax_percent);

        sc.close();
    }
}