package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MVCMain {

    public static void main(String[] args) {

//        int nummenu = 0, count=0;
//        System.out.println("Enter number of trains");
//        Scanner in = new Scanner(System.in);
//        count=in.nextInt();
//        System.out.println("Выберите метод обаботки - 1 вручную  2 - рандомно");
//
//        nummenu = in.nextInt();

//        if (nummenu == 1)
//        {
//            ArrayList<Train> model = new ArrayList<Train>();
//            View view = new View();
//            System.out.print("=========================================================================");
//            System.out.println("=========================================================================");
//            for (int i = 0; i < count; i++) {
//
//                model.add(new Train());
//             //   System.out.println(model.get(i).toString());
//            }
//
//            System.out.println("Trains that have common places: ");
//            for (int i = 0; i < count; i++) {
//                TrainController controller = new TrainController(model.get(i), view);
//                controller.getInfoNumber();
//            }
//
//            System.out.println("Введите пункт назначения и время после которого поезд отправляется");
//            Scanner instr = new Scanner(System.in);
//            String punkt = instr.nextLine();
//            String time  = instr.nextLine();
//
//            for (int i = 0; i < count; i++) {
//                TrainController controller = new TrainController(model.get(i), view);
//                controller.getInfoTime(punkt, time);
//            }
//
//            System.out.print("=========================================================================");
//            System.out.println("=========================================================================");
//
//        }
//
//        if (nummenu == 2)
//        {
//            ArrayList<Train> model = new ArrayList<Train>();
//
//            View view = new View();
//            System.out.print("=========================================================================");
//            System.out.println("=========================================================================");
//            for (int i = 0; i < count; i++) {
//                model.add(new Train(""));
//                Treatment.randPrint(model.get(i));
//                System.out.println(model.get(i).toString());
//            }
//            System.out.print("=========================================================================");
//            System.out.println("=========================================================================");
//
//
//            System.out.println("Trains that have common places: ");
//            for (int i = 0; i < count; i++) {
//                TrainController controller = new TrainController(model.get(i), view);
//                controller.getInfoNumber();
//            }
//
//            System.out.println("Введите пункт назначения и время после которого поезд отправляется");
//            Scanner instr = new Scanner(System.in);
//            String punkt = instr.nextLine();
//            String time  = instr.nextLine();
//
//            for (int i = 0; i < count; i++) {
//                TrainController controller = new TrainController(model.get(i), view);
//                controller.getInfoTime(punkt, time);
//            }
//        }
        Treatment ob = new Treatment();
        ob.filling();
        for(int i = 0; i<ob.count; i++ )
        {
            System.out.println(ob.getList().get(i).toString());
        }



    }
}
