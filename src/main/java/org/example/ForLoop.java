package org.example;

public class ForLoop {

    public void Print10Number()
    {
        //int a;
        for (int i=0 ; i< 10 ; i++)
        System.out.println(i);
    }
    public static void main(String [] args)
    {
        ForLoop fp = new ForLoop();
       // fp.Print10Number();
        fp.Printlast10Numbers();

    }
    public void Printlast10Numbers()
    {
        //int a;
        for (int i=10 ; i> 0 ; i--)
            System.out.println(i);
    }

}
