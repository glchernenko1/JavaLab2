package com.company;

public class MyPoint {
    private double x, y;

    public MyPoint(){
        x=0;
        y=0;
    }

    public MyPoint(double x, double y){
        this.x=x;
        this.y=y;
    }

    public MyPoint(MyPoint in){
        x=in.x;
        y=in.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void move(double x, double y){
        this.x=x;
        this.y=y;
    }

    public double distance(MyPoint in){
        return Math.sqrt(Math.pow(x-in.x, 2)+Math.pow(y-in.y, 2));
    }

    public MyPoint getLocation(){
        return this;
    }

    public boolean equals(MyPoint in){
        return x-in.x<1E-10 && y-in.y<1E-10;
    }

    @Override
    public String toString() {
        return "My_Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
