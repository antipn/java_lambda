package lesson04;

public class Lambda04 {

    public static void main(String[] args) {

        Calculate add = (a, b) -> a + b;
        System.out.println(add.calc(10, 22));

        Calculate divide = (a, b) -> b != 0 ? a / b : 0;
        System.out.println(divide.calc(10, 4));

        Calculate difference = (a, b) -> Math.abs(a - b);
        System.out.println(difference.calc(4, 5));

        Calculate multiply = (a,b) -> a*b;
        System.out.println(multiply.calc(10,11));

    }


}
