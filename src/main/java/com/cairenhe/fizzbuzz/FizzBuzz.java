package com.cairenhe.fizzbuzz;

public class FizzBuzz {
    public String of(int number) {
        StringBuilder stringBuilder = new StringBuilder();
        if (number % 3 == 0) {
            stringBuilder.append("Fizz");
        }
        if (number % 5 == 0) {
            stringBuilder.append("Buzz");
        }
        if (stringBuilder.length() == 0) {
            return String.valueOf(number);
        }
        return stringBuilder.toString();
    }
}
