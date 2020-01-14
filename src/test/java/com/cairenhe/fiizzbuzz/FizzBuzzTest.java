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
            "FizzBuzz,15"
    })
    void test(String ex, int value){
        FizzBuzz fizzBuzz = new FizzBuzz();
        Assertions.assertEquals(ex, fizzBuzz.of(value));
    }
}
