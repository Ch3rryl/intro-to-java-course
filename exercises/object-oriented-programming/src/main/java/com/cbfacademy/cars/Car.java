package com.cbfacademy.cars;

public class Car {
    private String make;
    private String model;
    private String colour;
    private int year; 

    public Car (String make, String model, String colour, int year) {
        this.make = make;
        this.model = model;
        this.colour = colour;
        this.year = year;
    }

public String getMake() {
    return this.make;
}

public String getModel() {
    return this.model;
}

public int getYear() {
    return this.year;
}

public String getColour() {
    return this.colour;
}

public void setColour(String newColour) {
    this.colour = newColour; 
    // return newColour; 
}

public String getDetails() {
    // String detailsAll = String.format("The car make is: %s . The car model is: %s .  The car colour is: %s . The car year is: %d", this.make, this.model, this.colour, this.year); 
    String detailsAll = this.make + " " + this.model + " " + this.colour + " " + this.year;
    return detailsAll;
}


}



// ### Part 1

// Inside the `cars` package, create a class called `Car` with the following members:
// - `private String make`
// - `private String model`
// - `private int year`
// - `public Car(String make, String model, String colour, int year)` - constructor that accepts parameters representing the make, model, colour and year of the carz
// - `public String getMake()` - returns the car make
// - `public String getModel()` - returns the car model
// - `public int getYear()` - returns the year the car was made
// - `public String getColour()` - returns the colour of the car
// - `public String setColour()` - sets the colour of the car
// - `public String getDetails()` - returns the car details, including the make, model, colour and year