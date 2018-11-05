package com.company;

import java.util.ArrayList;

public class Treatment {


    public int count = 10;
    private  ArrayList<Train> list = new ArrayList();

    public  void Filling()
    {
        for(int i = 0;i<count;i++)
        {
            list.add(new Train());
            randPrint(list.get(i));
            ConvertTime(list.get(i));
        }
    }

    public void ConvertTime (Train ob)
    {
        String [] mas  = new String[2];
        mas=ob.getSendTime().split(":");
        double temp=0, temp2=0;
        try {
            temp = Double.parseDouble(mas[0]);
            temp2 = Double.parseDouble(mas[1]);
            if(temp>12||temp<1)
            {
                System.out.println("time not correct 1");
                ob.setDoubleTime(0);
            }
            if(temp2>59||temp2<-1)
            {
                System.out.println("time not correct");
                ob.setDoubleTime(0);
            }
            ob.setDoubleTime(temp * 60 + temp2);
        }
        catch (Exception e)
        {
            System.out.println("\n" +
                    "time not correct");
            ob.setDoubleTime(0);
        }

    }

    public ArrayList<Train> getList() {
        return list;
    }

    public static double ConvertTimeObj (String str)
    {
        try {
            String[] mas = new String[2];
            mas = str.split(":");
            double temp = 0, temp2 = 0;
            temp = Double.parseDouble(mas[0]);
            temp2 = Double.parseDouble(mas[1]);
            return temp * 60 + temp2;
        }
        catch (Exception e)
        {
            System.out.println("incorrect");
            return 0;
        }
    }

    public static void  randPrint(Train obj){
        ArrayList<String> randStat = new ArrayList<String>();
        randStat.add("Bremen");
        randStat.add("Berlin");
        randStat.add("Kyiv");
        randStat.add("Milan");
        randStat.add("Olevsk");
        randStat.add("Poltava");
        randStat.add("Bali");
        randStat.add("Buharest");
        randStat.add("Moskva");
        randStat.add("New York");


        obj.setDestination(randStat.get(rand(1,9)));
        obj.setNumberCommon(rand(1,45));
        obj.setSendTime(rand(1,12)+":"+rand(10,49));
        obj.setNumberTrain(rand(1,50));
        obj.setNumberKoupe(rand(1,50));
        obj.setNumberPlz(rand(1,50));
        obj.setNumberSv(rand(1,50));


    }
    public static int rand(int a,int b)
    {

        int random_number = a + (int) (Math.random() * b); // Генерация 1-го числа
        return  random_number;
    }


    public String toString( Train ob)
    {
        String temp = "|  Train number: "+ob.getNumberTrain()+"|  Destination: "+ob.getDestination()+"|  Send time: "+ob.getSendTime()+"|  Nummber Common: "+ob.getNumberCommon()+"|  Nummber Koupe: "+ob.getNumberKoupe()+"|  Nummber SV: "+ob.getNumberSv()+"|  Nummber Plazcard: "+ob.getNumberPlz();
        return temp;
    }
}
