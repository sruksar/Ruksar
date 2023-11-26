package org.example;

public class ConcatString
{
 public static void Withoutconcatmethod()
 {

    String a ="Leaning ";
            String b = "Java";
String c=  a + b ;

    System.out.println(c);  // 1st way
     System.out.println(a+ "" +b);  //2nd way
 }

    public static void Withconcatmethod() {

        String d = "Leaning ";
        String e = "Java";
     String f = d.concat(e);
        System.out.println(f);
    }


    public static void main(String [] args)
    {
   //     Withoutconcatmethod();
        Withconcatmethod();

    }}
