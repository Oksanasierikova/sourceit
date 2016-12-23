package L8;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * Created by P-C on 23.12.2016.
 */
public class L8HomeWork1 {

    public static void main(String[] args) {
        ArrayList<Integer> a1 = new ArrayList<>();
        a1.add(2);
        a1.add(1);
        a1.add(4);
        a1.add(5);
        a1.add(3);
        a1.add(7);
        ArrayList<Integer> a2 = new ArrayList<>();
        a2.add(1);
        a2.add(2);
        a2.add(3);
        a2.add(4);
        a2.add(7);
        int result = 0;
        int t = 0;
        Iterator<Integer> itr1 = a1.iterator();
        while (itr1.hasNext()) {
            Integer element1 = itr1.next();
            Iterator<Integer> itr2 = a2.iterator();
            while (itr2.hasNext()) {
                Integer element2 = itr2.next();
                if (element1 == element2) {
                    t = 0;
                    break;
                } else {
                    result = element1;
                    t = 1;
                }
            }
            if (t == 1) {
                break;
            }
        }
        System.out.println(result);


    }
}
