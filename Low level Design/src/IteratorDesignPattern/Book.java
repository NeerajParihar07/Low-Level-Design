package IteratorDesignPattern;

public class Book {
    private int price; 
    private String bookName;

    public Book(int p, String name)
    {
        this.price = p;
        this.bookName = name;
    }

    public int getPrice(){
        return price;
    }

    public String getBookName(){
        return bookName;
    }
} 
