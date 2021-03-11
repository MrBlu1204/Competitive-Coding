/*A Discrete Mathematics professor has a class of students. Frustrated with their lack of discipline, the professor decides to cancel class if fewer than some number of students are present when class starts. Arrival times go from on time (arrivalTime <=0) to arrived late (arrivalTime >0).

Given the arrival time of each student and a threshhold number of attendees, determine if the class is cancelled.
Note: Non-positive arrival times (a[i]<=0) indicate the student arrived early or on time; positive arrival times (a[i]>0) indicate the student arrived  minutes late.

Function Description

Complete the angryProfessor function in the editor below. It must return YES if class is cancelled, or NO otherwise.

angryProfessor has the following parameter(s):

int k: the threshold number of students
int a[n]: the arrival times of the n students

Returns

string: either YES or NO
Input Format

The first line of input contains t, the number of test cases.

Each test case consists of two lines.

The first line has two space-separated integers, n and k, the number of students (size of a) and the cancellation threshold.
The second line contains n space-separated integers (a[1],a[2],...,a[n]) that describe the arrival times for each student.*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {
        int count=0;
        for(int i=0;i<a.length;i++){
            if(a[i]<=0){
                count++;
            }
            if(count>=k)
            return "NO";
        }
        return "YES";
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int tItr = 0; tItr < t; tItr++) {
            String[] nk = scanner.nextLine().split(" ");

            int n = Integer.parseInt(nk[0]);

            int k = Integer.parseInt(nk[1]);

            int[] a = new int[n];

            String[] aItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int i = 0; i < n; i++) {
                int aItem = Integer.parseInt(aItems[i]);
                a[i] = aItem;
            }

            String result = angryProfessor(k, a);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
