package com.company;

public class Controller {
    private MyList model;
    private View view;

    private int N;
    private  int size;

    Controller (MyList model,View view)
    {
        this.model= model;
        this.view= view;
    }
    public void update()
    {

        this.size= view.getSize();
        this.N=view.getN();
        model.setN(this.N);
        model.setSize(this.size);

        Treament treament = new Treament();
        view.getMessage();
        treament.filling(model);
        view.getMessage2();
        treament.shift(model);
        view.printList(model);




    }

}
