package nl.ekholabs.microservices.bookstore.domain;

import java.io.Serializable;

public class BookDTO implements Serializable {

    private String id;

    private String title;

    private String author;

    public BookDTO() {
    }

    public BookDTO(String id, String title, String author) {
        this.id = id;
        this.title = title;
        this.author = author;
    }

    public static BookDTO createBookDTO(String id, String title, String author) {
        return new BookDTO(id, title, author);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookDTO that = (BookDTO) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (title != null ? !title.equals(that.title) : that.title != null) return false;
        return author != null ? author.equals(that.author) : that.author == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (title != null ? title.hashCode() : 0);
        result = 31 * result + (author != null ? author.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "BookDTO{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}