package IteratorDesignPattern;

import java.util.Arrays;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        List<Book> bookList = Arrays.asList(
            new Book(100, "Science"),
            new Book(200, "Maths"),
            new Book(50, "GK"),
            new Book(235, "Sociology")
        );

        Library lib = new Library(bookList);

        Iterator itr = lib.createIterator();

        while(itr.hasNext()){
            Book book = (Book) itr.next();
            System.out.println(book.getBookName());
        }


    }
}
