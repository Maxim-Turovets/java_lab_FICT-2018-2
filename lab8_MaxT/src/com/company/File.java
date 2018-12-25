package com.company;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;


public class File {
    private static final Logger logger = Logger.getLogger(File.class.getName());

    public  static  int row=0;

    public  void objToString(Train obj)
    {
        Treatment temp = new Treatment();
        String temp_str = temp.toString(obj);

        try(FileWriter writer = new FileWriter("ObjToString.txt", true))
        {
            writer.write(temp_str+"\n");
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }

    public  ArrayList <String> fileToString() throws IOException {
        ArrayList <String> list_string = new ArrayList<String>();

        Handler handler = new FileHandler();
        logger.addHandler(handler);


        String line="";
        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("ObjToString.txt"), StandardCharsets.UTF_8))){

            while ((line = reader.readLine()) != null) {
                list_string.add(line+" \n");
                row++;
            }
            logger.log(Level.WARNING, "File not found", new FileNotFoundException());
        } catch (IOException e) {
            System.err.println("File not found");
        }

        return  list_string;
    }

    public ArrayList<Train> stringToList() throws IOException {
          String Destination="";
          int    NumberTrain=0;
          String SendTime="";

          int NumberCommon=0;
          int NumberKoupe=0;
          int NumberPlz=0;
          int NumberSv=0;

        ArrayList<Train> list = new ArrayList();
        ArrayList <String>  temp_str = fileToString();


        for (int i=0;i<temp_str.size();i++)
        {
            String[] arrSplit = temp_str.get(i).split(" ");
            for (int j=0;j<arrSplit.length;j++)
            {
                String[] arrSplit2 = arrSplit[j].split("-");

                if(j==0)
                    NumberTrain=Integer.parseInt(arrSplit2[1]);
                if(j==1)
                    Destination=arrSplit2[1];
                if(j==2)
                    SendTime=arrSplit2[1];
                if(j==3)
                    NumberCommon=Integer.parseInt(arrSplit2[1]);
                if(j==4)
                    NumberKoupe=Integer.parseInt(arrSplit2[1]);
                if(j==5)
                    NumberSv=Integer.parseInt(arrSplit2[1]);
                if(j==6)
                    NumberPlz=Integer.parseInt(arrSplit2[1]);
            }
            Train temp_obj = new Train(Destination,NumberTrain,SendTime,NumberCommon,NumberKoupe,NumberPlz, NumberSv);
            list.add(temp_obj);


        }
        return  list;
    }


    public  void objToJson(Train obj)
    {
        // конвертируем наш JAVA объект в JSON
        Gson gson = new Gson();


            String json = gson.toJson(obj);
            System.out.println(json);
            try (FileWriter writer = new FileWriter("ObjToJson.json", true)) {
                writer.write(json+" \n");
                writer.flush();
            } catch (IOException ex) {
                System.out.println(ex.getMessage());
            }

    }

    public  ArrayList<Train> jsonToObj ()
    {
        String line="";
        String jsonText="";
        Train murzik = null;
        ArrayList<Train> k = new ArrayList<Train>();

        try (BufferedReader reader = new BufferedReader(
                new InputStreamReader(
                        new FileInputStream("ObjToJson.json"), StandardCharsets.UTF_8))){

            while ((line = reader.readLine()) != null) {
                 jsonText =line+"\n";
                GsonBuilder builder = new GsonBuilder();
                Gson gson = builder.create();
                murzik = gson.fromJson(jsonText, Train.class);
                k.add(murzik);
            }
        } catch (IOException e) {
            //e.printStackTrace();
            System.err.println("File json not found");
        }

        return  k;
    }

    public void serializableToFile(ArrayList<Train>list) throws IOException {

        FileOutputStream fos = new FileOutputStream("temp.out");
        ObjectOutputStream oos = new ObjectOutputStream(fos);

        Train as = new Train();

     for (int i=0;i<list.size(); i++)
      {
      Train ts = list.get(i);
      as.list.add(ts);
      }

        oos.writeObject(as);
        oos.flush();
        oos.close();

    }

    public  ArrayList<Train> fileTolistSerializible() throws IOException, ClassNotFoundException,Exception {

        Handler handler = new FileHandler();
        logger.addHandler(handler);

try {
    FileInputStream fis = new FileInputStream("temp.out");
    ObjectInputStream oin = new ObjectInputStream(fis);

    Train ts = (Train) oin.readObject();


    logger.log(Level.WARNING, "File not found", new FileNotFoundException());
    return ts.getList();
}
catch (Exception e)
{
    System.err.println("File not found");
    return null;
}
    }
}
