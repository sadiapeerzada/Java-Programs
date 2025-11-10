package com.company;
public class week_12_1 {
        // Method that may throw ArithmeticException
        public static int divide(int a, int b) {
            return a / b; // division by zero will throw ArithmeticException
        }
        public static void main(String[] args) {
            int[] numbers = {10, 20, 30, 40};
            int divisor[] = {2, 0, 5, 0}; // contains zeros to cause exception

            for (int i = 0; i < numbers.length; i++) {
                try {
                    int result = divide(numbers[i], divisor[i]);
                    System.out.println("Result: " + result);
                } catch (ArithmeticException e) {
                    System.out.println("Cannot divide by zero for index " + i);
                }
            }
        }
    }


