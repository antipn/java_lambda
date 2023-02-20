package lesson01;

import java.util.function.*;

public class Lambda01 {

    public static void main(String[] args) {
        //using the test method of Predicate

        Predicate<String> stringLen = (s) -> s.length() < 10;

        System.out.println(stringLen.test("Apples") + " - Apples is less than 10");

        //Consumer example uses accept method

        Consumer<String> consumerStr = (s) -> System.out.println(s.toLowerCase());
        consumerStr.accept("ABCD");

        // Function example

        Function<Integer, String> converter = (number) -> Integer.toString(number);
        System.out.println("Lenght of 26 is: " + converter.apply(26).length());

        // Supplier example
        Supplier<String> supplier = () -> "java is fun";
        System.out.println(supplier.get());

        //Binary operator example

        BinaryOperator<Integer> add = Integer::sum;
        System.out.println("add 10 + 25 is " + add.apply(10, 25));

        //Unary operator
        UnaryOperator<String> unaryOperator = String::toUpperCase;
        System.out.println(unaryOperator.apply("Thsi is message for converting to upper case"));



    }
}
