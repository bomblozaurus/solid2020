package pl.zzpj2020.solid.srp.book.solution;

public class Printer {
    public void printCurrentPage(Book book) {
        String currentPage = book.getCurrentPage();
        System.out.println(currentPage);
    }

    public void printAllPages(Book book) {
        book.getPages()
                .forEach((pageNo, content) -> {
                    System.out.println(pageNo + " " + content);
                });
    }
}
