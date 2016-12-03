package Lesson2;

import java.util.Scanner;

public class ex1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int first = in.nextInt();
        System.out.print("Введите второе число: ");
        int second = in.nextInt();
        System.out.print("Введите второе число: ");
        int third = in.nextInt();

        if (first < second && first < third) {
            System.out.println(second * second + third * third);
            // m = first;
        } else if (second < first && second < third) {
            System.out.println(first * first + third * third);
            // m = second;
        } else {
            System.out.println(first * first + second * second);
        }// m = third;
    }
}
