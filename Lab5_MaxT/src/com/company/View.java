package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class View {

    public  void printCommon(ArrayList<Train>list) {
        Treatment ob= new Treatment();
        for(int i = 0; i<list.size(); i++ )
        {
            System.out.println(ob.toString(list.get(i)));
        }

        System.out.print("=========================================================================");
        System.out.println("=========================================================================");
        System.out.println("Поезда которые имеют общие места");

        for (int i=0;i<list.size();i++)
        {
            if (list.get(i).getNumberCommon() > 0) {
                System.out.println(ob.toString(list.get(i)));
            }
        }
    }



    public  void Print (ArrayList<Train>list) throws TimeException {
        System.out.print("=========================================================================");
            System.out.println("=========================================================================");
        Treatment ob= new Treatment();



        System.out.println("Введите пункт назначения и время после которого поезд отправляется");
            Scanner instr = new Scanner(System.in);
            String Destin = instr.nextLine();
            String time  = instr.nextLine();
            double localtime= Treatment.ConvertTimeObj(time);


        for(int i=0;i<list.size();i++) {
            if (list.get(i).getDestination().equals(Destin.trim()) && list.get(i).getDoubleTime() > localtime) {
                System.out.println("Поезда, которые отправляются в определенное место после определенного времени: ");
                System.out.println(ob.toString(list.get(i)));
            }

        }

     //   System.out.println("\n" +"Not found Train");

    }

}
