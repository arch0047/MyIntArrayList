package com.company;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        System.out.println();
        System.out.println(" OnlyIntArray Exercise! ");
        System.out.println("******************************************");
        MyIntOnlyArrayList MyIntArray = new MyIntOnlyArrayList();

        MyIntArray.printArray();
        System.out.println("******************************************");

        System.out.println("Size of original array is: " + MyIntArray.getSize());
        System.out.println("******************************************");
        System.out.println("The value of index 3 is : " + MyIntArray.getIndex(3));
        System.out.println("******************************************");

        int[] finalArray = MyIntArray.add();
        // print the updated array
        System.out.println("index " + 5
                + " in new array is added , now the size of the array is 6. \n"
                + Arrays.toString(finalArray));
        System.out.println("******************************************");

        int newIntArray =MyIntArray.deleteElement(2);

        System.out.println("New Array's size is :"  + MyIntArray.logicalsize +"  value 30 is removed .");

        System.out.println("******************************************");

        MyIntArray.printArrayNew();
    }
}

