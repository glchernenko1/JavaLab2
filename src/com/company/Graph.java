package com.company;

public class Graph<T> {
    private T data;
    private  Graph<T>[]  parts;
    private  int size;

    public  Graph(){
        data=null;
        size=0;
        parts= new  Graph[0];
    }

    public  Graph(T in){
        data=in;
        size=0;
        parts= new  Graph[0];
    }

    public void addData(T in){
        data=in;
    }

    public void  add(Graph<T> in){
        Graph<T>[] tmp = new  Graph[size+1];
        tmp[size]=in;
        for (int i = 0; i < size-1; i++) {
            tmp[i] = parts[i+1];
        }
        ++size;
        parts=tmp;
    }

    public void del(int index){
        int flag=0;
        if (isAlone()) throw new IndexOutOfBoundsException("Graph Alone(");
        else
            if (index>=size|| index<0) throw new IndexOutOfBoundsException("Удаление за пределами массива(");
            else {
                Graph<T>[] tmp = new Graph[size - 1];
                for (int i = 0; i < size; i++) {

                    int j=i-flag;
                    if (i==index) {
                        flag=1;
                        continue;
                    }
                    tmp[j] = parts[i];
                }
                --size;
                parts = tmp;
            }
    }

    public boolean isAlone(){
        return  size ==0;
    }

    public int getSize(){
        return size;
    }


}
