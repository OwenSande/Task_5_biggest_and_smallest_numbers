package com.company;
import java.util.Random;
public class Main {

    public static void main(String[] args) {
        int collectionSize = 10, i = 1;
        int number, min = 101, max = 0;

        System.out.println("This program draws "+ collectionSize + "integer numbers from 1 to 100");
        System.out.println("and finds the smallest and greatest of them");

        Random r = new Random();
        System.out.println("Drawn: ");

        while(i <= collectionSize){
            number = Math.round((r.nextInt(100)+1));
            System.out.print(number + ", ");

            if (number < min) min = number;
            if (number > max) max = number;
            i++;
        }
        System.out.println("");
        System.out.println("The larges number in the collection is: " + max);
        System.out.println("The smallest in the set is: "+ min);
    }
}
