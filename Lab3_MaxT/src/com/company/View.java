package com.company;

import java.util.ArrayList;

public class View {

    public  void printCommon(Train obj) {

        if (obj.getNumberCommon() > 0) {
            System.out.println(obj.toString());
        }
    }


    public  void printTime (Train obj, String Destin , String time ) {
        Train o = new Train("");

        if (obj.getDestination().equals(Destin.trim()) && obj.ConvertTime() > Treatment.ConvertTimeObj(time)) {
            System.out.println("Trains that go to a given place after a specified time: ");
            System.out.println( obj.toString());
        }
        else {
//            System.out.println("\n" +
//                    "Not found Train");
        }


    }

    public  void Update()
    {

    }

}
