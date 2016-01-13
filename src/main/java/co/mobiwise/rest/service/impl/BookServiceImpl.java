package co.mobiwise.rest.service.impl;

import co.mobiwise.rest.dao.BookDAO;
import co.mobiwise.rest.dao.GenericDAO;
import co.mobiwise.rest.domain.Book;
import co.mobiwise.rest.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * Created by yusuf on 1/13/16.
 */
@Service
public class BookServiceImpl extends GenericServiceImpl<Book, Integer> implements BookService {

    public BookDAO bookDAO;
    public BookServiceImpl(){
    }

    @Autowired
    public BookServiceImpl(@Qualifier("bookDAOImpl") GenericDAO<Book, Integer> genericDAO){
        super(genericDAO);
        this.bookDAO = (BookDAO) genericDAO;
    }
}
