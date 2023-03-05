package kr.ft.seoul.IteratorExample.BookShelf.Iterator;

import kr.ft.seoul.IteratorExample.BookShelf.Book;
import kr.ft.seoul.IteratorExample.BookShelf.BookShelf;

public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index = 0;

    public BookShelfIterator(BookShelf bs) {
        this.bookShelf = bs;
    }

    public Book get() {
        return this.bookShelf.getAt(this.index);
    }

    public boolean hasNext() {
        return this.index < bookShelf.getLength();
    }

    public Book next() {
        return this.bookShelf.getAt(this.index++);
    }
}