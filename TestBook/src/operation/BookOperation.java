package operation;

import book.BookList;

public interface BookOperation {
    public void AddOperation(BookList booklist);

    public void BorrowOperation(BookList booklist);

    public void DeleteOperation(BookList booklist);

    public void DisplayOperation(BookList booklist);

    public void ExitOperation(BookList booklist);

    public void FindOperation(BookList booklist);

    public void ReturnOperation(BookList booklist);
}
