package co.mobiwise.rest.dao;

import co.mobiwise.rest.domain.Book;

import java.util.List;

/**
 * Created by yusuf on 1/13/16.
 */
public interface BookDAO {

    public boolean addBook(Book book);
    public Book getBookById(long id);
    public List<Book> getBookList();
    public boolean deleteBook(long id);
}
