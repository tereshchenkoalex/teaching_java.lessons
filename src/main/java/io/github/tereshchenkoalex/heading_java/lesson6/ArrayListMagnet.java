package io.github.tereshchenkoalex.heading_java.lesson6;

import java.util.*;

public class ArrayListMagnet {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<String>(); //object a (as ArrayList is created)
        a.add(0, "zero");
        a.add(1, "one");
        a.add(2, "two");
        a.add(3, "three"); // it has been given three elements
        printAL(a); //calling function printAL() to print ArrayList a

        a.remove(2);
        if (a.contains("three")) {
            a.add("four");
        }
        printAL(a);

        if (a.indexOf("four") != 4) {
            a.add(4, "4.2");
        }
        printAL(a);
        printAL(a);

    }

    public static void printAL(ArrayList<String> a) {
        for (String element : a) {
            System.out.print(element + " ");
            }
            System.out.println(" ");
        }
}

