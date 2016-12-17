package Lesson6Homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by P-C on 14.12.2016.
 */
public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter quanty of points");
        String val = reader.readLine();
        int n = Integer.parseInt(val);
        int formula = 0;
for (int j = 2; j < n; j ++){
    for (int i = j; i< n; i ++ )
    {
        formula = formula + (n-i);
    }
}
        System.out.println("Quantity of triangles: " + formula);
    }
}
