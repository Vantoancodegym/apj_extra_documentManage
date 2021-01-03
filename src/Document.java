public class Document {
    private int id;
    private String publishingName;
    private int issueAmount;
    public Document(){};

    public Document(int id, String publishingName, int issueAmount) {
        this.id = id;
        this.publishingName = publishingName;
        this.issueAmount = issueAmount;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", publishingName='" + publishingName + '\'' +
                ", reissueAmount=" + issueAmount +
                '}';
    }
}
