package LibrarySystem;

public class Book extends Library{

    private String isbnNumber;

    public Book(){

    }
    public Book(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    public String getIsbnNumber() {
        return isbnNumber;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }

    @Override
    public String toString() {
        return "Book{" +
                "isbnNumber='" + isbnNumber + '\'' +
                '}';
    }
}
