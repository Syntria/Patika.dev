public class Book implements Comparable{
    private String bookName;
    private String writerName;
    private String publishDate;
    private int pageNumber;

    public Book(String bookName, String writerName, String publishDate, int pageNumber) {
        this.bookName = bookName;
        this.writerName = writerName;
        this.publishDate = publishDate;
        this.pageNumber = pageNumber;
    }

    @Override
    public int compareTo(Object book) {
        return this.bookName.compareTo(((Book) book).getBookName());
    }


    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getWriterName() {
        return writerName;
    }

    public void setWriterName(String writerName) {
        this.writerName = writerName;
    }

    public String getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(String publishDate) {
        this.publishDate = publishDate;
    }

    public int getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(int pageNumber) {
        this.pageNumber = pageNumber;
    }

}
