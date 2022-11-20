package com.learning.domain;

public class book {
    Integer id;
    String bookName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    @Override
    public String toString() {
        return "book{" +
                "id=" + id +
                ", bookName='" + bookName + '\'' +
                '}';
    }
}
