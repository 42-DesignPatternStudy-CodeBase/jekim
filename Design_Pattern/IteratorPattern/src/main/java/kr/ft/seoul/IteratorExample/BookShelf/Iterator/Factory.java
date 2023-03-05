package kr.ft.seoul.IteratorExample.BookShelf.Iterator;

import kr.ft.seoul.IteratorExample.BookShelf.BookShelfAggregate;

public abstract class Factory {
    public final Iterator create(BookShelfAggregate list, int type) {
        Iterator p = createProduct(list, type);
        return p;
    }

    protected abstract Iterator createProduct(BookShelfAggregate list, int type);
}