package kr.ft.seoul.IteratorExample.BookShelf;

import kr.ft.seoul.IteratorExample.BookShelf.Iterator.*;

public class BookShelf implements BookShelfAggregate {
    private Book[] storage;
    private int limit;
    private int index = 0;

    public BookShelf(int size) {
        this.limit = size;
        this.storage = new Book[size];
    }

    public void appendBook(Book book) {
        if (index < limit) {
            this.storage[index] = book;
            index++;
        }
    }

    public Book getAt(int i) {
        if (i >= 0 && i < this.index) {
            return this.storage[i];
        }
        return null;
    }

    public int getLength() {
        return this.index;
    }

    public Iterator iterator() {
        return new BookShelfIterator(this);
    }

    public Iterator reverseIterator() {
        return new BookShelfReverseIterator(this);
    }
}