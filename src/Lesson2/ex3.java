package Lesson2;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {

        //init scanner
        Scanner scan = new Scanner(System.in);

        //enter number of rows
        System.out.println("Enter the number of rows: ");
        int numRows = scan.nextInt();

        //init arrays for saving rows and they length
        String[] arrayOfRows = new String[numRows];
        int[] arrayOfRowsLength = new int[numRows];

        //enter and save rows
        for (int i = 0; i < numRows; i++) {
            System.out.println(String.format("Enter the row number %d: ", i + 1));
            String row = scan.next();
            arrayOfRows[i] = row;
            arrayOfRowsLength[i] = row.length();
        }

        //init variables for saving row with min length
        int minLength = 0;
        String minLengthRow = arrayOfRows[0];

        //cycle for finding row with min length
        for (int i = 0; i < numRows; i++) {
            if (minLength > arrayOfRowsLength[i]) {
                minLength = arrayOfRowsLength[i];
                minLengthRow = arrayOfRows[i];
            }
        }

        //print row with min length
        System.out.println("The shortest row is: " + minLengthRow);
        System.out.println("Line length is " + minLengthRow.length());
    }
}
