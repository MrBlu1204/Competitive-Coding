"""
Given a set of distinct integers, print the size of a maximal subset of S where the sum of any 2 numbers in S' is not evenly divisible by k.

Example
S = [19, 10, 12, 10, 24, 25, 22]  k=4
One of the arrays that can be created is S'[0] = [10, 12, 25]. Another is S'[1] = [19, 22, 24]. After testing all permutations, the maximum length solution array has 3 elements.

Function Description
Complete the nonDivisibleSubset function in the editor below.
nonDivisibleSubset has the following parameter(s):
*   int S[n]: an array of integers
*   int k: the divisor

Returns
int: the length of the longest subset of S meeting the criteria

Input Format
The first line contains 2 space-separated integers, n and k, the number of values in S and the non factor.
The second line contains n space-separated integers, each an S[i], the unique values of the set.

Constraints
*   1 <= n <= 5
*   1 <= k <= 100
*   1 <= S[i] <= 10^9
*   All of the given numbers are distinct.

Sample Input
STDIN    Function
-----    --------
4 3      S[] size n = 4, k = 3
1 7 2 4  S = [1, 7, 2, 4]

Sample Output
3

Explanation
The sums of all permutations of two elements from S = {1, 7, 2, 4} are:
1 + 7 = 8
1 + 2 = 3
1 + 4 = 5
7 + 2 = 9
7 + 4 = 11
2 + 4 = 6
Only S' = {1, 7, 4} will not ever sum to a multiple of k=3.
"""

#!/bin/python3

import math
import os
import random
import re
import sys

#
# Complete the 'nonDivisibleSubset' function below.
#
# The function is expected to return an INTEGER.
# The function accepts following parameters:
#  1. INTEGER k
#  2. INTEGER_ARRAY s
#

def nonDivisibleSubset(k, s):
    # Write your code here
    d = {x:[] for x in range(k)}
    #putting numbers with same remainder together
    for i in range(n): d[s[i]%k].append(s[i])
    print(d)
    
    count = 0
    
    #if the number is evenly divisible by k
    #only one such number can exist in the set
    if len(d[0]) > 0:
        count = 1
        
    #set of remainder pairs whose sum is k
    #i.e. the sum of those numbers will be divisible by k
    arr = set([(x,k-x) for x in range(1,k//2+1)])
    print(arr)
    
    #selecting the remainder with highest frequency to make the maximum length subset
    for i,j in arr:
        if i != j:
            if len(d[i]) > len(d[j]):
                count += len(d[i])
            else:
                count += len(d[j])
        #as the double of the remainder will be k
        #so only one such number can be there in the subset
        else:
            if len(d[i]) > 0:
                count += 1
                
    return count

if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    first_multiple_input = input().rstrip().split()

    n = int(first_multiple_input[0])

    k = int(first_multiple_input[1])

    s = list(map(int, input().rstrip().split()))

    result = nonDivisibleSubset(k, s)

    fptr.write(str(result) + '\n')

    fptr.close()
    
#EXPLANATION
"""
For any number K, the sum of 2 values (A & B) is evenly divisible by K if the sum of the remainders of A/K + B/K is K. (There is also a special case where both A & B are evenly divisible, giving a sum of 0.)

For any such remainder, there is 1 and only 1 other remainder value which will make a sum divisible by K.

Example: with K of 5, remainder pairs are 1+4 & 2+3. Given the numbers with a remainder of 1, they can't be paired with ANY of the numbers with remainder 4 (and vice versa). So, for the number of values in the resultant set, choose the larger of values with remainder 1 vs. values with remainder 4. Choose the larger set of remainder 2 vs remainder 3.

For the special case where remainder is 0, given the set of all values which are individually divisible by K, they can't be paired with any others. So, at most 1 value which is evenly divisible by K can be added to the result set.

For even values of K, the equal remainder is simular to the 0 case. For K = 6, pairs are 1+5, 2+4, 3+3. For values with remainder 3, at most one value can be added to the result set.
"""
