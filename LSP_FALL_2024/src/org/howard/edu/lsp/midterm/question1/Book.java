/**
*  Name: Isaac Nyadu Adjei
*/
package org.howard.edu.lsp.midterm.question1;

class Book {

    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    /**
     * Gets the title of the book.
     *
     * @return the title of the book
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets the title of the book.
     *
     * @param title the new title of the book
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * Gets the author of the book.
     *
     * @return the author of the book
     */
    public String getAuthor() {
        return author;
    }

    /**
     * Sets the author of the book.
     *
     * @param author the new author of the book
     */
    public void setAuthor(String author) {
        this.author = author;
    }

    /**
     * Gets the ISBN of the book.
     *
     * @return the ISBN of the book
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * Sets the ISBN of the book.
     *
     * @param ISBN the new ISBN of the book
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    /**
     * Gets the year the book was published.
     *
     * @return the year the book was published
     */
    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * Sets the year the book was published.
     *
     * @param yearPublished the new year the book was published
     */
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    /**
     * Compares this book to another object for equality.
     * Two books are considered equal if they have the same ISBN and author.
     *
     * @param obj the object to compare to
     * @return true if the objects are equal, false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj instanceof Book) {
            Book other = (Book) obj;
            return ISBN.equals(other.ISBN) && author.equals(other.author);
        }
        return false;
    }

    /**
     * Returns a string representation of the book, including title, author, ISBN, and year published.
     *
     * @return a string representation of the book
     */
    @Override
    public String toString() {
        return "Title: " + title +
               ", Author: " + author +
               ", ISBN: " + ISBN +
               ", Year Published: " + yearPublished;
    }
}
