package co.mobiwise.rest.domain;

import javax.persistence.*;

/**
 * Created by yusuf on 1/13/16.
 */
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue
    @Column(name = "id")
    private long id;

    @Column(name = "bookName")
    private String bookName;

    @Column(name = "bookDesc")
    private String bookDesc;

    public long getId() {
        return id;
    }

    public void setId(long id) {
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
