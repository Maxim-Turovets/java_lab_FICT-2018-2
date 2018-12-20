package com.company;

import java.util.ArrayList;

public class MyList<T> {

    private ArrayList<T> mylist= new ArrayList<T>();
    private  int N;
    private  int size;


    public int getN() {
        return N;
    }

    public void setN(int n) {
        N = n;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public ArrayList<T> getMylist() {
        return mylist;
    }

    public void setMylist(ArrayList<T> mylist) {
        this.mylist = mylist;
    }
}
