
/*Given a sequence of n integers, p(1),p(2),...p(n) where each element is distinct and satisfies 1 <= p(x) <= n. For each x where 1 <= x <= n, that is x increments from 1 to n, find any integer y such that p(p(y))=x and keep a history of the values of y in a return array.*/

import java.util.Scanner;

// - Our input provides us "n" values of x and p(x)
// - p(x) is a 1-to-1 function, so it has an inverse. 
// - We create the function representing the inverse of p(x), and represent it as an array: int [] p_inverse 
// - We need find a y where p(p(y)) = x. This equation can be rewritten as y = p_inverse(p_inverse(x)), which is the version of the equation we use to calculate and print "y".

public class Solution {
    public static void main(String[] args) {
        /* Create function: p_inverse */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] p_inverse = new int[n + 1];
        for (int x = 1; x <= n; x++) {
            int px = scan.nextInt();
            p_inverse[px] = x;
        }
        scan.close();
        
        /* Calculate and print each y */
        for (int x = 1; x <= n; x++) {
            int y = p_inverse[p_inverse[x]];
            System.out.println(y);
        }
    }
}

/*import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
        int[] result = new int[p.length];
        int[] p_inverse = new int[p.length];
        for(int i=0;i<p.length;i++){
            p_inverse[p[i]-1]=i+1;
        }
        for(int i=0;i<p.length;i++){
            result[i]=p_inverse[p_inverse[i]-1];
        }
        return result;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] p = new int[n];

        String[] pItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int pItem = Integer.parseInt(pItems[i]);
            p[i] = pItem;
        }

        int[] result = permutationEquation(p);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}*/
