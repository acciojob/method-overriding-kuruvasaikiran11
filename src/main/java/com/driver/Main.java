package com.driver;



public class Main {
    class A{
        public String meth(){
            return "Invoking method from class A";
        }
    }
    class B extends A{

    }
    public static void main(String args[]) {
        B b = new B();
        b.meth();
    }

}