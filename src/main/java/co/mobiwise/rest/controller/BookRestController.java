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

    @Autowired
    BookService bookService;

    static final Logger logger = Logger.getLogger(BookRestController.class);


    @RequestMapping(value="/book", method = RequestMethod.GET)
    public @ResponseBody
    List<Book> getBookList() {
        List<Book> bookList = null;
        try {
            bookList = bookService.getBookList();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bookList;
    }

    @RequestMapping(value = "/book", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    String addBook(@RequestBody Book book){
        try{
            bookService.addBook(book);
            return  "Book added";
        } catch (Exception e) {
            return e.toString();
        }
    }

    @RequestMapping(value="/book/{id}", method = RequestMethod.GET)
    public @ResponseBody
    Book getBookById(@PathVariable("id") long id){
        Book book = null;
        try {
            book = bookService.getBookById(id);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return book;
    }

    @RequestMapping(value="/book/{id}", method = RequestMethod.DELETE)
    public @ResponseBody
    String deleteBook(@PathVariable("id") long id){
        try {
            bookService.deleteBook(id);
            return "book deleted";
        } catch (Exception e) {
            return e.toString();
        }
    }
}