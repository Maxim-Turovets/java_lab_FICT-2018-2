package com.company;

import java.util.ArrayList;

public class Treatment {

    public int count = 10;
    private  ArrayList<Train> list = new ArrayList();

    public  void filling()
    {
        for(int i = 0;i<count;i++)
        {
            list.add(new Train(""));
            randPrint(list.get(i));
        }
    }

    public  void Add(Train obj)
    {
        list.add(obj);
    }

    public void setList(ArrayList<Train> list) {
        this.list = list;
    }

    public ArrayList<Train> getList() {
        return list;
    }

    public static double ConvertTimeObj (String str)
    {
        String [] mas  = new String[2];
        mas=str.split(":");
        double temp=0, temp2=0;
        temp=Double.parseDouble(mas[0]);
        temp2=Double.parseDouble(mas[1]);
        return  temp*60+temp2;
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
        obj.setSendTime(rand(1,12)+":"+rand(10,59));
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

}
