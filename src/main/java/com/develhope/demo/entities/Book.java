package com.develhope.demo.entities;
/*Obiettivo: Crea un controller che gestisce una lista di "Books" e permette di cercare per titolo o autore tramite i Query Parameters.

Passaggi:
Crea un modello Book:

La classe Book avrà le seguenti proprietà: id, title, author, publishedYear.
Crea il controller BookController con un endpoint GET /books che:

Accetti i seguenti parametri di query: title e author (entrambi opzionali).
Filtro i libri per title e/o author e restituisca i risultati.
 */
public class Book {
    private String title, author;
    private int id, publishedYear;

    public Book(String title, String author, int id, int publishedYear) {
        this.title = title;
        this.author = author;
        this.id = id;
        this.publishedYear = publishedYear;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPublishedYear() {
        return publishedYear;
    }

    public void setPublishedYear(int publishedYear) {
        this.publishedYear = publishedYear;
    }
}
