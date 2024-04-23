package com.sunny.Book.Library.System.model;


import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
//import javax.persistence.*;

import javax.validation.constraints.Pattern;

@Entity
@Table(name = "booksInfo")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotBlank(message = "Title is required") // This field is required
    private String title;

    @NotBlank(message = "Author Name is required")
    private String authorName;

//    @Pattern(regexp = "^\\d{3}-\\d{10}$", message = "ISBN must be in the format xxx-xxxxxxxxxx")

    @Pattern(regexp = "^(?:ISBN(?:-13)?:?\\s*)?(?=[0-9]{13}$|(?=(?:[0-9]+[-\\ ]){3})[-\\ 0-9]{17}$)[0-9]{1,5}[-\\ ]?[0-9]+[-\\ ]?[0-9]+[-\\ ]?[0-9]+[-\\ ]?[0-9]$", message = "ISBN must be in the correct format")
    @NotBlank(message = "isbn is required in correct format xxx-xxxxxxxxxx")
    private String isbn;


//    @NotBlank(message = "Year is required")
    private long publicationYear;

    public Book() {
    }



    public Book(long id, String title, String authorName, String isbn, long publicationYear) {
        this.id = id;
        this.title = title;
        this.authorName = authorName;
        this.isbn = isbn;
        this.publicationYear = publicationYear;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public Long getPublicationYear() {
        return publicationYear;
    }

    public void setPublicationYear(long publicationYear) {
        this.publicationYear = publicationYear;
    }
}
