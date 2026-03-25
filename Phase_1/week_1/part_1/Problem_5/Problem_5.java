package Phase_1.week_1.part_1.Problem_5;

public class Problem_5 {
    public static void main(String[] args) {
        Book b1 = new Book("one piece", "no", 1);
        Book b2 = new Book("solo", "sung", 2);
        Book b3 = new Book("naruto", "naruto", 3);

        Library library = new Library();
        library.addBook(b1);
        library.addBook(b2);
        library.displayAll();
        library.addBook(b3);
        library.displayAll();
        library.removeBook("one piece");
        library.removeBook("one piece");
        library.displayAll();


        library.searchByTitle("solo");
    }
}

class Book {
    String title;
    String author;
    int isbn;

    Book() {
    }

    Book(String title, String author, int isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
}

class Library {
    Book[] books = new Book[5];
    int idx = -1;

    void addBook(Book book) {
        if (idx < books.length - 1) {
            idx++;
            books[idx] = book;
        } else {
            System.out.println("Library is full.");
        }
    }

    void removeBook(String title) {
        if (idx == -1) {
            System.out.println("Library is empty.");
            return;
        }

        for (int i = 0; i <= idx; i++) {
            if (books[i] != null && books[i].title.equals(title)) {

                // Shift elements to left
                for (int j = i; j < idx; j++) {
                    books[j] = books[j + 1];
                }

                // Remove last duplicate after shift
                books[idx] = null;
                idx--;

                System.out.println(title + " removed successfully.");
                return;
            }
        }

        System.out.println(title + " not found.");
    }

    void searchByTitle(String title) {
        for (int i = 0; i <= idx; i++) {
            if (books[i] != null && books[i].title.equals(title)) {
                System.out.println("Title : " + books[i].title);
                System.out.println("Author : " + books[i].author);
                System.out.println("isbn : " + books[i].isbn);
                return;
            }
        }
        System.out.printf(title + " Not Found!");
    }

    void displayAll() {
        if (idx == -1) {
            System.out.printf("Libray is empty.");
            return;
        }
        for (int i = 0; i <= idx; i++) {
            System.out.println("Title : " + books[i].title);
            System.out.println("Author : " + books[i].author);
            System.out.println("isbn : " + books[i].isbn);
            System.out.println("-----------------------------------");
        }
    }

}
