package L9HWCafee;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.*;

/**
 * Created by P-C on 26.12.2016.
 */
public class Cafee {
    public static void main(String[] args) throws IOException {
        HashMap<String, Double> hm = new HashMap<String, Double>();
        hm.put("Dish1", 1000.9);
        hm.put("Dish2", 2000.9);
        hm.put("Dish3", 3000.9);
        hm.put("Dish4", 4000.9);
        hm.put("Dish5", 5000.9);


        for (Map.Entry<String, Double> me : hm.entrySet()) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();

        HashMap<String, Integer> hmOrders = new HashMap<String, Integer>();

        String dish = "";
        Integer quantity=0;
        Double sum=0.0;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        while (true) {
            System.out.println("enter name of dish");
            dish = bufferedReader.readLine();
            if (dish.equals("finish")) {
                break;
            }
            System.out.println("enter quantity");
            quantity = Integer.valueOf(bufferedReader.readLine());
            if (quantity.equals("finish")) {
                break;
            }
        hmOrders.put(dish, quantity);
            sum = sum + quantity*hm.get(dish);
        }
        System.out.println("Your order: ");
        for (Map.Entry<String, Integer> me : hmOrders.entrySet()) {
            System.out.println(me.getKey() + ", quantity " + (me.getValue()) + ", price "  + hm.get(me.getKey()));
        }
        System.out.println("Total price: " + sum);





    }
}
