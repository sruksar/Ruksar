package org.example;

public class StringTest {

    String name = "Ruksar";
   String str1 = new String("Ruksar");
   public void StringFunction()
        {
            String text = "Anam Hashmi";
            System.out.println("Lenght of String" +text.length());
            System.out.println("Is Empty " +text.isEmpty());
            System.out.println("Trim " +text.trim());
          // System.out.println("Lenght of String" +text.startsWith(a));
                   }
    public  static void main(String args[])

    {
        StringTest st=new StringTest();
st.StringFunction();


       System.out.println(st.name);
        System.out.println(st.str1);
       // System.out.println(st.name == st.str1);

        System.out.println("Substring " +st.name.substring(1,4));
String fullname ="Ruksar Hashmi";
System.out.println("Split" + fullname.split(""));

}}