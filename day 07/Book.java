import java.time.Year;

// ======================================================
// Task: Build a Book class
// ======================================================

class Book {

    // Task: Fields
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;
    private static int bookCount;
    private static final DEFAULT_GENRE = "Fiction" ;

    public String getTitle() {
        return title;
    }

    public void setTitle(Str) {
        if (title != null && !title.equals("")) {
            this.title = title
        } else {
            throw new IllegalArgumentException();
        }
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor() {
        if (Auther != null && !author.equals("")) {
            this.author = author;
        } else (
        throw new IllegalArgumentException(())
                )
    }

    public int getYear() {
        return Year;
    }

    public boolean getIsAvailable() {
        return isAvailable;
    }

    public String bookCount() {
        return bookCount;
    }

    public void


    // Task: Full constructor
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
        bookCount++;
    }

    // Task: Two-argument constructor using this(...)
    public Book(String title, String author) {
        this(title, author, 2024);
    }

    // Task: checkout()
    public void checkout() {
        isAvailable = false;
        System.out.println(title + " has been checked out.");
    }

    // Task: returnBook()
    public void returnBook() {
        isAvailable = true;
        System.out.println(title + " has been returned.");
    }

    // Task: describe()
    public void describe() {
        System.out.println(
                "Title: " + title +
                        ", Author: " + author +
                        ", Year: " + year +
                        ", Available: " + isAvailable);
    }

    // Task: static int getBookCount()
    public static int getBookCount() {
        return bookCount;
    }
}


