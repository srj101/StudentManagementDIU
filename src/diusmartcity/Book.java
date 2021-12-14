package diusmartcity;

/**
 *
 * @author SRJOY
 */
public class Book {
    private int studentId;
    private int bookNo;
    private String bookName;
    private String date;

    public Book(int studentId, int bookNo, String bookName, String date) {
        this.studentId = studentId;
        this.bookNo = bookNo;
        this.bookName = bookName;
        this.date = date;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getBookNo() {
        return bookNo;
    }

    public void setBookNo(int bookNo) {
        this.bookNo = bookNo;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
}
