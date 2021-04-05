/*
You are given an array of integers, marks, denoting the marks scored by students in a class.

The alternating elements marks0, marks2, marks4 and so on denote the marks of boys.
Similarly, marks1, marks3, marks3 and so on denote the marks of girls.
The array name, marks, works as a pointer which stores the base address of that array. In other words, marks contains the address where marks0 is stored in the memory.

For example, let marks=[3,2,5] and marks stores 0x7fff9575c05f. Then, 0x7fff9575c05f is the memory address of marks0.

Calculate the sum of the marks of boys or girls as per the given gender
*/

#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

//Complete the following function.

int marks_summation(int* marks, int number_of_students, char gender) {
  //Write your code here.
  int i;
  if(gender=='b'){
      i = 0;
  }
  else{
      i=1;
  }
  int sum =0;
  while(i<number_of_students){
      sum += marks[i];
      i += 2;
  }
  return sum;
}

int main() {
    int number_of_students;
    char gender;
    int sum;
  
    scanf("%d", &number_of_students);
    int *marks = (int *) malloc(number_of_students * sizeof (int));
 
    for (int student = 0; student < number_of_students; student++) {
        scanf("%d", (marks + student));
    }
    
    scanf(" %c", &gender);
    sum = marks_summation(marks, number_of_students, gender);
    printf("%d", sum);
    free(marks);
 
    return 0;
}
