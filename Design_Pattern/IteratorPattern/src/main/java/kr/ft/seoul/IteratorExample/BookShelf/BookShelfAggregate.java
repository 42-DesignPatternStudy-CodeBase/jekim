package kr.ft.seoul.IteratorExample.BookShelf;

import kr.ft.seoul.IteratorExample.BookShelf.Iterator.Iterator;

public interface BookShelfAggregate {
    public abstract Iterator iterator();
    public abstract Iterator reverseIterator();
    public int getLength();
}