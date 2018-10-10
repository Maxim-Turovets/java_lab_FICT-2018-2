package com.company;



import java.util.regex.*;
import java.io.IOException;
import java.util.Scanner;

public class MVCMain {

    public static void main(String[] args) {


    String s = "23 efgrth 2 dgdf 10";
   WordProcessing model = new WordProcessing();
   model.setText(s);
   View view = new View();
   WordProcessingController controller= new WordProcessingController(model,view);

   controller.updateView();




    }
}
