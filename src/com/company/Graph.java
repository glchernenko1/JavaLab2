package com.company;

public class Graph<T> {
    private T data;
    private  Graph<T>[]  parts;
    private  int size;

    public  Graph(){
        data=null;
        size=0;
        parts= (Graph<T>[]) new  Graph[0];
    }

    public  Graph(T in){
        data=in;
        size=0;
        parts=  (Graph<T>[]) new  Graph[0];
    }

    public void addData(T in){
        data=in;
    }

    public void  add(Graph<T> in){
        Graph<T>[] tmp = (Graph<T>[]) new  Graph[size+1];
        tmp[size]=in;
        for (int i = 0; i < size; i++) {
            tmp[i] = parts[i];
        }
        ++size;
        parts=tmp;
    }


    public boolean isFinde(Graph<T> in){
        boolean flag= false;
        for (int i = 0; i < size && !flag; i++)
            flag = (in.data == parts[i].data);

        return flag;
    }

    public int finde(Graph<T> in){
        int i=0;
        boolean flag=false;

        for(; i<size && !flag;i++)
            flag= in.data==parts[i].data;
        return i-1;
    }




    public void del(Graph<T> in){
        int flag=0;
        if (!isFinde(in)) throw new IndexOutOfBoundsException("Graph not Finde(");
        else {
            int index = finde(in);
            if (index >= size || index < 0) throw new IndexOutOfBoundsException("Удаление за пределами массива(");
            else {
                Graph<T>[] tmp = (Graph<T>[]) new Graph[size - 1];
                for (int i = 0; i < size; i++) {

                    int j = i - flag;
                    if (i == index) {
                        flag = 1;
                        continue;
                    }
                    tmp[j] = parts[i];
                }
                --size;
                parts = tmp;
            }
        }
    }

    public boolean isAlone(){
        return  size ==0;
    }


    public int getSize(){
        return size;
    }


}
