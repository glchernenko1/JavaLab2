package com.company;

public class My_Point {
    private double x, y;

    public My_Point(){
        x=0;
        y=0;
    }

    public My_Point(double x, double y){
        this.x=x;
        this.y=y;
    }

    public My_Point(My_Point in){
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

    public double distance(My_Point in){
        return Math.sqrt(Math.pow(x-in.x, 2)+Math.pow(y-in.y, 2));
    }

    public My_Point getLocation(){
        return this;
    }

    public boolean equals(My_Point in){
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
