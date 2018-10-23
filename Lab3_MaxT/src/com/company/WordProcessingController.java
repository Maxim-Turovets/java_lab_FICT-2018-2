package com.company;

public class WordProcessingController {
    private WordProcessing model;
    private View view;

    public WordProcessingController (WordProcessing model , View view)
    {
        this.model= model;
        this.view=view;
    }

    public  void setText(String str)
    {
        model.setText(str);
    }

    public  String getText ()
    {
        return  model.getText();
    }

    public double getSum()
    {

        return model.getSum();
    }

    public  void updateView(){
        view.printText(model.getText(),model.getSum());
    }
}
