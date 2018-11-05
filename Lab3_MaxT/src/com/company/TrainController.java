package com.company;

import java.util.ArrayList;

public class TrainController {
    private  Train model;
    private  View view;


    TrainController(Train model, View view)
    {
        this.model= model;
        this.view = view;
    }

    public String getSendTime() {
        return model.getSendTime();
    }

    public int getNumberCommon() {
        return model.getNumberCommon();
    }

    public int getNumberTrain() {
        return model.getNumberTrain();
    }

    public String getDestination() {
        return model.getDestination();
    }


    public void getInfoTime(String punkt, String time) {
        view.printTime(this.model, punkt, time);
    }

    public void getInfoNumber() {
        view.printCommon(this.model);
    }

    public void print(){
        Treatment ob = new Treatment();

    }

}
