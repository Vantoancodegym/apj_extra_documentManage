public class Newspaper extends Document {
    private int issueDay;

    public Newspaper(int id, String publishingName, int issueAmount, int issueDay) {
        super(id, publishingName, issueAmount);
        this.issueDay = issueDay;
    }

    @Override
    public String toString() {
        return "Newspaper{" +super.toString()+
                "issueDay='" + issueDay + '\'' +
                '}';
    }
}
