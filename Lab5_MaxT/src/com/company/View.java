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



    public  void Print (ArrayList<Train>list) throws TimeException, NoCorrectNameException {
        System.out.print("=========================================================================");
            System.out.println("=========================================================================");
        Treatment ob= new Treatment();



        System.out.println("Введите пункт назначения и время после которого поезд отправляется");
            Scanner instr = new Scanner(System.in);
        String Destin = "";
        String time = "";


        try {
            Destin = instr.nextLine();
            time = instr.nextLine();
        }
        catch (Exception no_ex) {}
                                                                                                                                                                                                                                              double localtime= Treatment.ConvertTimeObj(time);boolean correct = false;
        NoCorrectValidator.Valid(Treatment.bol(list,Destin));
        Treatment.view(list,localtime, Destin, ob);
    }

}
