package co.mobiwise.rest.dao.impl;

import co.mobiwise.rest.dao.BookDAO;
import co.mobiwise.rest.domain.Book;
import org.springframework.stereotype.Repository;

/**
 * Created by yusuf on 1/13/16.
 */
@Repository
public class BookDAOImpl extends GenericDaoImpl<Book, Integer> implements BookDAO {

}
