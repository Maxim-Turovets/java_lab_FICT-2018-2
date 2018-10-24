package com.company;

import java.util.ArrayList;

public class TrainController {
    private  Train model;
    private  View view;

//    TrainController(String Destination,int NumberTrain,String SendTime,int NumberCommon,int NumberKoupe,int NumberPlz, int NumberSv)
//    {
//        model.setDestination(Destination);
//        model.setNumberTrain(NumberTrain);
//        model.setSendTime(SendTime);
//        model.setNumberCommon(NumberCommon);
//        model.setNumberKoupe(NumberKoupe);
//        model.setNumberPlz(NumberPlz);
//        model.setNumberSv(NumberSv);
//    }
//
//    TrainController(String Destination,int NumberTrain,String SendTime)
//    {
//        model.setDestination(Destination);
//        model.setNumberTrain(NumberTrain);
//        model.setSendTime(SendTime);
//        model.setNumberCommon(0);
//        model.setNumberKoupe(0);
//        model.setNumberPlz(0);
//        model.setNumberSv(0);
//    }
//
//     TrainController(String Destination) {
//        model.setDestination(Destination);
//        model.setNumberTrain(0);
//        model.setSendTime("");
//        model.setNumberCommon(0);
//        model.setNumberKoupe(0);
//        model.setNumberPlz(0);
//        model.setNumberSv(0);
//    }

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


}
