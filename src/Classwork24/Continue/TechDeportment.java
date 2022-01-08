package Classwork24.Continue;

public class TechDeportment {
    private Book[] books = new Book[100];

    public Book searchByAuthor(String author){
        for (Book book : books) {
            if (book.getAuthor().equals(author)) {
                return book;
            }
        }
        return null;
    }
}
class Book{
    private String author;

    public String getAuthor(){
        return author;
    }
    private void setAuthor(String author){
        this.author = author;
    }
}
