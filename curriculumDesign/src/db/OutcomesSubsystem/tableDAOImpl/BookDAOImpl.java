package db.OutcomesSubsystem.tableDAOImpl;

import db.DAO.dbconnection.ConnectionImpl;
import db.OutcomesSubsystem.table.Book;
import db.OutcomesSubsystem.tableDAO.BookDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class BookDAOImpl extends ConnectionImpl implements BookDAO {

    //添加教材
    public void insertBook(Book book) throws Exception {
        Connection con = null;
        String sql = "insert into book(RNO,book_name,book_company,book_rank,book_source) values(?,?,?,?,?)";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);
        psmt.setString(1,book.getRNO());
        psmt.setString(2,book.getBook_name());
        psmt.setString(3,book.getBook_company());
        psmt.setString(4,book.getBook_rank());
        psmt.setString(5,book.getBook_source());
        psmt.executeUpdate();
        con.close();
    }

    //查询教材
    public Book selectBook(String RNO) throws Exception {
        Connection con = null;
        String sql = "select * from book where RNO=?";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);
        psmt.setString(1,RNO);
        ResultSet rs = psmt.executeQuery();

        Book b = new Book();
        while (rs.next()) {
            b.setRNO(rs.getString(1));
            b.setBook_name(rs.getString(2));
            b.setBook_company(rs.getString(3));
            b.setBook_rank(rs.getString(4));
            b.setBook_source(rs.getString(5));
        }
        psmt.close();
        con.close();
        return b;
    }

    //删除教材
    public void deleteBook(String RNO) throws Exception {
        Connection con = null;
        String sql = "delete from book where RNO=?";
        con = getConnection();
        PreparedStatement psmt = con.prepareStatement(sql);

        psmt.setString(1,RNO);
        psmt.executeUpdate();
    }


}
