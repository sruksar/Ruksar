package org.example;
import java.util.Scanner;
public class IfElse {
    Scanner sc = new Scanner(System.in);
    public void Number()
    {
        int a;

        System.out.println("Enter the number ");
        a = sc.nextInt();
if (a > 0 )

{
    System.out.println("Number is possitive");

}
else if (a<0)
{
    System.out.println("Number is negative ");

}

        else

        {
            System.out.println("Number is zero");

        }
    }

    public static void main(String [] args)
    {
        IfElse obj = new IfElse();
   obj.Number();
    }
}
