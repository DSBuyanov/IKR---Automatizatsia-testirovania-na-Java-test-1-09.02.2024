public abstract class LibraryItem {
    private String inventoryNumber;
    private String author;

    public LibraryItem(String inventoryNumber, String author) {
        this.inventoryNumber = inventoryNumber;
        this.author = author;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public String getAuthor() {
        return author;
    }

    // Абстрактный метод для отображения деталей
    public abstract void display();
}
