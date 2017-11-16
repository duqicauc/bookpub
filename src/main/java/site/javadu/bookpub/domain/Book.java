package site.javadu.bookpub.domain;

import javax.persistence.*;

import java.util.List;

@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;
    private String isbn;
    private String title;
    private String description;

    @ManyToOne
    private Author author;
    @ManyToOne
    private Publisher publisher;

    @ManyToMany
    private List<Publisher.Reviewer> reviewers;

    protected Book() { }

    public Book(Author author, String isbn, Publisher publisher, String title) {
        this.author = author;
        this.isbn = isbn;
        this.publisher = publisher;
        this.title = title;
    }
}
