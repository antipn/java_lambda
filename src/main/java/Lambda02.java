import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;

public class Lambda02 {

    public static void main(String[] args) {

        //Anonymous inner Class: Runnable
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Run 1 process");
            }
        };

        //lambda version
        Runnable r2 = () -> System.out.println("Run 2 process");


        //start threads
        r1.run();
        r2.run();

        //using an existing functional interface BiFunction

        BiFunction<String, String, String> concat = String::concat;
        String sentence = concat.apply("Today is ", "great day");
        System.out.println(sentence);

        //example of consumer interface

        Consumer<String> hello = name -> System.out.println("Hello " + name);

        for (String name : Arrays.asList("Palmer", "Mambo", "BD")) {
            hello.accept(name);
        }

        //example of passing one value
        GreetingFunction greeting = message -> System.out.println("java p[rogramming " + message);
        greeting.sayMessage("Rocks with lambda expressions");


    }

    @FunctionalInterface
    interface GreetingFunction {
        void sayMessage(String message);
    }
}
