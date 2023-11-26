package org.example;

public class DataTypes {

    int a;
    float f;
    String s;

    double d;
 boolean b;
 char c;
    void defaultvalues()
    {
        System.out.println(a);
        System.out.println(f);
        System.out.println(s);
        System.out.println(d);
        System.out.println(b);
        System.out.println(c);
    }
    void data1()
    {
        a=10;
        f= 3.14f;
        s= "Ruksar";
        d= 34234234;
 c= 'v';


        System.out.println(a);
        System.out.println(f);
        System.out.println(s);
        System.out.println(d);
        System.out.println(c);
        System.out.println(true);
      //  System.out.println(b);
    }
    void data2()
    {
        a=10;
        f= 50.6f;
        s= "Shaikh";
        d= 3474535;


        System.out.println(a);
        System.out.println(f);
        System.out.println(s);
        System.out.println(d);
    }

    public static void main(String[] args) {

        DataTypes d = new DataTypes();
        System.out.println("Running default values method");

        d.defaultvalues();
        System.out.println("Running datatype after intialization");
        d.data1();
        System.out.println("Running datatype after intialization");
        d.data2();

    }


}
