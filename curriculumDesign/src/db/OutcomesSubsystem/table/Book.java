package db.OutcomesSubsystem.table;

public class Book {
    private String RNO;             //成果id
    private String book_name;       //教材名称
    private String book_company;    //出版社
    private String book_rank;       //教材等级
    private String book_source;     //教材内容

    public Book(){}

    public Book(String RNO, String book_name, String book_company, String book_rank, String book_source) {
        this.RNO = RNO;
        this.book_name = book_name;
        this.book_company = book_company;
        this.book_rank = book_rank;
        this.book_source = book_source;
    }

    public String getRNO() {
        return RNO;
    }

    public void setRNO(String RNO) {
        this.RNO = RNO;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getBook_company() {
        return book_company;
    }

    public void setBook_company(String book_company) {
        this.book_company = book_company;
    }

    public String getBook_rank() {
        return book_rank;
    }

    public void setBook_rank(String book_rank) {
        this.book_rank = book_rank;
    }

    public String getBook_source() {
        return book_source;
    }

    public void setBook_source(String book_source) {
        this.book_source = book_source;
    }

    @Override
    public String toString() {
        return "Book{" +
                "RNO='" + RNO + '\'' +
                ", book_name='" + book_name + '\'' +
                ", book_company='" + book_company + '\'' +
                ", book_rank='" + book_rank + '\'' +
                ", book_source='" + book_source + '\'' +
                '}';
    }
}
