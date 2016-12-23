package L8;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by P-C on 23.12.2016.
 */
public class Article {
    String title;
    Date date;
    String key;

    public Article(String title, Date date, String key) {
        this.title = title;
        this.date = date;
        this.key = key;
    }
}
