package org.itstep.model;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private String name;
    private String city;
    private String country;
    private List<Book> books;

    public Library() {
    }

    public Library(String name, String city, String country, List<Book> books) {
        this.name = name;
        this.city = city;
        this.country = country;
        this.books = books;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public void printLibraryData() {
        System.out.println("Library: " + "name - '" + name + '\'' + ", city - '" + city + '\'' +
                ", country - '" + country + '\'' + ", books: ");
        for(Book book : books) {
            System.out.println(" " + book.getBookData());
        }
    }

    public void addBook(Book book) {
        for(int i = 0; i < books.size(); i++) {
            books.add(book);
        }
    }
}
