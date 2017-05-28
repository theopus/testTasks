package task2;


public class BookDescription extends TitledText{

    private String author;
    private String publisher;
    private String annotation;

    public BookDescription(String title, String text, String author, String annotation, String publisher) {
        super(title,text);
        this.author = author;
        this.publisher = publisher;
        this.annotation = annotation;
    }
}
