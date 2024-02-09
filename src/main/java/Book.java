public class Book extends LibraryItem {
    private String title;

    public Book(String inventoryNumber, String author, String title) {
        super(inventoryNumber, author);
        this.title = title;
    }

    @Override
    public void display() {
        System.out.println("Book Title: " + title + ", Author: " + getAuthor() + ", Inventory Number: " + getInventoryNumber());
    }
}

