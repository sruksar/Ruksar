package org.example;

public class ChildC extends ParentB{


    public void veg()
        {
System.out.println("Child class method : Veg");
        }
        public static void main(String[] args)
            {
                ChildC child = new ChildC();

                child.veg();
                child.nonveg();
                child.vegNonveg();


            }
}
