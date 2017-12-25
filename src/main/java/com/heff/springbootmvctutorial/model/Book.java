package com.heff.springbootmvctutorial.model;

/**
 * Model
 */
public class Book {

    private int id;
    private String name;
    private String author;

    /**
     * private default constructor
     */
    private Book() {

    }

    /**
     * private constructor with params
     */
    private Book(int id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

    /**
     * Factory, to build new Book
     * @param id
     * @param name
     * @param author
     * @return new book instance
     */
    public static Book provideNewBook(int id, String name, String author) {

        return new Book(id, name, author);
    }

    /**
     * Gets id
     *
     * @return value of id
     */
    public int getId() {
        return id;
    }

    /**
     * set id
     *
     * @Param id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Gets name
     *
     * @return value of name
     */
    public String getName() {
        return name;
    }

    /**
     * set name
     *
     * @Param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets author
     *
     * @return value of author
     */
    public String getAuthor() {
        return author;
    }

    /**
     * set author
     *
     * @Param author
     */
    public void setAuthor(String author) {
        this.author = author;
    }
}
