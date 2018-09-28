package com.sahpestest.eduard;

class Square extends Shape {

    double length;

    public Square(String color, double length){
        super(color);
        System.out.println("Calling square constructor");
        this.length = length;
    }
    @Override
    double area() {
        return length * length;
    }
    @Override
    public String toString() {
        return "The color of the shape is " + color + " and the area is " + area();
    }
}
