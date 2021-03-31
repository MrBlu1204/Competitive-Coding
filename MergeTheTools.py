'''
Consider the following:
*   A string, s, of length n where s=C0C1C2...C(n-1).
*   An integer, k, where k is a factor of n.
We can split n into n/k substrings where each subtring, Ti, consists of a contiguous block of k characters in s. Then, use each Ti to create string Ui such that:
*   The characters in Ui are a subsequence of the characters in Ti.
*   Any repeat occurrence of a character is removed from the string such that each character in Ui occurs exactly once. In other words, if the character at some index j in Ti occurs at a previous index <j in Ti, then do not include the character in string Ui.
Given s and k, print  lines where each line i denotes string Ui.

Example
============
Sample Input
STDIN       Function
-----       --------
AABCAAADA   s = 'AABCAAADA'
3           k = 3
Sample Output
AB
CA
AD
There are three substrings of length 3 to consider: 'AAA', 'BCA' and 'DDE'. The first substring is all 'A' characters, so U1 = 'A'. The second substring has all distinct characters, so U2 = 'BCA'. The third substring has 2 different characters, so U3 = 'DE'. Note that a subsequence maintains the original order of characters encountered. The order of characters in each subsequence shown is important
'''

def merge_the_tools(string, k):
    # your code goes here
    for i in range(0,len(string),k):
        t = string[i:i+k]
        u =set()
        for i in t:
            if i not in u:
                print(i,end="")
                u.add(i)
        print()

if __name__ == '__main__':
    string, k = input(), int(input())
    merge_the_tools(string, k)
