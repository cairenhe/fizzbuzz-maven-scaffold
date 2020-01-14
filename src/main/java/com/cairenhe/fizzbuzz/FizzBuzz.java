package com.cairenhe.fizzbuzz;

public class FizzBuzz {
    public String of(int number) {
        StringBuilder sb = new StringBuilder();
        if (number % 3 == 0) {
            sb.append("Fizz");
        }
        if (number % 5 == 0) {
            sb.append("Buzz");
        }
        if (sb.length() == 0) {
            return String.valueOf(number);
        }
        return sb.toString();
    }
}
