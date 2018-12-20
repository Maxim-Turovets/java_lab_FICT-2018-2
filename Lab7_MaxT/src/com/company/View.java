package com.company;

import java.util.Scanner;

public class View {

    public int getN()
    {
        System.out.println("Введите число N");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        return N;
    }

    public int getSize()
    {
        System.out.println("Введите размер");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        return size;
    }

    public  void  getMessage()
    {
        System.out.println("Введите елементы списка");
    }
    public  void  getMessage2()
    {
        System.out.println("Сдвинутый список вправо на N елементов");
    }

    public void printList(MyList obj)
    {
        for (int i=0;i<obj.getSize(); i++)
        {
            System.out.println(obj.getMylist().get(i));
        }
    }


}
