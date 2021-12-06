package com.company;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Passenger {
    String passengerName;
    int busNum;
    Date  date;
    int tickets;
    Passenger()
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter name of passenger: ");
        passengerName=scanner.next();
        System.out.println("Enter bus number: ");
        busNum=scanner.nextInt();
        System.out.println("Enter Date: ");
        String dateInp=scanner.next();

        SimpleDateFormat dateFormat=new SimpleDateFormat("dd-MM-yyyy");

        try {
            date=dateFormat.parse(dateInp);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        System.out.println("Enter number of tickets: ");
        tickets=scanner.nextInt();
    }

    public boolean isAvailable(ArrayList<Bus> buses,ArrayList<Passenger> passengers) {
            for(Bus bus:buses)
            {
                if(busNum==bus.getBusNum())
                {
                    if(bus.revisedCapacity(date,busNum,tickets)>=tickets)
                    {
                        bus.setCapacity(bus.revisedCapacity(date,busNum,tickets)-tickets);
                        return true;
                    }
                }
                else {
                    continue;
                }
            }
        return false;
    }


}
