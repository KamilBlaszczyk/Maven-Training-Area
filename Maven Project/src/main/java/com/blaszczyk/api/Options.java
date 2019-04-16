package com.blaszczyk.api;

import com.blaszczyk.implementation.Bicycle;
import com.blaszczyk.implementation.Car;
import com.blaszczyk.implementation.Plane;
import com.blaszczyk.implementation.Ship;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Options {

    private static Logger LOGGER = LoggerFactory.getLogger(Options.class);

    public static void returnSpeedestVehicle(Vehicle v1, Vehicle v2) {
        if(v1.getMaxSpeed()>v2.getMaxSpeed()){
            System.out.println(v1.getManufacturer()+" Is faster than: "+v2.getManufacturer());
        }else {
            System.out.println(v2.getManufacturer()+ " Is faster than: " + v1.getManufacturer());
        }
    }

    public static void run(){
        Car tesla = new Car("Tesla Inc.", 320);
        Car civic = new Car("Honda", 210);

        Ship battleship = new Ship("US Army", 77);
        Ship boat = new Ship("Hustler", 125);

        Plane airbusA380 = new Plane("AirBus", + 1020 );
        Plane concorde = new Plane("British Aircraft Inc.", + 2179 );

        Bicycle mountainBike = new Bicycle("Cross", + 60);
        Bicycle bmx = new Bicycle("bmx", + 45);

        ArrayList<Vehicle> listOfVehicles = new ArrayList<>();
        listOfVehicles.add(tesla);
        listOfVehicles.add(civic);
        listOfVehicles.add(boat);
        listOfVehicles.add(battleship);
        listOfVehicles.add(airbusA380);
        listOfVehicles.add(concorde);
        listOfVehicles.add(mountainBike);
        listOfVehicles.add(bmx);

        Vehicle fastest = Collections.max(listOfVehicles, Comparator.comparing(Vehicle::getMaxSpeed));

        System.out.println("*** List of VEHICLES ***");
        for(Vehicle x: listOfVehicles)
            System.out.println(x.getManufacturer() + " max speed: " + x.getMaxSpeed());


        boolean end = false;
        int chose = 1;
        boolean correct = false;
        BufferedReader load = new BufferedReader(new InputStreamReader(System.in));


        while(!end){

            if(chose > 6)
                end = true;

            LOGGER.info("\n \n *** Menu ***"
                    +  "\n \n Choose the option:"
                    +  "\n 1 - CAR"
                    +  "\n 2 - SHIP"
                    +  "\n 3 - PLANE"
                    +  "\n 4 - BICYCLE"
                    +  "\n 5 - ALL"
                    +  "\n 6 - EXIT \n");

            while(!correct) {
                try{
                    chose = Integer.parseInt(load.readLine());
                }catch (NumberFormatException n) {
                    LOGGER.info("\n ERROR"
                            +  "\n Enter the correct option");
                } catch (IOException e) {
                    LOGGER.info("\n ERROR"
                            +  "\n ERROR");
                }

                correct = chose == 1? false:true;

                switch (chose) {
                    case 1:
                        Options.returnSpeedestVehicle(civic,tesla);
                        correct = false;
                        break;
                    case 2:
                        Options.returnSpeedestVehicle(boat,battleship);
                        correct = false;
                        break;
                    case 3:
                        returnSpeedestVehicle(concorde, airbusA380);
                        correct = false;
                        break;
                    case 4:
                        returnSpeedestVehicle(mountainBike, bmx);
                        correct = false;
                        break;
                    case 5:
                        System.out.println(" The fastest is " + fastest.getManufacturer() + " max speed is: " + fastest.getMaxSpeed());
                        correct = false;
                        break;
                    case 6:
                        System.out.println(" THANKS FOR USE THIS APP");
                        end = true;
                        break;
                }
            }
        }
    }

}
