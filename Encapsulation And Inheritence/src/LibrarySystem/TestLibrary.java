package LibrarySystem;

public class TestLibrary {
    public static void main(String[] args) {
        Book book = new Book();
        book.setIsbnNumber("RICHDADPOORDAD123354");
        System.out.println(book.toString());

        Magzine magzine = new Magzine("12875345");
        magzine.setIssueNumber("9178");
        System.out.println(magzine.toString());

        DVD dvd = new DVD(180);
        System.out.println(dvd.toString());


    }
}
