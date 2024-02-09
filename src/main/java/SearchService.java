import java.util.ArrayList;
import java.util.List;

public class SearchService {
    private List<LibraryItem> items;

    public SearchService() {
        items = new ArrayList<>();
    }

    public void addItem(LibraryItem item) {
        items.add(item);
    }

    public void findByAuthor(String author) {
        items.stream()
                .filter(item -> item.getAuthor().equalsIgnoreCase(author))
                .forEach(LibraryItem::display);
    }


}
