package methods;

import java.util.stream.Stream;

public class Three_five_not_seven {


    public Stream print_dividable() {
        Stream<Integer> numbers = Stream.iterate(1, A -> A + 1).limit(10000);
        numbers
                .map(A -> A * (A - 1))
                .filter(A -> A % 3 == 0 && A % 5 == 0 && A % 7 != 0)
                .forEach(A -> System.out.println(A));

        return numbers;
    }
}
