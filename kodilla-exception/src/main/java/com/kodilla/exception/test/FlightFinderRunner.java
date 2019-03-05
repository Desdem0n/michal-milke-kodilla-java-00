package com.kodilla.exception.test;

import com.kodilla.exception.test.FlightFinder;
import com.kodilla.exception.test.FlightFinderRunner;
import com.kodilla.exception.test.ExceptionHandling;
import java.util.HashMap;
import java.util.Map;

public class FlightFinderRunner {
    public static void main(String args[]) {

        Flight flight = new Flight("Warsaw", "Gdansk");

        FlightFinder flightFinder = new FlightFinder();

        try {

            flightFinder.findFlight(flight);

        } catch (RouteNotFoundException e) {

            System.out.println("The airport you are trying to find doesn't exist!");
        }
    }
}
