package com.company;




import java.util.Scanner;

public class MVCMain {

    public static void main(String[] args) {

        String s ="  1234 ergerth 567";
        try {
            System.out.println("Enter text:");
            Scanner in = new Scanner(System.in);
            s = in.nextLine();
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }

//        WordProcessing model = new WordProcessing();
//        model.setText(s);
//        View view = new View();
//        WordProcessingController controller= new WordProcessingController(model,view);
//
//        controller.updateView();




    }
}
