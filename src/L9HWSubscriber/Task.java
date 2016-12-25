package L9HWSubscriber;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/**
 * Created by P-C on 25.12.2016.
 */
public class Task {
    public static void main(String[] args) {
        ArrayList<Subscriber> subscribers = new ArrayList<Subscriber>();
        subscribers.add(new Subscriber("12345", "Surname1", "Name4", "Patronymic1", "Address3"));
        subscribers.add(new Subscriber("12346", "Surname2", "Name2", "Patronymic4", "Address2"));
        subscribers.add(new Subscriber("12348", "Surname1", "Name3", "Patronymic2", "Address1"));
        subscribers.add(new Subscriber("12347", "Surname3", "Name1", "Patronymic3", "Address4"));

        System.out.println("Print elements by address");
        Collections.sort(subscribers, new Comparator<Subscriber>() {
            @Override
            public int compare(Subscriber o1, Subscriber o2) {
                return o1.address.compareTo(o2.address);
            }
        });

        Iterator<Subscriber> itr1 = subscribers.iterator();
        while (itr1.hasNext()){
            Subscriber element1 = itr1.next();
            System.out.println(element1);
        }

        System.out.println("Print elements by fullname");

        Collections.sort(subscribers, new Comparator<Subscriber>() {
            @Override
            public int compare(Subscriber o1, Subscriber o2) {
                int result;
                result = o1.surname.compareTo(o2.surname);
                if (result==0){
                    result=o1.name.compareTo(o2.name);
                    if (result==0){
                        result=o1.patronymic.compareTo(o2.patronymic);
                    }
                }
                return result;
            }
        });

        Iterator<Subscriber> itr2 = subscribers.iterator();
        while (itr2.hasNext()){
            Subscriber element2 = itr2.next();
            System.out.println(element2);
        }


        System.out.println("Print elements by name, patronymic, surname");

        Collections.sort(subscribers, new Comparator<Subscriber>() {
            @Override
            public int compare(Subscriber o1, Subscriber o2) {
                int result;
                result = o1.name.compareTo(o2.name);
                if (result==0){
                    result=o1.surname.compareTo(o2.surname);
                    if (result==0){
                        result=o1.patronymic.compareTo(o2.patronymic);
                    }
                }
                return result;
            }
        });

        Iterator<Subscriber> itr3 = subscribers.iterator();
        while (itr3.hasNext()){
            Subscriber element3 = itr3.next();
            System.out.println(element3);
        }
    }
}
