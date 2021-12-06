package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int optNum = 1;
        ArrayList<Bus> buses = new ArrayList<>();
        ArrayList<Passenger> passengers = new ArrayList<>();

        buses.add(new Bus(1,5,true));
        buses.add(new Bus(2,4,false));
        buses.add(new Bus(3,3,true));

        for(Bus bus:buses)
        {
            bus.dispalyBusInfo();
        }

        while (optNum==1)
        {
            System.out.println("Enter 1 to book and 2 to exit");
            optNum=scanner.nextInt();
            if(optNum==1)
            {
                Passenger passenger = new Passenger();
                if(passenger.isAvailable(buses,passengers))
                {
                    passengers.add(passenger);
                    System.out.println("Booking Confirmed");
                }
                else
                {
                    System.out.println("Booking Fulled");
                }
            }
        }
    }
}
