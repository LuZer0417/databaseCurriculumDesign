package db.OutcomesSubsystem.tableDAO;

import db.OutcomesSubsystem.table.Book;

public interface BookDAO {
    void insertBook(Book book) throws Exception;
    Book selectBook(String RNO) throws Exception;
    void deleteBook(String RNO) throws Exception;
}
