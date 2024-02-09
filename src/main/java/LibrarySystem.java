public class LibrarySystem {
    public static void main(String[] args) {
        SearchService searchService = new SearchService();

        searchService.addItem(new Book("INV123", "Author1", "Title1"));


        searchService.findByAuthor("Author1");

    }
}
