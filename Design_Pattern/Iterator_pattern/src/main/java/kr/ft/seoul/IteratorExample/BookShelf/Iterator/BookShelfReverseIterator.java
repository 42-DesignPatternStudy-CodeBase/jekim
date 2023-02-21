package kr.ft.seoul.IteratorExample.BookShelf.Iterator;

import kr.ft.seoul.IteratorExample.BookShelf.Book;
import kr.ft.seoul.IteratorExample.BookShelf.BookShelf;

public class BookShelfReverseIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;

    public BookShelfReverseIterator(BookShelf bs) {
        this.bookShelf = bs;
        this.index = bs.getLength() - 1;
    }

    public Book get() {
        return this.bookShelf.getAt(this.index);
    }

    public boolean hasNext() {
        return this.index >= 0;
    }

    public Book next() {
        return this.bookShelf.getAt(this.index--);
    }
}