public class Book {
    static int totalNoBooks;
    String author;
    String title;
    long isbn;

    static {
        totalNoBooks=100;
    }
    Book(){
        this.author="Bhartesh Girmal";
        this.title="Programming in Java";
        this.isbn= 123524;
    }
    public  void borrowBook(){
        System.out.println("New Book is Borrowed");
        totalNoBooks--;
    }

    public  void retrunBook(){
        System.out.println("New Book is returned");
        totalNoBooks++;
    }

    public static int getTotalNoBooks(){
        return totalNoBooks;
    }
}
