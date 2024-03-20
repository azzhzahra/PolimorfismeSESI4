/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package perpustakaan;

/**
 *
 * @author User
 */

// Kelas utama yang merepresentasikan sebuah buku
class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

// Kelas turunan yang merepresentasikan sebuah buku fiksi
class FictionBook extends Book {
    private String genre;

    public FictionBook(String title, String author, String genre) {
        super(title, author);
        this.genre = genre;
    }

    public String getGenre() {
        return genre;
    }
}

// Kelas turunan yang merepresentasikan sebuah buku non-fiksi
class NonFictionBook extends Book {
    private String subject;

    public NonFictionBook(String title, String author, String subject) {
        super(title, author);
        this.subject = subject;
    }

    public String getSubject() {
        return subject;
    }
}

public class Perpustakaan {
    public static void main(String[] args) {
        // Membuat objek berbagai jenis buku
        Book book1 = new Book("To Kill a Mockingbird", "Harper Lee");
        FictionBook book2 = new FictionBook("The Great Gatsby", "F. Scott Fitzgerald", "Classic");
        NonFictionBook book3 = new NonFictionBook("Sapiens: A Brief History of Humankind", "Yuval Noah Harari", "History");

        // Memanggil metode untuk mendapatkan detail buku
        System.out.println("Book 1: " + book1.getTitle() + " by " + book1.getAuthor());
        System.out.println("Book 2: " + book2.getTitle() + " by " + book2.getAuthor() + ", Genre: " + book2.getGenre());
        System.out.println("Book 3: " + book3.getTitle() + " by " + book3.getAuthor() + ", Subject: " + book3.getSubject());
    }
}