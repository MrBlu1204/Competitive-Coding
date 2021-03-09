/*We define a magic square to be an n x n matrix of distinct positive integers from 1 to n^2 where the sum of any row, column, or diagonal of length  is always equal to the same number: the magic constant.

You will be given a 3x3 matrix s of integers in the inclusive range [1,9] . We can convert any digit a to any other digit b in the range [1,9] at cost of |a-b|. Given s, convert it into a magic square at minimal cost. Print this cost on a new line.

Note: The resulting magic square must contain distinct integers in the inclusive range [1,9].*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the formingMagicSquare function below.
    static int formingMagicSquare(int[][] s) {
        int cost[] = {0,0,0,0,0,0,0,0};
    int t[][] = 
    {
        {4,9,2,3,5,7,8,1,6},
        {4,3,8,9,5,1,2,7,6},
        {2,9,4,7,5,3,6,1,8},
        {2,7,6,9,5,1,4,3,8},
        {8,1,6,3,5,7,4,9,2},
        {8,3,4,1,5,9,6,7,2},
        {6,7,2,1,5,9,8,3,4},
        {6,1,8,7,5,3,2,9,4},
    };

    for(int i=0;i<8;i++)
    {        
    cost[i] = Math.abs(t[i][0]-s[0][0]) + Math.abs(t[i][1]-s[0][1]) + Math.abs(t[i][2]-s[0][2]);
    cost[i] = cost[i] + Math.abs(t[i][3]-s[1][0]) + Math.abs(t[i][4]-s[1][1]) + Math.abs(t[i][5]-s[1][2]);
    cost[i] = cost[i] + Math.abs(t[i][6]-s[2][0]) + Math.abs(t[i][7]-s[2][1]) + Math.abs(t[i][8]-s[2][2]);
    }   

    Arrays.sort(cost);
    return cost[0];
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int[][] s = new int[3][3];

        for (int i = 0; i < 3; i++) {
            String[] sRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 3; j++) {
                int sItem = Integer.parseInt(sRowItems[j]);
                s[i][j] = sItem;
            }
        }

        int result = formingMagicSquare(s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
