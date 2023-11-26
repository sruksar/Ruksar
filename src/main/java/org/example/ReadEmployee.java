package org.example;

public class ReadEmployee {

    public Employee readata()
    {
        Employee em =new Employee();
        return em;

    }
    public static void main(String [] args)
    {
        ReadEmployee re = new ReadEmployee();
        Employee emp =  re.readata();
                emp.getdata();

    }
}
