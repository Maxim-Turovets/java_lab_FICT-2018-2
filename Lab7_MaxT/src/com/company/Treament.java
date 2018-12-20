package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Treament <T>{

    public void filling(MyList obj){

        Scanner sc = new Scanner(System.in);

        for (int i=0;i<obj.getSize(); i++)
        {
            T str = (T) sc.nextLine();
            obj.getMylist().add(str);
        }
    }

    public void shift (MyList obj){

        for (int i=0;i<obj.getN(); i++)
        {
         T element = (T)obj.getMylist().get(obj.getSize()-1);
         obj.getMylist().remove(obj.getSize()-1);
         obj.getMylist().add(0, element);
        }
    }
}
