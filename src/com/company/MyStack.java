package com.company;

import java.lang.reflect.Array;
import java.util.Objects;
import java.util.Vector;

public class MyStack<T> {
    private T[] data;
    private int size;

    public MyStack(){
        size=0;
        data= (T[]) new  Object [size];
    }


    public void push(T in){
        T[] tmp = (T[]) new  Object [size+1];
        tmp[0]=in;
        for (int i = 0; i < size; i++) {
            tmp[i+1] = data[i];
        }
        ++size;
        data=tmp;
    }

    public T peak(){
        if (isEmpty()) throw new IndexOutOfBoundsException("Stack empty");
        return data[0];
    }

    public void pop(){
        if (isEmpty()) throw new IndexOutOfBoundsException("Stack empty");
        else {
            T[] tmp = (T[]) new Object[size - 1];
            for (int i = 0; i < size - 1; i++) {
                tmp[i] = data[i + 1];
            }

            --size;
            data = tmp;
        }
    }

    public boolean isEmpty(){
        return size==0;

    }
}
