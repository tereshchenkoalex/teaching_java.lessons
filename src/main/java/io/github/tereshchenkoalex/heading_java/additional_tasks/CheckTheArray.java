package io.github.tereshchenkoalex.heading_java.additional_tasks;

import java.util.*;

public class CheckTheArray {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the size of Array: ");
        int ArraySize = sc.nextInt();

        int sumOfNums = 0;
        int ArrayToCheck[];
        ArrayToCheck = new int[ArraySize];

        for (int NumOfElement = 0; NumOfElement < ArraySize; NumOfElement++){
            int El = NumOfElement + 1;
            System.out.println("Please enter the " + El + " element of array");
            ArrayToCheck[NumOfElement] = sc.nextInt();
            sumOfNums = sumOfNums + ArrayToCheck[NumOfElement];
        }

        float average = (float) sumOfNums / ArraySize;
        System.out.println("Average number is: " + average);
    }
}
