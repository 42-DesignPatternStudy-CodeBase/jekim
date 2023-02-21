package kr.ft.seoul.IteratorExample.BookShelf.Iterator;

import kr.ft.seoul.IteratorExample.BookShelf.BookShelfAggregate;

public class IteratorFactory extends Factory {

    @Override
    public Iterator createProduct(BookShelfAggregate bookShelf, int type) {
        if (type == 0) {
            return bookShelf.iterator();
        } else if (type == 1) {
            return bookShelf.reverseIterator();
        }
        return null;
    }
}