package org.itstep.model;

public class Book {

    private String name;
    private String code;
    private int pages;

    public Book() {
    }

    public Book(String name, String code, int pages) {
        this.name = name;
        this.code = code;
        this.pages = pages;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public Integer getPages() {
        return pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public void setPages(Integer pages) {
        this.pages = pages;
    }

    public String getBookData(){
        return "Name: '" + name + '\'' + ", Code: '" + code + '\'' +
                ", Pages: " + pages + "\n";
    }
}
