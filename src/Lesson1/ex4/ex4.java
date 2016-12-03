package Lesson1.ex4;

public class ex4 {

    public static void main(String[] args) {
        int age = 2016;
        //int[][] anArray = new int [2][3];

        String[][] name  = {
                {"Oksana ", "Eugen ", "Artem "},
                {"1987", "1986", "2011"}
        };
        int ageOksana = age - Integer.valueOf(name[1][0]);
        int ageEugen = age - Integer.valueOf(name[1][1]);
        int ageArtem = age - Integer.valueOf(name[1][2]);

        System.out.println(name[0][0] + ageOksana );
        System.out.println(name[0][1] + ageEugen );
        System.out.println(name[0][2] + ageArtem );

    }


}
