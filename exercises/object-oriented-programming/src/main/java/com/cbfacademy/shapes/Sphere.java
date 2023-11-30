package com.cbfacademy.shapes;

class Sphere extends Shape {
    private double radius; 

    @Override
    public String name() {
        return "Sphere";
    }

    public Sphere (double radius) {
        this.radius = radius; 
    }

@Override
double getArea() {
    return 4 * Math.PI * radius * radius; 
   

}

}



// In the same package, create a concrete class `Sphere` that extends `Shape`:
// - `Sphere(double radius)` - constructor
// - `double getArea()` - overrides the base method. The value is given by the formula (`4` * `𝛑` * (`radius`<sup>2</sup>))

