/*Starting with a 1-indexed array of zeros and a list of operations, for each operation add a value to each the array element between two given indices, inclusive. Once all operations have been performed, return the maximum value in the array.
Function Description

Complete the function arrayManipulation in the editor below.

arrayManipulation has the following parameters:

int n - the number of elements in the array
int queries[q][3] - a two dimensional array of queries where each queries[i] contains three integers, a, b, and k.
Returns

int - the maximum value in the resultant array
Input Format

The first line contains two space-separated integers n and m, the size of the array and the number of operations.
Each of the next m lines contains three space-separated integers a, b and k, the left index, right index and summand.*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Solution {

    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        int N = in.nextInt();
        int M = in.nextInt();
        
        //for index 0 as dummy
        long[] numbers = new long[N+1];
        
        for(int i = 0; i < M; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int k = in.nextInt();
            
            numbers[a] += k;
            if(b + 1 <= N){
                numbers[b+1] -= k;
            }
        }
        
        long max = Long.MIN_VALUE;
        long sum = 0;
        for(int i = 1; i < numbers.length; i++){
            sum = sum + numbers[i];
            if(sum > max){
                max = sum;
            }
        }
        
        System.out.println(max);
    }
}
