package com.libraryonline.bookservice.repository;

import com.libraryonline.bookservice.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book, String> {

    Optional<Book> getBookByIsbn(String isbn);

}
