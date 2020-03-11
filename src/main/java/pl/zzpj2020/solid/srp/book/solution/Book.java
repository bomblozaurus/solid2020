package pl.zzpj2020.solid.srp.book.solution;

import java.util.HashMap;
import java.util.Map;

public class Book {
    private Map<Integer, String> pages = new HashMap<>();
    private String libraryRoomName;
    private String rowLocator;
    private int currentPageNumber = 0;
    private int indexOnShelf;

    public String getCurrentPage() {
        return this.pages.getOrDefault(currentPageNumber, "");
    }

    public Map<Integer, String> getPages() {
        return this.pages;
    }
}
