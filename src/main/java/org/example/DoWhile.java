package org.example;

public class DoWhile {

    public void DoWhileTest()
    {
        int i=10;
        do
        {
         //   int j=85;
          //  System.out.println(j);
            System.out.println(i);
            i--;

        }
        while (i >8);

    }


    public static void main(String [] args) {

        DoWhile obj = new DoWhile();
        obj.DoWhileTest();

    }    }