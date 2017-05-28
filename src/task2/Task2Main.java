package task2;

import java.util.ArrayList;
import java.util.List;

public class Task2Main {
    public static void main(String[] args) {
        String[] keywords = { "HI", "in", "abcd" };

        List<TitledText> titledTexts = new ArrayList<>();

        WikiArticle hiArticle = new WikiArticle(
                "hi - definition of hi in English | Oxford Dictionaries",
                "hi, used as a friendly greeting or to attract attention Meaning, pronunciation, example sentences, and more from Oxford Dictionaries.",
                "https://en.wiktionary.org/wiki/hi");


        titledTexts.add(hiArticle);
        BookDescription highDrive = new BookDescription(
                "High Dive: A Novel",
                "In September 1984, a bomb was planted at the Grand Hotel in the seaside town of Brighton, England, set to explode in twenty-four days when the British prime minister and her entire cabinet would be staying there. High Dive not only takes us inside this audacious assassination attempt—a decisive act of violence on the world stage—but also imagines its way into a group of unforgettable characters. Nimbly weaving together fact and fiction, comedy and tragedy, the story switches among the perspectives of Dan, a young IRA explosives expert; Moose, a former star athlete gone to seed, who is now the deputy hotel manager; and Freya, his teenage daughter, trying to decide what comes after high school. Over the course of a mere four weeks, as the prime minister’s arrival draws closer, each of their lives will be transformed forever. A bold, astonishingly intimate novel of laughter and heartbreak, High Dive is a moving portrait of clashing loyalties, guilt and regret, and how individuals become the grist of history",
                "",
                "",
                "");
        titledTexts.add(highDrive);

        Article article = new Article(
                "How to hide this?",
                "Hi, can you imagine this, even for a moment",
                "Joghn",
                "",
                1998,
                3);
        titledTexts.add(article);

        System.out.println(TitledText.countMatches(titledTexts,keywords));
    }



}
