package LibrarySystem;

public class Magzine extends  Library{

    private String issueNumber;

    public  Magzine(){}
    public Magzine(String  issueNumber) {
        this.issueNumber = issueNumber;
    }

    public String getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(String issueNumber) {
        this.issueNumber = issueNumber;
    }

    @Override
    public String toString() {
        return "Magzine{" +
                "Issue Number =" + issueNumber +
                '}';
    }
}
