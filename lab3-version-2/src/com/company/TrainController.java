package com.company;

import java.util.ArrayList;

public class TrainController {
    private  Train model;
    private  View view;


    TrainController(Train model, View view)
    {
        this.model = model;
        this.view = view;
    }




   public void Update (){
       Treatment ob = new Treatment();
       ob.Filling();
       View view = new View();
       view.printCommon(ob.getList());
       view.Print(ob.getList());

   }




}
