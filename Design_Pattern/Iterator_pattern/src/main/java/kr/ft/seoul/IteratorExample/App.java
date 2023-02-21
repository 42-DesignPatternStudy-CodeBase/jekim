package kr.ft.seoul.IteratorExample;

import kr.ft.seoul.IteratorExample.BookShelf.*;
import kr.ft.seoul.IteratorExample.BookShelf.Iterator.*;

public class App 
{
    public static void main( String[] args )
    {
        BookShelf bookShelf = new BookShelf(4);
        bookShelf.appendBook(new Book("Around the World in 80 Days"));
        bookShelf.appendBook(new Book("Bible"));
        bookShelf.appendBook(new Book("Cinderella"));
        bookShelf.appendBook(new Book("Daddy-Long-Legs"));

        Iterator it = bookShelf.iterator();
        while (it.hasNext()) {
            Book book = (Book)it.next();
            System.out.println("" + book.getName());
        }
    }
}
