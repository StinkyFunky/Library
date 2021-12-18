package org.itstep.model;

public class LiteratureBook extends Book{

    private String author;
    private int publishedYear;

    public LiteratureBook() {
    }

    public LiteratureBook(String name, String code, int pages, String author, int publishedYear) {
        super(name, code, pages);
        this.author = author;
        this.publishedYear = publishedYear;
    }

    public String getAuthor() {
        return author;
    }

    public Integer getPublishedYear() {
        return publishedYear;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublishedYear(Integer publishedYear) {
        this.publishedYear = publishedYear;
    }

    @Override
    public String getBookData() {
        return super.getBookData() + "Author: '" + author + '\'' + ", Published year: " + publishedYear;
    }
}
