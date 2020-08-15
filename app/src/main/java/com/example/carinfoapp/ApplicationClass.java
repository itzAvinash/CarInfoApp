package com.example.carinfoapp;

import android.app.Application;

import java.util.ArrayList;

public class ApplicationClass extends Application {

    public static ArrayList<Car> cars;

    @Override
    public void onCreate() {
        super.onCreate();

        cars = new ArrayList<Car>();
        cars.add(new Car("Volkswagen","Polo","Avinash","9742894351" ));
        cars.add(new Car("Mercedes","E200","Avinash","9742894351" ));
        cars.add(new Car("Volkswagen","Kombi","Avinash","9742894351" ));
        cars.add(new Car("Nissan","Almera","Avinash","9742894351" ));
        cars.add(new Car("Mercedes","E180","Avinash","9742894351" ));
        cars.add(new Car("Nissan","Micra","Avinash","9742894351" ));


    }
}
