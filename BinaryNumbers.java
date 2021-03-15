/*Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10 integer denoting the maximum number of consecutive 1's in n's binary representation. When working with different bases, it is common to show the base as a subscript.

Example
n=125
The binary representation of 125 is 1111101. In base 2, there are 5 and 1 consecutive ones in two groups. Print the maximum, 5.

Input Format
A single integer, n.

Constraints
1<=n<=10^6

Output Format
Print a single base-10 integer that denotes the maximum number of consecutive 1's in the binary representation of n.

Sample Input 1
5
Sample Output 1
1

Sample Input 2
13
Sample Output 2
2

Explanation

Sample Case 1:
The binary representation of 5 is 101, so the maximum number of consecutive 1's is 1.

Sample Case 2:
The binary representation of 13 is 1101, so the maximum number of consecutive 1's is 2.*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {



    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        long binary=0;
        int rem;
        int i=0;
        int count=0;
        int max=0;
        while(n>0){
            rem=n%2;
            binary += rem*Math.pow(10,i);
            i++;
            n /=2;
            if(rem==1){
                count++;
            }else{
                count=0;
            }
            if(count>max){
                max=count;
            }
        }
        System.out.println(binary);
        System.out.println(max);
        scanner.close();
    }
}
