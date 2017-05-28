package task2;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class TitledText {
    protected String title;
    protected String text;

    protected TitledText(String title, String text){
        if (title == null || text == null)
            throw new NullPointerException();
        this.title = title;
        this.text = text;
    }

    /**
    @return true if it contains at least one keyword.
     */
    public boolean isTitleContains(String... keywords){
        Pattern p;
        Matcher m;
        String tmp = title.toLowerCase();
        for (String keyword : keywords) {
            p = Pattern.compile("\\b" + keyword.toLowerCase() + "\\b");
            m = p.matcher(tmp);
            if(m.find()) return true;
        }
        return false;
    }

    /**
     @return true if it contains least one keyword.
     */
    public boolean isTextContains(String... keywords){
        Pattern p;
        Matcher m;
        String tmp = text.toLowerCase();
        for (String keyword : keywords) {
            p = Pattern.compile("\\b" + keyword.toLowerCase() + "\\b");
            m = p.matcher(tmp);
            if(m.find()) return true;
        }
        return false;
    }
    /**
     @return true if one of its contains least one keyword.
     */
    public boolean isContains(String... keywords) {
        return isTitleContains(keywords) || isTextContains(keywords);
    }

    /**
     @return true if both of its contains least one keyword.
     */
    public boolean isBothContains(String... keywords){
        return isTextContains(keywords) && isTitleContains(keywords);
    }

    public static Map<String, Integer> countMatches(List<TitledText> texts, String... keywords){
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("In Titles", 0);
        map.put("In Texts", 0);
        map.put("In Text and Title", 0);
        map.put("In Text and/or Title", 0);

        TitledText text;
        for (int i = 0; i < texts.size(); i++) {
            text = texts.get(i);

            if (text.isTitleContains(keywords))
                map.put("In Titles", map.get("In Titles") + 1);

            if (text.isTextContains(keywords))
                map.put("In Texts", map.get("In Texts") + 1);

            if (text.isBothContains(keywords))
                map.put("In Text and Title", map.get("In Text and Title") + 1);

            if (text.isContains(keywords))
                map.put("In Text and/or Title", map.get("In Text and/or Title") + 1);
        }
        return map;
    }

}
