package Uppgift1.Uppgift1c;

import java.util.Objects;

public class Book {
    String title;
    String author;
    String genre;
    String color;
    int grade;
    String owner;
    boolean isFiction;


    public Book(String title, String author, String genre, String color, int grade, String owner, boolean isFiction) {
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.color = color;
        this.grade = grade;
        this.owner = owner;
        this.isFiction = isFiction;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getGenre() {
        return genre;
    }

    public String getColor() {
        return color;
    }

    public int getGrade() {
        return grade;
    }

    public String getOwner() {
        return owner;
    }

    public boolean isFiction() {
        return isFiction;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Book book)) return false;
        return grade == book.grade && isFiction == book.isFiction && Objects.equals(title, book.title) && Objects.equals(author, book.author) && Objects.equals(genre, book.genre) && Objects.equals(color, book.color) && Objects.equals(owner, book.owner);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, genre, color, grade, owner, isFiction);
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", genre='" + genre + '\'' +
                ", color='" + color + '\'' +
                ", grade=" + grade +
                ", owner='" + owner + '\'' +
                ", isFiction=" + isFiction +
                '}';
    }
}
