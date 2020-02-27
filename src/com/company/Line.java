package com.company;

import java.util.Objects;

public class Line {
    private String name;
    private MyPoint point1;
    private MyPoint point2;

    public Line(){
        name="Line";
        point1=new MyPoint(0,0);
        point2=new MyPoint(0,1);
    }
    public Line(String name, MyPoint point1, MyPoint point2){
        try {
            this.name=name;
            this.point1=point1;
            this.point2=point2;
            if (point1.equals(point2)) throw new IllegalArgumentException("Точки совпадают!");
        }
        catch (Exception e){
            System.out.println(e);
        }
    }

    //Задания прямой по общему виду уравнения прямой.
    public Line(double a, double b, double c){
        point1=new MyPoint(1, -c-a);
        point2=new MyPoint(-1, -c+a);
    }

    @Override
    public String toString() {
        return "Line{" +
                "name='" + name + '\'' +
                ", point1=" + point1 +
                ", point2=" + point2 +
                '}';
    }

    //Коэффициент при x в общее уравнение  прямой.
    public double coefficientA(){
        return point1.getY()-point2.getY();
    }

    //Коэффициент при y в общее уравнение прямой.
    public double coefficientB(){
        return point2.getX()-point1.getX();
    }

    //Свободный коэффициент  в общее уравнение прямой.
    public double coefficientC(){
        return point1.getX()*point2.getY()-point2.getX()*point1.getY();
    }

    public Boolean isParallelLines(Line in){
        return Math.abs(this.coefficientA()-in.coefficientA())<1E-10 && Math.abs(this.coefficientB()-in.coefficientB())<1E-10;
    }

    public Boolean isPerpendicular(Line in){
        return Math.abs(this.coefficientA()*in.coefficientA()+this.coefficientB()*in.coefficientB())<1E-10;
    }

    public MyPoint getPoint1() {
        return point1;
    }

    public MyPoint getPoint2() {
        return point2;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPoints(MyPoint point1, MyPoint point2) {
        try {
            this.point1 = point1;
            this.point2 = point2;
            if (point1.equals(point2)) throw new IllegalArgumentException("Точки совпадают!");
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }

    //Задания прямой по общему виду уравнения прямой
    public void changeLine(double a, double b, double c){
        point1=new MyPoint(1, -c-a);
        point2=new MyPoint(-1, -c+a);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        return this.isParallelLines(line)&& Math.abs(coefficientC()-line.coefficientC())<1E-10;
    }




}
