package com.company;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MVCMain {

    public static void main(String[] args) {

        Treatment ob = new Treatment();
        ob.filling();
        for(int i = 0; i<ob.count; i++ )
        {
            System.out.println(ob.getList().get(i).toString());
        }



    }
}
