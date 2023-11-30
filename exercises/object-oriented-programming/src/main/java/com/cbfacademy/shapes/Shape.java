package com.cbfacademy.shapes;

abstract class Shape {
    public abstract String name(); 

    abstract double getArea();

    String getName() {
        return name();  
    } 
    
}



// ### Part 1

// Inside the `shapes` package, create an abstract class `Shape` with the following members:
// - `abstract double getArea()` - returns the area of the shape
// - `String getName()` - returns the name of the shape


