package co.mobiwise.rest.controller;

import co.mobiwise.rest.domain.Book;
import co.mobiwise.rest.service.BookService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by yusuf on 1/13/16.
 */
@Controller
@RequestMapping("/api")
public class BookRestController {

    @Autowired(required = true)
    BookService bookService;

    static final Logger logger = Logger.getLogger(BookRestController.class);

    /**
     * Get all books in a list.
     *
     * @return bookList
     */
    @RequestMapping(value="/book", method = RequestMethod.GET)
    public @ResponseBody
    List<Book> getBookList() {
        List<Book> bookList = null;
        try {
            bookList = bookService.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookList;
    }

    /**
     * Save new book. Spring automatically binds the bookName and bookDesc
     * parameters in the request to book argument
     * @param book
     * @return String indicating success or failure of add

     */
    @RequestMapping(value = "/book", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String addBook(@RequestBody Book book){
        try{
            bookService.add(book);
            return  "Book added";
        } catch (Exception e) {
            return e.toString();
        }
    }

    /**
     * Get book with id. example /book/1
     *
     * @param id
     *
     * @return book
     */
    @RequestMapping(value="/book/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Book getBookById(@PathVariable("id") int id){
        Book book = null;
        try {
            book = bookService.get(id);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    /**
     * Delete book with id.
     *
     * @param book
     *
     * @return String indicating success or failure of delete.
     */
    @RequestMapping(value="/book/{id}", method = RequestMethod.DELETE)
    public @ResponseBody
    String deleteBook(@RequestBody Book book){
        try {
            bookService.remove(book);
            return "book deleted";
        } catch (Exception e) {
            return e.toString();
        }
    }
}
