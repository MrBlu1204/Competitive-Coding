/*
A prime is a natural number greater than 1 that has no positive divisors other than 1 and itself. Given a number, n, determine and print whether it is Prime or Not Prime.
*/
import java.io.*;
import java.util.*;

public class Solution {
    private static boolean isPrime(int num) {
        if (num == 1) return false;
        for (int i = 2; i*i <= num; i++)
            if (num % i == 0) return false;
        return true;
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        final int N = sc.nextInt();
        for (int i = 0; i < N; i++) {
            if (isPrime(sc.nextInt()))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
        
    }
}
