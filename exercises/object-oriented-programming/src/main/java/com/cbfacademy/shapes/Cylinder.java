package com.cbfacademy.shapes;

class Cylinder extends Shape {
    public String name() {
        return "Cylinder"; 
    }

    private double height;
    private double radius; 

    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height; 
    }
    
    @Override
    double getArea() {
        return this.height * (Math.PI * radius * radius); 
    }
}



// In the same package, create a concrete class `Cylinder` that extends `Shape`:
// - `Cylinder(double radius, double height)` - constructor
// - `double getArea()` - overrides the base method. The value is given by the formula (`height` * `𝛑` * (`radius`<sup>2</sup>)).

// #### Notes
// Consider the appropriate visibility of all constructors, methods and instance variables
