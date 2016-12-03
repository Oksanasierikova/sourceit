package Lesson1.ex3;

public class ex3 {
    public static void main(String[] args) {
// declares an array of integers
        double[] anArray;
        // allocates memory for 2 integers
        anArray = new double[3];
        anArray[0] = 27.13;
        anArray[1] = 29.04;
        anArray[2] = 0.4227;
        System.out.println("UAH Exchange Rates to USD: " + 5000 / anArray[0]);
        System.out.println("UAH Exchange Rates to EUR: " + 5000 / anArray[1]);
        System.out.println("UAH Exchange Rates to RUB: " + 5000 / anArray[2]);

    }
}
