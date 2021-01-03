public class Journal extends Document{
    private int issueNumber;
    private int issueMonth;

    public Journal(int id, String publishingName, int issueAmount, int issueNumber, int issueMonth) {
        super(id, publishingName, issueAmount);
        this.issueNumber = issueNumber;
        this.issueMonth = issueMonth;
    }

    @Override
    public String toString() {
        return "Journal{" +super.toString()+
                "issueNumber=" + issueNumber +
                ", issueMonth=" + issueMonth +
                '}';
    }
}
