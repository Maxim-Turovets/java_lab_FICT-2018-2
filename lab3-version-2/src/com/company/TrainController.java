package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class TrainController {
    private  Train model;
    private  View view;


    TrainController(Train model, View view)
    {
        this.model = model;
        this.view = view;
    }




   public void Update (){
       Scanner instr = new Scanner(System.in);
       String next = "";

       while (next!="n") {
           if(next=="n")
               break;
           Treatment ob = new Treatment();
           ob.Filling();
           View view = new View();
           view.printCommon(ob.getList());
           view.Print(ob.getList());
            next = instr.nextLine();
       }

   }




}
