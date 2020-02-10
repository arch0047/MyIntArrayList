package com.company;
import com.sun.deploy.net.MessageHeader;

import java.util.Arrays;

public class MyIntOnlyArrayList {


    public int logicalsize = 5;
    int[] OnlyIntArray = {10, 20, 30, 40, 50};

    public MyIntOnlyArrayList() {

        System.out.println(" Showing array with index and values: ");
        System.out.println("******************************************");
        System.out.printf("%-10s", "Index");
        System.out.printf("%-20s", " Value");
        System.out.println();

    }

        public void printArray()
        {

        for (int i = 0; i < OnlyIntArray.length; i++)
        {
            System.out.println(i + "            " + OnlyIntArray[i]);
        }
        }

         public int getIndex(int index)
        {
            return OnlyIntArray[index];
            

        public int[] add()
         {
             int[] newArray = new int[5 + 1];

             for (int i = 0; i < 5; i++)
                 newArray[i] = OnlyIntArray[i];
                 newArray[5] = 60;
                 return newArray;
         }

     public int getSize()
     {
        return OnlyIntArray.length;
    }

    public int deleteElement(int index) {
        System.out.print("Original array was: " + Arrays.toString(OnlyIntArray));
        System.out.println("");

        int target = 2;

        for (int i = target; i < OnlyIntArray.length - 1; i++) {
            OnlyIntArray[i] = OnlyIntArray[i + 1];

        }
        OnlyIntArray[OnlyIntArray.length - 1] = 0;
        return logicalsize--;
    }
        public void printArrayNew()
        {
            System.out.printf("%-10s", "Index");
            System.out.printf("%-20s", " Value");
            System.out.println();
            for (int i = 0; i < OnlyIntArray.length; i++)
            {
                System.out.println(i + "            " + OnlyIntArray[i]);
            }
        }

        //int[] newIntArray= new int [OnlyIntArray.length-1];

       // for (int i = 0; i < OnlyIntArray.length; i++) {
         //   newIntArray[i]= OnlyIntArray[i];
      //  }
        //  return newIntArray;




}
