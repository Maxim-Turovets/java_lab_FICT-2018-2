package com.company;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;

public class Treatment   {


    public int count = 10;
    private  ArrayList<Train> list = new ArrayList();

    public  void Filling() throws IOException, ClassNotFoundException {

        randFilling();// рандомное заполнение системой
        //listToStringFile(); // запись обектов в файл стрингом
        //stringToList(); // чтение строкового файла в лист
        //listToJson();// запись листа в json
        //jsonToList(); // чтение с json в лист
        //serilializibleToList(); // запись бинарного кода
        //listToSerializible(); // чтение бинарного кода

    }

    public void setList(ArrayList<Train> list) {
        this.list = list;
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
            return 10000;
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
        randStat.add("NewYork");


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
        String temp = "|Train_number-"+ob.getNumberTrain()+" |Destination-"+ob.getDestination()+" |Send_time-"+ob.getSendTime()+" |Nummber_Common-"+ob.getNumberCommon()+" |Nummber_Koupe-"+ob.getNumberKoupe()+" |Nummber_SV-"+ob.getNumberSv()+" |Nummber_Plazcard-"+ob.getNumberPlz();
        return temp;
    }

    private void randFilling()
    {
        for(int i = 0;i<count;i++)
        {
            list.add(new Train());
            randPrint(list.get(i));
            ConvertTime(list.get(i));
        }
    }
    private void listToStringFile()
    {
        File hg = new File();

                for(int i = 0;i<count;i++)
        {
           hg.objToString(list.get(i));
            ConvertTime(list.get(i));
        }
    }

    private  void stringToList()
    {
        File hg = new File();
        this.list =  hg.stringToList();
    }

    private  void listToJson ()
    {
        File hg = new File();
        for(int i = 0;i<count;i++)
        {
            hg.objToJson(list.get(i));
            ConvertTime(list.get(i));
        }
    }
    private  void jsonToList()
    {
        File hg = new File();
        list =  hg.jsonToObj();
    }

    private  void listToSerializible() throws IOException {
        File file = new File();
        file.serializableToFile(list);
    }

    private  void serilializibleToList() throws IOException, ClassNotFoundException {
        File file = new File();
        file.fileTolistSerializible();
    }
}
