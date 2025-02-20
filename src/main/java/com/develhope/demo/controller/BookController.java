package com.develhope.demo.controller;

import com.develhope.demo.entities.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/*Crea il controller BookController con un endpoint GET /books che:

Accetti i seguenti parametri di query: title e author (entrambi opzionali).
Filtro i libri per title e/o author e restituisca i risultati.
 */

@RestController
@RequestMapping("/books")
public class BookController {

    private List<Book> books = new ArrayList<>();

    public BookController() {
        books.add(new Book("Il nome della rosa", "Umberto Eco", 1, 1980));
        books.add(new Book("1984", "George Orwell", 2, 1949));
        books.add(new Book("Il signore degli anelli", "J.R.R. Tolkien", 3, 1954));
        books.add(new Book("I promessi sposi", "Alessandro Manzoni", 4, 1827));
    }

    @GetMapping("/titleorauthor")
    public List<Book> getBooks(@RequestParam (required = false) String title,
                               @RequestParam (required = false) String author) {
        List<Book> filteredBooks = new ArrayList<>();

        for (Book book : books) {
            if (title != null) {
                if (!book.getTitle().toLowerCase().contains(title.toLowerCase())) {
                    continue;
                }
            }

            if (author != null) {
                if (!book.getAuthor().toLowerCase().contains(author.toLowerCase())) {
                    continue;
                }
            }


            filteredBooks.add(book);
        }

        return filteredBooks;
    }


    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById (@PathVariable int id) {
        for (Book book : books) {
            if (book.getId() == id) {
                return ResponseEntity.ok(book);
            }
        }
        return ResponseEntity.notFound().build();
    }



}
