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

            temp = Double.parseDouble(mas[0]);
            temp2 = Double.parseDouble(mas[1]);
            ob.setDoubleTime(temp * 60 + temp2);


    }

    public ArrayList<Train> getList() {
        return list;
    }

    public static double ConvertTimeObj (String str) throws TimeException
    {

            String[] mas = new String[2];
            mas = str.split(":");

            TimeValidator.ConvertTimeObj(str);
            double temp = 0, temp2 = 0;
            try {
                temp = Double.parseDouble(mas[0]);
                temp2 = Double.parseDouble(mas[1]);
                return temp * 60 + temp2;
            } catch (NumberFormatException num_ex)
            {
                return  10000;
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

    public  static  boolean bol(ArrayList<Train>list , String Destin)
    {
        for(int i=0;i<list.size();i++) {
            if (list.get(i).getDestination().equals(Destin.trim())) {
                return  true;
            }
        }
        return  false;
    }

    public  static  void view(ArrayList<Train>list, double localtime , String Destin , Treatment ob)
    {
        for(int i=0;i<list.size();i++) {
            if (list.get(i).getDestination().equals(Destin.trim()) ) {
                if (list.get(i).getDoubleTime() > localtime) {
                    System.out.println("Поезда, которые отправляются в определенное место после определенного времени: ");
                    System.out.println(ob.toString(list.get(i)));
                }
            }

        }
    }
    public String toString( Train ob)
    {
        String temp = "|  Train number: "+ob.getNumberTrain()+"|  Destination: "+ob.getDestination()+"|  Send time: "+ob.getSendTime()+"|  Nummber Common: "+ob.getNumberCommon()+"|  Nummber Koupe: "+ob.getNumberKoupe()+"|  Nummber SV: "+ob.getNumberSv()+"|  Nummber Plazcard: "+ob.getNumberPlz();
        return temp;
    }
}
