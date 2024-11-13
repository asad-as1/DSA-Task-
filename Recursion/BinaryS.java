// Java program to Generate all binary string without  // TODO GFG
// consecutive 1's of size K


// Generate all binary strings without consecutive 1’s
// Last Updated : 30 Jul, 2024

// Given an integer, K. Generate all binary strings of size k without consecutive 1’s.

// Examples: 

// Input : K = 3  
// Output : 000 , 001 , 010 , 100 , 101 
// Input : K  = 4 
// Output :0000 0001 0010 0100 0101 1000 1001 1010

import java.util.*;
import java.lang.*;

public class BinaryS {

    // Array conversion to String--
    public static String toString(char[] a) {
        String string = new String(a);
        return string;
    }

    static void generate(int k, char[] ch, int n) {
      
        // Base Condition when we 
        // reached at the end of Array**
        if (n == k) {
          
            // Printing the Generated String**
            // Return to the previous case*
            System.out.print(toString(ch)+" ");
            return;

        }
      
        // If the first Character is 
        //Zero then adding**
        if (ch[n - 1] == '0') {
            ch[n] = '0';
            generate(k, ch, n + 1);
            ch[n] = '1';
            generate(k, ch, n + 1);
        }
      
        // If the Character is One 
        // then add Zero to next**
        if (ch[n - 1] == '1') {

            ch[n] = '0';
          
            // Calling Recursively for the 
            // next value of Array
            generate(k, ch, n + 1);

        }
    }

    static void fun(int k) {

        if (k <= 0) {
            return;
        }

        char[] ch = new char[k];
      
        // Initializing first character to Zero
        ch[0] = '0';
      
        // Generating Strings starting with Zero--
        generate(k, ch, 1);

        // Initialized first Character to one--
        ch[0] = '1';
        generate(k, ch, 1);

    }

    public static void main(String args[]) {

        int k = 3;
      
        //Calling function fun with argument k
        fun(k);
      
   
    }
}