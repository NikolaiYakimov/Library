package com.myfirstapp.library;

import com.myfirstapp.library.cotroller.BookCotroller;
import com.myfirstapp.library.model.Book;
import com.myfirstapp.library.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class LibraryApplication implements CommandLineRunner {
    @Autowired
    BookCotroller controller ;


    public static void main(String[] args) {
        SpringApplication.run(LibraryApplication.class, args);

    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("Library manager is running");

        controller.add(new Book("Foundation",new ArrayList<String>(){{add("Ivan Lilov");}},1942));

        System.out.println(controller.getBooks().toString());

        controller.add(new Book("1756",new ArrayList<String>(){{add("Nikolay Yakimov");}},1756));

        System.out.println(controller.getBooks().toString());
    }
}
