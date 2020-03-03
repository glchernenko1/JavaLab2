package com.company;

import java.util.Vector;

public class MyStack<T> {
    private Vector<T> data;

    public MyStack(){
        data=new Vector<T>();
    }


    public void push(T in){
        data.add(0, in);
    }

    public T peek(){
        return data.firstElement();
    }

    public void pop(){
        data.remove(0);
    }

    public boolean isEmpty(){
        return data.isEmpty();
    }
}
