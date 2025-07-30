package LibrarySystem;

public class Library {
    private  String itemId;
    private  String title;
    private  String author;


    public Library(){

    }
    public Library(String author, String itemId, String title) {
        this.author = author;
        this.itemId = itemId;
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void checkOut(){
        System.out.println("Checkout");
    }

    public void returnItem(){
        System.out.println("returning the Item");
    }

    @Override
    public String toString() {
        return "Library{" +
                "author='" + author + '\'' +
                ", itemId='" + itemId + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
