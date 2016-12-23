package L8;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/**
 * Created by P-C on 23.12.2016.
 */
public class L8HomeWork2 {
    public static void main(String[] args) {
        ArrayList<Article> articles1 = new ArrayList();
        articles1.add(new Article("t2", new Date(2016, 12, 24), "test"));
        articles1.add(new Article("t3", new Date(2015, 12, 24), "type"));
        articles1.add(new Article("t1", new Date(2016, 12, 24), "type"));
        articles1.add(new Article("t1", new Date(2014, 12, 24), "type"));
        articles1.add(new Article("t4", new Date(2013, 12, 24), "type"));
        ArrayList<Article> articles2 = new ArrayList();
        articles2.add(new Article("t5", new Date(2016, 12, 24), "test"));
        articles2.add(new Article("t1", new Date(2016, 12, 24), "type"));
        articles2.add(new Article("t2", new Date(2016, 12, 24), "type"));


        int t = 0;
        Iterator<Article> itr1 = articles1.iterator();
        while (itr1.hasNext()) {
            Article element1 = itr1.next();
            Iterator<Article> itr2 = articles2.iterator();
            while (itr2.hasNext()) {
                Article element2 = itr2.next();
                if (element1.title.equals(element2.title) && element1.date.equals(element2.date)) {
                    System.out.println(element1.title + " " + element1.date);
                }
            }
        }
    }
}
