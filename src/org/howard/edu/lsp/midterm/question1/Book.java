package org.howard.edu.lsp.midterm.question1;

/**
 * Represents a book in a library.
 */
public class Book {
    private String title;
    private String author;
    private String ISBN;
    private int yearPublished;

    // Constructor
    public Book(String title, String author, String ISBN, int yearPublished) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.yearPublished = yearPublished;
    }

    /**
     * Gets the title of the book.
     *
     * @return The title of the book.
     */
    public String getTitle() {
        return title;
    }

    /**
     * Gets the author of the book.
     *
     * @return The author of the book.
     */
    public String getAuthor() {
        return author;
    }
    /**
     * Gets the ISBN of the book.
     *
     * @return The ISBN of the book.
     */
    public String getISBN() {
        return ISBN;
    }
    /**
     * Gets the year the book was published.
     *
     * @return The year of publication.
     */
    public int getYearPublished() {
        return yearPublished;
    }

    /**
     * Sets the title of the book.
     *
     * @param title The new title to set.
     */
    public void setTitle(String title) {
        this.title = title;
    }
    /**
     * Sets the author of the book.
     *
     * @param author The new author to set.
     */
    public void setAuthor(String author) {
        this.author = author;
    }
    /**
     * Sets the ISBN of the book.
     *
     * @param ISBN The new ISBN to set.
     */
    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
    /**
     * Sets the year the book was published.
     *
     * @param yearPublished The new year of publication to set.
     */
    public void setYearPublished(int yearPublished) {
        this.yearPublished = yearPublished;
    }

    /**
     * Compares this book to another object for equality.
     * Two books are considered equal if they have the same ISBN and author.
     *
     * @param obj The object to compare with.
     * @return true if the books are equal, false otherwise.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Book book = (Book) obj;
        return ISBN.equals(book.ISBN) && author.equals(book.author);
    }

    /**
     * Returns a string representation of the book.
     *
     * @return A string containing the book's title, author, ISBN, and year of publication.
     */
    @Override
    public String toString() {
        return "Book: " + title + " by " + author + " (ISBN: " + ISBN + ", Year: " + yearPublished + ")";
    }
}
