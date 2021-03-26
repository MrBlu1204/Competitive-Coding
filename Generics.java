/*
Generics

Generic constructs are a very efficient way of reusing your code. In the same way you have parameters for a function, generics parameterize type and allow you to use apply the same interface, class, or method using different data types while still restricting operations to that data type (meaning that you still get strong type checking at compile time).

Sounds confusing? You've already used generics in more than one challenge! Consider the List and Map interfaces, as well as the classes that implement them. Their respective headings are:

public interface List<E> extends Collection<E>
public interface Map<K,V>


The letters enclosed between angle brackets (< and >) are type parameters and, like many things in programming, there is a convention behind them (remember, following conventions help us write clean, readable code!). The letters below are commonly-used generic type parameters:

E - Element
K - Key
V - Value
N - Number
T - Type (e.g.: data type)
S,U,V, etc. These are second, third, and fourth types for when T is already in use.

A parameterized type is basically a class or interface name that is immediately followed by a type parameter in angle brackets. Observe that List and Map are both parameterized types, and their respective parameters (E, K, and V) all follow the conventions shown above. This helps us make some assumptions about the type of objects these type parameters are standing in for.


Just like we pass arguments to functions and methods, we need to specify data types for our type parameters when we instantiate generic objects. For example:

List<String> stringList = new LinkedList<String>();
List<Integer> integerList = new ArrayList<Integer>();
Map<String, String> stringToStringMap = new HashMap<String, String>();
Map<String, Integer> stringToIntMap = new LinkedHashMap<String, Integer>();

Once a data type is specified and an object is created, the specified type replaces every ocurrence of the generic type parameter in the instantiated class. The compiler also performs strict type checking to ensure you haven't tried to do anything not allowable for that data type (e.g.: trying to add an element to integerList that isn't of type Integer).

Task
Write a single generic function named printArray; this function must take an array of generic elements as a parameter (the exception to this is C++, which takes a vector). The locked Solution class in your editor tests your function.

Note: You must use generics to solve this challenge. Do not write overloaded functions.

Input Format

The locked Solution class in your editor will pass different types of arrays to your printArray function.

Constraints

You must have exactly  function named printArray.
Output Format

Your printArray function should print each element of its generic array parameter on a new line.
*/

import java.util.*;

class Printer <T> {

    /**
    *    Method Name: printArray
    *    Print each element of the generic array on a new line. Do not return anything.
    *    @param A generic array
    **/
    
    // Write your code here
    public <E> void printArray(E[] array) {
        for (E element : array) {
            System.out.println(element);
        }
    }
}

public class Generics {
    
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Integer[] intArray = new Integer[n];
        for (int i = 0; i < n; i++) {
            intArray[i] = scanner.nextInt();
        }

        n = scanner.nextInt();
        String[] stringArray = new String[n];
        for (int i = 0; i < n; i++) {
            stringArray[i] = scanner.next();
        }
        
        Printer<Integer> intPrinter = new Printer<Integer>();
        Printer<String> stringPrinter = new Printer<String>();
        intPrinter.printArray( intArray  );
        stringPrinter.printArray( stringArray );
        if(Printer.class.getDeclaredMethods().length > 1){
            System.out.println("The Printer class should only have 1 method named printArray.");
        }
    } 
}
