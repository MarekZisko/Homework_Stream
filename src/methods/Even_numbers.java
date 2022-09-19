package methods;

import java.util.stream.Stream;

public class Even_numbers {

    public Stream print_even() {
        Stream<Integer> even_numbers = Stream.iterate(0, A -> A + 2).limit(100);
        even_numbers
                .filter(A -> A % 8 != 0)
                .forEach(A -> System.out.println(A));
        return even_numbers;
    }
}
