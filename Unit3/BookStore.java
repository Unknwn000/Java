import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Book implements Serializable {
    private String bookTitle;
    private double bookPrice;
    private int bookId;

    public Book(String bookTitle, double bookPrice, int bookId) {
        this.bookTitle = bookTitle;
        this.bookPrice = bookPrice;
        this.bookId = bookId;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public double getBookPrice() {
        return bookPrice;
    }

    public int getBookId() {
        return bookId;
    }

    @Override
    public String toString() {
        return "Book [Title=" + bookTitle + ", Price=" + bookPrice + ", ID=" + bookId + "]";
    }
}

public class BookStore {
    public static void main(String[] args) {
        List<Book> books = new ArrayList<>();

        books.add(new Book("SMIT KI ATMAKATHA", 10.99, 1));
        books.add(new Book("RHYTHM KI ATMAKATHA", 12.99, 2));
        books.add(new Book("ANSHUL KI ATMAKATHA", 15.99, 3));
        books.add(new Book("JP KI ATMAKATHA", 9.99, 4));

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("bookdetails.dat"))) {
            for (Book book : books) {
                oos.writeObject(book);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        String titleToSearch = "JP KI ATMAKATHA";
        Book foundBook = null;

        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("bookdetails.dat"))) {
            while (true) {
                Book book = (Book) ois.readObject();
                if (book.getBookTitle().equals(titleToSearch)) {
                    foundBook = book;
                    break;
                }
            }
        } catch (EOFException e) {

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }

        if (foundBook != null) {
            System.out.println("Found book with title: " + foundBook.getBookTitle());
        } else {
            System.out.println("Book not found.");
        }

        // Find the book with the highest price
        Book bookWithHighestPrice = Collections.max(books, (b1, b2) -> Double.compare(b1.getBookPrice(), b2.getBookPrice()));
        System.out.println("Book with the highest price: " + bookWithHighestPrice);
    }
}
