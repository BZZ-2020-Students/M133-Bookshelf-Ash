package ch.bzz.dev.ash.bookshelf.model;

import java.util.List;

public class Publisher {
    private String publisherUUID;
    private String publisher;
    private List<Book> bookList;

    public Publisher() {
    }

    public Publisher(String publisherUUID, String publisher, List<Book> bookList) {
        this.publisherUUID = publisherUUID;
        this.publisher = publisher;
        this.bookList = bookList;
    }

    public String getPublisherUUID() {
        return publisherUUID;
    }

    public void setPublisherUUID(String publisherUUID) {
        this.publisherUUID = publisherUUID;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }
}
