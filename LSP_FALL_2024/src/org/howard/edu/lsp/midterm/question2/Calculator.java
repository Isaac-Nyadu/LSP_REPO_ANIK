/**
*  Name: Isaac Nyadu Adjei
*/
package org.howard.edu.lsp.midterm.question2;


public class Calculator {

 /**
  * Sums two integers.
  *
  * @param a the first integer to sum
  * @param b the second integer to sum
  * @return the sum of {@code a} and {@code b}
  */
 public static int sum(int a, int b) {
     return a + b;
 }

 /**
  * Sums two double values.
  *
  * @param a the first double to sum
  * @param b the second double to sum
  * @return the sum of {@code a} and {@code b}
  */
 public static double sum(double a, double b) {
     return a + b;
 }

 /**
  * Sums all elements in an array of integers.
  *
  * @param arr the array of integers to sum
  * @return the total sum of all elements in {@code arr}
  */
 public static int sum(int[] arr) {
     int total = 0;
     for (int num : arr) {
         total += num;
     }
     return total;
 }
}
