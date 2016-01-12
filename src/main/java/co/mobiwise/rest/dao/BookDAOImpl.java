package co.mobiwise.rest.dao;

import co.mobiwise.rest.domain.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * Created by yusuf on 1/13/16.
 */
public class BookDAOImpl implements BookDAO {

    @Autowired
    SessionFactory sessionFactory;

    Session session = null;
    Transaction tx = null;

    public boolean addBook(Book book) {
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        session.save(book);
        tx.commit();
        session.close();
        return false;
    }

    public Book getBookById(long id) {
        session = sessionFactory.openSession();;
        Book book = (Book) session.load(Book.class, new Long(id));
        tx = session.getTransaction();
        tx = session.beginTransaction();
        tx.commit();
        return book;
    }

    @SuppressWarnings("unchecked")
    public List<Book> getBookList() {
        session = sessionFactory.openSession();
        tx = session.beginTransaction();
        List<Book> bookList = session.createCriteria(Book.class).list();
        tx.commit();
        session.close();
        return bookList;
    }

    public boolean deleteBook(long id) {
        session = sessionFactory.openSession();
        Object book = session.load(Book.class, id);
        tx = session.getTransaction();
        session.beginTransaction();
        session.delete(book);
        tx.commit();
        return false;
    }
}
