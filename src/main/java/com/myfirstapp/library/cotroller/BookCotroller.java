package com.myfirstapp.library.cotroller;

import com.myfirstapp.library.model.Book;
import com.myfirstapp.library.model.BookDTO;
import com.myfirstapp.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookCotroller {
    @Autowired
    private BookService service;

    public List<BookDTO> getBooks()
    {
        //Validate authorization
        //authentication
        //request format
       return service.findAll();
    }

    public boolean add( Book book){
        return service.addBook(book);
    }
}
