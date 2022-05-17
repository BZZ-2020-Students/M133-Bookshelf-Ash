package ch.bzz.dev.ash.bookshelf.model;

import ch.bzz.dev.ash.bookshelf.data.DataHandler;
import com.fasterxml.jackson.annotation.JsonIgnore;

import java.math.BigDecimal;

public class Book {
    @JsonIgnore
    private Publisher publisher;

    private String bookUUID;
    private String title;
    private String author;
    private BigDecimal price;
    private String isbn;

    public Book() {
    }

    public Book(String bookUUID, String title, String author, Publisher publisher, BigDecimal price, String isbn) {
        this.bookUUID = bookUUID;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.price = price;
        this.isbn = isbn;
    }

    /**
     * gets the publisherUUID from the Publisher-object
     *
     * @return
     */
    public String getPublisherUUID() {
        return getPublisher().getPublisherUUID();
    }

    /**
     * creates a Publisher-object without the booklist
     *
     * @param publisherUUID
     */
    public void setPublisherUUID(String publisherUUID) {
        setPublisher(new Publisher());
        Publisher publisher = DataHandler.getInstance().readPublisherByUUID(publisherUUID);
        getPublisher().setPublisherUUID(publisherUUID);
        getPublisher().setPublisher(publisher.getPublisher());

    }

    public String getBookUUID() {
        return bookUUID;
    }

    public void setBookUUID(String bookUUID) {
        this.bookUUID = bookUUID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
}
