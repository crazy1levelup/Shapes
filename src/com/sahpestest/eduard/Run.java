package com.sahpestest.eduard;

public class Run {

    public static void main(String [] args){

        Shape s1 = new Circle("Blue", 3.1);
        Shape s2 = new Rectangle("Teal", 3.2, 1.7);
        Shape s3 = new Square("Green", 40);

        System.out.println(s1.toString());
        System.out.println(s2.toString());
        System.out.println(s3.toString());
    }
}
