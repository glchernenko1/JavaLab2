package com.company;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPoint myPoint = (MyPoint) o;
        return Double.compare(myPoint.x, x) == 0 &&
                Double.compare(myPoint.y, y) == 0;
    }


    @Override
    public String toString() {
        return "My_Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }

}
