package task2;

public class WikiArticle extends TitledText{
    private String link;

    public WikiArticle(String title, String text, String link) {
        super(title, text);
        this.link = link;
    }

}
