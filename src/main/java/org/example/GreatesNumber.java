package org.example;

import java.util.Scanner;

public class GreatesNumber {
    Scanner sc = new Scanner(System.in);

    public void GreatesNumber() {
        int a;
        int b;
        System.out.println("Enter the number ");
        a= sc.nextInt();
        System.out.println("Enter the number ");

        b= sc.nextInt();

        if( a > b )
        {
            System.out.println("Greast number is \n" +a);
        }
        else if (a<b )
        {
            System.out.println("Greast number is \n" +b);
        }
        else
        {
            System.out.println("Number is equal ");
        }
    }
    public static void main(String [] args)
    {
        GreatesNumber gn = new GreatesNumber();
        gn.GreatesNumber();

    }
}
