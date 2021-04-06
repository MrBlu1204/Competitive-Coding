/*
Strings are usually ordered in lexicographical order. That means they are ordered by comparing their leftmost different characters. For example, abc<abd because c<d. Also z>yyy because z>y. If one string is an exact prefix of the other it is lexicographically smaller, e.g., gh<ghij.

Given an array of strings sorted in lexicographical order, print all of its permutations in strict lexicographical order. If two permutations look the same, only print one of them. See the 'note' below for an example.

Complete the function next_permutation which generates the permutations in the described order.

For example, s=[ab,bc,cd]. The six permutations in correct order are:

ab bc cd
ab cd bc
bc ab cd
bc cd ab
cd ab bc
cd bc ab

Note: There may be two or more of the same string as elements of .
For example, s=[ab, ab, bc]. Only one instance of a permutation where all elements match should be printed. In other words, if s[0]==s[1], then print either s[0] s[1] or s[1] s[0] but not both.

A three element array having three distinct elements has six permutations as shown above. In this case, there are three matching pairs of permutations where s[0] = ab and s[1] = ab are switched. We only print the three visibly unique permutations:

ab ab bc
ab bc ab
bc ab ab

Input Format
The first line of each test file contains a single integer n, the length of the string array s.
Each of the next  lines contains a string s[i].

Constraints
*   2 <= n <= 9
*   1 <= |s[i]| <= 10
*   s[i] contains only lowercase English letters.

Output Format
Print each permutation as a list of space-separated strings on a single line.

Sample Input 0
--------------
2
ab
cd

Sample Output 0
---------------
ab cd
cd ab

Sample Input 1
--------------
3
a
bc
bc

Sample Output 1
---------------
a bc bc
bc a bc
bc bc a

Explanation 1
This is similar to the note above. Only three of the six permutations are printed to avoid redundancy in output.
*/

/*
* Reference:  https://en.wikipedia.org/wiki/Permutation#Generation_in_lexicographic_order
Generation in lexicographic order
There are many ways to systematically generate all permutations of a given sequence.[50] One classic, simple, and flexible algorithm is based upon finding the next permutation in lexicographic ordering, if it exists. It can handle repeated values, for which case it generates each distinct multiset permutation once. Even for ordinary permutations it is significantly more efficient than generating values for the Lehmer code in lexicographic order (possibly using the factorial number system) and converting those to permutations. It begins by sorting the sequence in (weakly) increasing order (which gives its lexicographically minimal permutation), and then repeats advancing to the next permutation as long as one is found. The method goes back to Narayana Pandita in 14th century India, and has been rediscovered frequently.[51]

The following algorithm generates the next permutation lexicographically after a given permutation. It changes the given permutation in-place.
1.  Find the largest index k such that a[k] < a[k + 1]. If no such index exists, the permutation is the last permutation.
2.  Find the largest index l greater than k such that a[k] < a[l].
3.  Swap the value of a[k] with that of a[l].
4.  Reverse the sequence from a[k + 1] up to and including the final element a[n].

For example, given the sequence [1, 2, 3, 4] (which is in increasing order), and given that the index is zero-based, the steps are as follows:
1.  Index k = 2, because 3 is placed at an index that satisfies condition of being the largest index that is still less than a[k + 1] which is 4.
2.  Index l = 3, because 4 is the only value in the sequence that is greater than 3 in order to satisfy the condition a[k] < a[l].
3.  The values of a[2] and a[3] are swapped to form the new sequence [1,2,4,3].
4.  The sequence after k-index a[2] to the final element is reversed. Because only one value lies after this index (the 3), the sequence remains unchanged in this instance. Thus the lexicographic successor of the initial state is permuted: [1,2,4,3].

Following this algorithm, the next lexicographic permutation will be [1,3,2,4], and the 24th permutation will be [4,3,2,1] at which point a[k] < a[k + 1] does not exist, indicating that this is the last permutation.

This method uses about 3 comparisons and 1.5 swaps per permutation, amortized over the whole sequence, not counting the initial sort.
*/
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int next_permutation(int n, char **s)
{
	/**
	* Complete this method
	* Return 0 when there is no next permutation and 1 otherwise
	* Modify array s to its next permutation
	*/
    // Find non-increasing suffix
    int i = n-1;
    while(i>0 && strcmp(s[i-1],s[i])>=0) 
        i--;    // find key
    if (i<=0) return 0;
    
    // Swap key with its successor in suffix
    int j = n-1;
    while(strcmp(s[i-1],s[j])>=0) 
        j--;    // find rightmost successor to key
    char *tmp = s[i-1];
    s[i-1] = s[j];
    s[j] = tmp;
    
    // Reverse the suffix
    j = n-1;
    while(i<j) {
        tmp = s[i];
        s[i] = s[j];
        s[j] = tmp;
        i++;
        j--;
    }
    return 1;
}

int main()
{
	char **s;
	int n;
	scanf("%d", &n);
	s = calloc(n, sizeof(char*));
	for (int i = 0; i < n; i++)
	{
		s[i] = calloc(11, sizeof(char));
		scanf("%s", s[i]);
	}
	do
	{
		for (int i = 0; i < n; i++)
			printf("%s%c", s[i], i == n - 1 ? '\n' : ' ');
	} while (next_permutation(n, s));
	for (int i = 0; i < n; i++)
		free(s[i]);
	free(s);
	return 0;
}
