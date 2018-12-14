package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.time.Instant;

public class BubbleSort {


    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter size of your list: ");
        int listSize = myObj.nextInt();

        List<Integer> sortableList = new ArrayList<Integer>();
        for (int n = 0; n <= listSize - 1; n++) {
            System.out.println("Enter an element (or 00 to stop): ");
            int element = myObj.nextInt();
            if (element == 00) {
                break;
            }
            sortableList.add(n, element); //populating list
        }
        System.out.println("Here is your unsorted list: " + sortableList + "\n" + "Would you like to sort this using bubble sort? (Yes or No) ");
        Scanner nextOpt = new Scanner(System.in);  // Create a Scanner object
        String option = nextOpt.nextLine();
        long initiated =   Instant.now().toEpochMilli();
        if (option.equals("Yes")) {
            for(int i=0; i < listSize; i++){
                for(int n = 0; n<listSize-i; n++) {
                    int a = sortableList.get(n);
                    int next = n + 1;
                    int b = sortableList.get(next);
                    if (a > b) {
                        sortableList.set(n, b);
                        sortableList.set(next, a);
                    } else {
                        System.out.println("Pair is acceptable");
                    }
                    System.out.println(sortableList);

                }

                long completed =   Instant.now().toEpochMilli();
                long timeTaken = completed - initiated;
                System.out.println(timeTaken);


            }
        }



    }


}





