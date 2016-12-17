package Lesson6HomeworkCats;

import java.util.Random;

/**
 * Created by P-C on 16.12.2016.
 */
public class Solution {
    public static void main(String[] args) {

        //create cats
        Cat chiropractor = new Cat("Chip", 7, 50);
        Cat godzilla = new Cat("Godzilla", 9.8, 60);
        Lion lionName = new Lion("LionName", 10, 60);
        ///CatLucky c1 = new CatLucky("we", 3,3,);


        //start fighting
        System.out.printf("%s vs %s", chiropractor.name, godzilla.name).println();

        //get winner
        String winnerName = getWinner(chiropractor, godzilla);
        String winnerName2 = getWinner(lionName, godzilla);
        //print winner name
        System.out.printf("%s wins %n", winnerName);
        System.out.printf("%s vs %s", lionName.name, godzilla.name).println();
        System.out.printf("%s wins %n", winnerName2);
    }

    /**
     * This method compare to cats and return winner
     *
     * @param catInRedCorner   - first cat
     * @param catInBlackCorner - second cat
     * @return winner
     */
    static String getWinner(Cat catInRedCorner, Cat catInBlackCorner) {
        if (catInBlackCorner.getPowerFactor() > catInRedCorner.getPowerFactor()) {
            return catInBlackCorner.name;
        } else {
            return catInRedCorner.name;
        }
    }

    public static class Cat {
        String name;
        double weight;
        int height;
        double rand = Math.random();

        public Cat(String name, double weight, int height) {
            this.name = name;
            this.weight = weight;
            this.height = height;
            //this.rand = rand;

        }

        /**
         * Method calculate cats power factor
         *
         * @return power factor
         */
        public double getPowerFactor() {

            return weight * height * rand;
        }
    }

    static class Lion extends Cat {
        double ric = 0.05;

        public Lion(String name, double weight, int height) {
            super(name, weight, height);
            this.rand= rand + ric;
        }
    }
}
