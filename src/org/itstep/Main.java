package org.itstep;

import org.itstep.model.Book;
import org.itstep.model.Library;
import org.itstep.model.LiteratureBook;
import org.itstep.model.ScientificBook;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ScientificBook book1 = new ScientificBook("Project Hail Mary", "1", 500,
                5000, "Ballantine Books");
        ScientificBook book2 = new ScientificBook("Swearing Is Good For You", "2", 450,
                4500, "Ballantine Books");
        ScientificBook book3 = new ScientificBook("Mysteries Of The Quantum Universe", "3", 600,
                5500, "Ballantine Books");
        LiteratureBook book4 = new LiteratureBook("Pride and Prejudice", "4", 400,
                "Jane Austen", 1813);
        LiteratureBook book5 = new LiteratureBook("To Kill a Mockingbird", "5", 350,
                "Harper Lee", 1960);
        LiteratureBook book6 = new LiteratureBook("The Great Gatsby", "6", 500,
                "F. Scott Fitzgerald", 1925);

        List<Book> books = new ArrayList<>();

        books.add(book1);
        books.add(book2);
        books.add(book3);

        books.add(book4);
        books.add(book5);
        books.add(book6);

        Library library = new Library("Country library", "Toronto", "Canada", books);

        library.printLibraryData();
    }
}
