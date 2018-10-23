package com.company;

public class Train {
    private  String Destination;
    private  int    NumberTrain;
    private  double SendTime;

    private  int NumberCommon;
    private  int NumberKoupe;
    private  int NumberPlz;
    private  int NumberSv;

    Train(String Destination,int NumberTrain,double SendTime,int NumberCommon,int NumberKoupe,int NumberPlz, int NumberSv)
    {
        this.Destination=Destination;
        this.NumberCommon=NumberCommon;
        this.SendTime=SendTime;
        this.NumberTrain=NumberTrain;
        this.NumberKoupe=NumberKoupe;
        this.NumberPlz=NumberPlz;
        this.NumberSv= NumberSv;
    }

    Train(String Destination,int NumberTrain,double SendTime)
    {
        this.Destination=Destination;
        this.NumberTrain=NumberTrain;
        this.SendTime=SendTime;
        this.NumberCommon=0;
        this.NumberKoupe=0;
        this.NumberPlz=0;
        this.NumberSv= 0;
    }

    public void setDestination(String destination) {
        Destination = destination;
    }

    public void setNumberCommon(int numberCommon) {
        NumberCommon = numberCommon;
    }

    public void setNumberKoupe(int numberKoupe) {
        NumberKoupe = numberKoupe;
    }

    public void setNumberPlz(int numberPlz) {
        NumberPlz = numberPlz;
    }

    public void setNumberTrain(int numberTrain) {
        NumberTrain = numberTrain;
    }

    public void setNumberSv(int numberSv) {
        NumberSv = numberSv;
    }

    public void setSendTime(double sendTime) {
        SendTime = sendTime;
    }

    public double getSendTime() {
        return SendTime;
    }

    public int getNumberCommon() {
        return NumberCommon;
    }

    public int getNumberKoupe() {
        return NumberKoupe;
    }

    public int getNumberPlz() {
        return NumberPlz;
    }

    public int getNumberSv() {
        return NumberSv;
    }

    public int getNumberTrain() {
        return NumberTrain;
    }

    public String getDestination() {
        return Destination;
    }


}
