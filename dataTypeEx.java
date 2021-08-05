/*
Input Format:
The first line contains an integer that you must sum with .
The second line contains a double that you must sum with .
The third line contains a string that you must concatenate with .

Output Format:
Print the sum of both integers on the first line, the sum of both doubles (scaled to  decimal place) on the second line, and then the two concatenated strings on the third line.

Sample Input:
12
4.0
is the best place to learn and practice coding!

Sample Output :
16
8.0
HackerRank is the best place to learn and practice coding!
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class dataTypeEx {
	
    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";
		
        Scanner scan = new Scanner(System.in);

        int x = 12;
        double y = 4.0;
        String z = "is the best place to learn and practice coding!";
        
        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.

        x = scan.nextInt();
        y = scan.nextDouble();
        scan.nextLine();
        z = scan.nextLine();
        
        /* Print the sum of both integer variables on a new line. */
        System.out.println(i+x);
      
        /* Print the sum of the double variables on a new line. */
         System.out.println(d+y);
		
        /* Concatenate and print the String variables on a new line; 
        	the 's' variable above should be printed first. */
        System.out.println(s.concat(z));
        
        scan.close();
    }
}