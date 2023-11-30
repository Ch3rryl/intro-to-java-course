package com.cbfacademy.shapes;

class Rectangle extends Shape {
    private double length;
    private double width;

    @Override
    public String name() {
       return "Rectangle"; 
    }
         
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width; 
    }

@Override
double getArea() {
    return length * width; 
}

    
}



// In the same package, create a concrete class `Rectangle` that extends `Shape`:
// - `Rectangle(double length, double width)` - constructor
// - `double getArea()` - overrides the base method. The value is given by the formula (`length` * `width`)


