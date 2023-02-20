package lesson03;

import java.lang.module.FindException;
import java.math.BigInteger;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.UnaryOperator;

public class Lambda03 {
    public static void main(String[] args) {
        IntFunction<String> intToString = Integer::toString;
        System.out.println("expected value is 3, actual value: " + intToString.apply(123).length());

        //lambda made using a constructor
        Function<String, BigInteger> newBigInt = BigInteger::new;
        System.out.println("expected value: 1234567890, actual value: " + newBigInt.apply("1234567890"));

        //example of a lambda made from an instance method
        Consumer<String> print = System.out::println;
        print.accept("Coming to you directly from a lambda...");

        UnaryOperator<String> makeGreetings = "Hello "::concat;
        System.out.println(makeGreetings.apply("dude"));


    }
}
