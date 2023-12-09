package org.example;

public class Child extends Parent{
    public void chiildclass()
        {
            String course = "Java";
            System.out.println(course);

        }
public void m1()
    {
        this.chiildclass();
        super.m1();
        System.out.println(super.a);
    }
    public  static void main(String args[])

    {
        Child c= new Child();
        c.m1();

     //   System.out.println(this.);
}}
