
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author emeji
 */
public class Library {

    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<Book>();
    }

    public void addBook(Book book) {
        this.books.add(book);
    }

    public void printBooks() {
        for (Book bk : books) {
            System.out.println(bk.title() + ", " + bk.publisher() + ", " + bk.year());
        }
    }

    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> foundBooks = new ArrayList<Book>();
        for (Book bk : books) {
            //  if (bk.title().contains(title)) {
            if (StringUtils.included(bk.title(), title)) {
                foundBooks.add(new Book(bk.title(), bk.publisher(), bk.year()));
            }
        }
        return foundBooks;
    }

    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> foundBooks = new ArrayList<Book>();
        for (Book bk : books) {
            // if(bk.publisher().contains(publisher)){
            if (StringUtils.included(bk.publisher(), publisher)) {
                foundBooks.add(new Book(bk.title(), bk.publisher(), bk.year()));
            }
        }
        return foundBooks;

    }

    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> foundBooks = new ArrayList<Book>();
        for (Book bk : books) {
            if (bk.year() == year) {
                //if(StringUtils.included(bk.year(), searched)){
                foundBooks.add(new Book(bk.title(), bk.publisher(), bk.year()));
            }
        }
        return foundBooks;

    }
}
