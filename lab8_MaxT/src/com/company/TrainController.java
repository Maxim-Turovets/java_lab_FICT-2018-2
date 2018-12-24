package com.company;


import java.io.IOException;
import java.util.Scanner;

public class TrainController {
    private  Train model;
    private  View view;


    TrainController(Train model, View view)
    {
        this.model = model;
        this.view = view;
    }




   public void Update () throws Exception {
       Scanner instr = new Scanner(System.in);
       String next = "";

       while (next!="n") {
           if(next.equals("n"))
               break;
           Treatment ob = new Treatment();
           ob.Filling();
           View view = new View();
           view.printCommon(ob.getList());
           view.Print(ob.getList());
           System.out.println("Нажмите любую кнопку для продолжения  или 'n' для выхода ");
            next = instr.nextLine();

       }

   }




}
