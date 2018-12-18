package com.company;
import java.util.Scanner;
public class Train {
    private  String Destination;
    private  int    NumberTrain;
    private  String SendTime;

    private  int NumberCommon;
    private  int NumberKoupe;
    private  int NumberPlz;
    private  int NumberSv;



    Train(String Destination,int NumberTrain,String SendTime,int NumberCommon,int NumberKoupe,int NumberPlz, int NumberSv)
    {
        this.Destination=Destination;
        this.NumberCommon=NumberCommon;
        this.SendTime=SendTime;
        this.NumberTrain=NumberTrain;
        this.NumberKoupe=NumberKoupe;
        this.NumberPlz=NumberPlz;
        this.NumberSv= NumberSv;
    }

    Train(String Destination,int NumberTrain,String SendTime)
    {
        this.Destination=Destination;
        this.NumberTrain=NumberTrain;
        this.SendTime=SendTime;
        this.NumberCommon=0;
        this.NumberKoupe=0;
        this.NumberPlz=0;
        this.NumberSv= 0;
    }

    public Train(String Destination) {
        this.Destination=Destination;
        this.NumberTrain=0;
        this.SendTime="";
        this.NumberCommon=0;
        this.NumberKoupe=0;
        this.NumberPlz=0;
        this.NumberSv= 0;
    }

    public Train() {
        Scanner in = new Scanner(System.in);
        Scanner in2 = new Scanner(System.in);
        try {
            System.out.println("Enter Destination:");
            this.Destination = in.nextLine();
            System.out.println("Enter NumberTrain:");
            this.NumberTrain = in2.nextInt();
            System.out.println("Enter SendTime:");
            this.SendTime = in.nextLine();
            System.out.println("Enter NumberCommon:");
            this.NumberCommon = in.nextInt();
            System.out.println("Enter NumberKoupe:");
            this.NumberKoupe = in.nextInt();
            System.out.println("Enter NumberPlz:");
            this.NumberPlz = in.nextInt();
            System.out.println("Enter NumberSv:");
            this.NumberSv = in.nextInt();
        }
        catch (Exception e)
        {
            System.out.println("No correct  info");
        }
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

    public void setSendTime(String sendTime) {
        SendTime = sendTime;
    }

    public String getSendTime() {
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
        String destination = this.Destination;
        return destination;
    }

    public double ConvertTime ()
    {
        String [] mas  = new String[2];
        mas=this.getSendTime().split(":");
        double temp=0, temp2=0;
        try {
            temp = Double.parseDouble(mas[0]);
            temp2 = Double.parseDouble(mas[1]);
            if(temp>12||temp<1)
            {
                System.out.println("time not correct 1");
                return  0;
            }
            if(temp2>59||temp2<-1)
            {
                System.out.println("time not correct");
                return  0;
            }
            return temp * 60 + temp2;
        }
        catch (Exception e)
        {
            System.out.println("\n" +
                    "time not correct");
            return 0;
        }

    }



//    public double ConvertTimeObj ( String str)
//    {
//        String [] mas  = new String[2];
//        mas=str.split(":");
//        double temp=0, temp2=0;
//        temp=Double.parseDouble(mas[0]);
//        temp2=Double.parseDouble(mas[1]);
//        return  temp*60+temp2;
//    }

//    public void  randPrint(){
//        ArrayList<String> randStat = new ArrayList<String>();
//        randStat.add("Bremen");
//        randStat.add("Berlin");
//        randStat.add("Kyiv");
//        randStat.add("Milan");
//        randStat.add("Olevsk");
//        randStat.add("Poltava");
//        randStat.add("Bali");
//        randStat.add("Buharest");
//        randStat.add("Moskva");
//        randStat.add("New York");
//
//
//        this.Destination=randStat.get(rand(1,9));
//        this.NumberCommon=rand(1,45);
//        this.SendTime=rand(1,12)+":"+rand(10,59);
//        this.NumberTrain=rand(1,50);
//        this.NumberKoupe=rand(1,50);
//        this.NumberPlz=rand(1,50);
//        this.NumberSv= rand(1,50);
//
//
//    }

//    private int rand(int a,int b)
//    {
//
//        int random_number = a + (int) (Math.random() * b); // Генерация 1-го числа
//        return  random_number;
//    }

    @Override
    public String toString()
    {
     String temp = "|  Train number: "+this.NumberTrain+"|  Destination: "+this.Destination+"|  Send time: "+this.SendTime+"|  Nummber Common: "+NumberCommon+"|  Nummber Koupe: "+NumberKoupe+"|  Nummber SV: "+NumberSv+"|  Nummber Plazcard: "+NumberPlz;
        return temp;
    }



}
