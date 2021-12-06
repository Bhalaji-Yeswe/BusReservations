package com.company;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class Bus {
    private int busNum;
    private int capacity;
    private boolean AC;
    private HashMap<Integer,Date> revisedCapacity=new HashMap<>();
    Bus(int busNum,int capacity,boolean AC)
    {
        this.busNum=busNum;
        this.capacity=capacity;
        this.AC=AC;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public void setCapacity(int cap)
    {
        capacity=cap;
    }

    public boolean isAC()
    {
        return AC;
    }

    public void setAC(boolean ac)
    {
        AC=ac;
    }

    public int getBusNum()
    {
        return busNum;
    }

    public void dispalyBusInfo()
    {
        System.out.println("Bus number: "+busNum+" AC/Non-AC: "+AC);
    }

    public int revisedCapacity(Date date,int number,int booking)
    {
        if(!revisedCapacity.containsKey(number))
        {
            revisedCapacity.put(number,date);
        }
        return capacity;
    }
}
