package com.cbfacademy;

import java.util.List;

import com.cbfacademy.cars.Car;
import com.cbfacademy.cars.Showroom;

public class App {
    public static void main(String[] args) {

        Showroom myShowroom = new Showroom();
        
        List<Car> carsInShow = myShowroom.getCars();

      

        for(Car car: carsInShow) {
            car.getDetails();
            System.out.println();
        }

  


    }
}

// In the `main` method of the `App` class, instantiate a `Showroom` object, call `getCars()` and print the details for each `Car` instance in the list.
