package task2;


public class Article extends TitledText{
    private String author;
    private String journalName;
    private int year;
    private int number;

    public Article(String title, String text, String author, String journalName, int year, int number) {
        super(title,text);
        this.author = author;
        this.journalName = journalName;
        this.year = year;
        this.number = number;
    }
}
