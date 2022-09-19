package main;

import methods.Even_numbers;
import methods.Three_five_not_seven;

import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
        Three_five_not_seven dividable = new Three_five_not_seven();
        Even_numbers even = new Even_numbers();

        Stream<Book> book = Stream.of(
                new Book("To Kill a Mockingbird", 90),
                new Book("The Book Thief", 100),
                new Book("Animal Farm", 120),
                new Book("Gone with the Wind", 110),
                new Book("The Giving Tree", 200),
                new Book("The Da Vinci Code", 80),
                new Book("Les Miserables", 320),
                new Book("The Little Prince", 140),
                new Book("Lord of the Flies", 90),
                new Book("The Alchemist", 130));

//Using Java Stream API find out sum of all numbers between 1 and 10000 that are dividable by both 3 and 5 but not dividable by 7//

        dividable.print_dividable();

//Using Java Stream API print first 100 even numbers that are not dividable by 8//

        even.print_even();

//3.1 Using Java Stream API print names (in alphabetic order) of all books that have price smaller than 100.//

        book
                .filter(A -> A.getPrice() < 100)
                .sorted(Comparator.comparing(A -> A.getName()))
                .forEach(A -> System.out.println(A.getName()));


//3.2 Using Java stream API find out how many books have name shorter than 5 characters.//

     /*   double count = book
                .filter(A -> A.getName().length() < 5)
                .count();
        System.out.println(count);*/

//3.3 Using Java stream API find out what is the average price of the book in the list//

    /*OptionalDouble myAverage =   book
                .mapToDouble(Book::getPrice)
                .average();
        System.out.println(myAverage);*/

//3.4 Using Java stream API find out if all books in list are cheaper than 500//

        /*  boolean counter =   book
                .noneMatch(A -> A.getPrice() > 500);
        System.out.println(counter);*/
    }

}

