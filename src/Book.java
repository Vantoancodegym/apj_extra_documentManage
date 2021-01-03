public class Book extends Document{
    private String author;
    private int pageAmount;
    public Book(int id, String publishingName, int issueAmount, String author, int pageAmount) {
        super(id, publishingName, issueAmount);
        this.author = author;
        this.pageAmount = pageAmount;
    }

    @Override
    public String toString() {
        return "Book{" +super.toString()+
                "author='" + author + '\'' +
                ", pageAmount=" + pageAmount +
                '}';
    }
}
