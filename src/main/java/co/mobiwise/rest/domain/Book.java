package co.mobiwise.rest.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by yusuf on 1/13/16.
 */
@Entity
public class Book {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "bookName")
    private String bookName;

    @Column(name = "bookDesc")
    private String bookDesc;

    public Book() {
    }

    public Book(int id, String bookName, String bookDesc) {
        this.id = id;
        this.bookName = bookName;
        this.bookDesc = bookDesc;
    }

    public Book(String bookName, String bookDesc) {
        this.bookName = bookName;
        this.bookDesc = bookDesc;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookDesc() {
        return bookDesc;
    }

    public void setBookDesc(String bookDesc) {
        this.bookDesc = bookDesc;
    }
}
