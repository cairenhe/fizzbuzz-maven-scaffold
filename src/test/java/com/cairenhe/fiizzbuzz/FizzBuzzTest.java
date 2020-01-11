package com.cairenhe.fiizzbuzz;

import com.cairenhe.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

class FizzBuzzTest {
    @ParameterizedTest
    @CsvSource({
            "Fizz,3",
            "Buzz,5",
            "FizzBuzz,15",
            "98,98"
    })
    void test(String except, int number){
        FizzBuzz fizzBuzz = new FizzBuzz();
        String result = fizzBuzz.of(number);
        Assertions.assertEquals(except, result);
    }
}
