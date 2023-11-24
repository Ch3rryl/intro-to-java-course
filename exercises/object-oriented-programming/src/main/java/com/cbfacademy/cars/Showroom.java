package com.cbfacademy.cars;

import java.util.ArrayList;
import java.util.List;

public class Showroom {

    public List<Car> getCars() {
        List<Car> myShowroom = new ArrayList<>(); 

        Car carVolvo = new Car("Volvo", "V40", "Blue", 2012); 
        Car carPorsche = new Car("Porsche", "Panamera", "Red", 2009); 
        Car carAudi = new Car("Audi", "A3", "Grey", 2018); 
    

        myShowroom.add(carVolvo); 
        myShowroom.add(carPorsche); 
        myShowroom.add(carAudi); 

    return myShowroom; 
    
    
    }
}


// ### Part 2

// Create a class called `Showroom` with the following members:
// - `public List<Car> getCars()` - returns a list containing the following three `Car` objects:
//   - a blue Volvo V40 from 2012
//   - a red Porsche Panamera from 2009
//   - a grey Audi A3 from 2018

// In the `main` method of the `App` class, instantiate a `Showroom` object, call `getCars()` and print the details for each `Car` instance in the list.