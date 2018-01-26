package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // write your code here

        boolean whileCondition = true;
        int count = 0;

        while (whileCondition) {
            System.out.println("Our while condition is true. Add one to our count");
            count = count + 1;
            if (count == 3) {
                System.out.println("our count is at 3");
                whileCondition = false;

            }
        }

        boolean doWhileCondition = false;
        count = 0;

        do {
            System.out.println("iuhfa");
            count = count + 1;
            if (count == 3) {
                System.out.println("our count is at 3");
                doWhileCondition = false;
            }
            while (doWhileCondition) ;
            //For Loops

            for (int i = 0; i <= 5; i++) {
                System.out.println(i);
            }

//            Foreach

            ArrayList<String> fruit = new ArrayList<String>();
            fruit.add("apple");
            fruit.add("Banana");
            fruit.add("Orange");
            fruit.add("Strawberry");
            fruit.add("Grape");

            for(String food : fruit){
                if (food.contains("b") || food.contains("B")){
                    System.out.println(food);
                }
            }
        }
    }
}
