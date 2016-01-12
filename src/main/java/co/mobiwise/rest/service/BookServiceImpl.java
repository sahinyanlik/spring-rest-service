package co.mobiwise.rest.service;

import co.mobiwise.rest.dao.BookDAO;
import co.mobiwise.rest.domain.Book;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by yusuf on 1/13/16.
 */
public class BookServiceImpl implements BookService {

    @Autowired
    BookDAO bookDAO;

    public boolean addBook(Book book) {
        return bookDAO.addBook(book);
    }

    public Book getBookById(long id) {
        return bookDAO.getBookById(id);
    }

    public List<Book> getBookList() {
        return bookDAO.getBookList();
    }

    public boolean deleteBook(long id) {
        return bookDAO.deleteBook(id);
    }
}
