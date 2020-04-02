package com.company;

import org.jetbrains.annotations.NotNull;

import java.lang.reflect.Array;

public class Matrix {
    private double [][] data;
    private int n;
    private int m;

    public  Matrix (int n, int m){
        this.n=n;
        this.m=m;
        data= new double[n][m];
    }

    public  Matrix (int n, int m, double[][]data){
        this.n=n;
        this.m=m;
        this.data= new double[n][m];
        for (int i=0;i<m; ++i)
            for (int j=0; j<n; ++j)
                this.data[j][i]=data[j][i];

    }

    public  boolean isSquare(){
        return n==m;
    }
    public void print(){
        for (int i=0;i<m; ++i) {
            for (int j = 0; j < n; ++j)
                System.out.print(data[i][j] + "\t");
            System.out.println();
        }
    }
    public  boolean isDownTriangular(){
        if (!isSquare()) throw new IllegalArgumentException ("Не квадратная");
        boolean flag=true;
        for (int i=0;i<m & flag; ++i)
            for (int j=1+i; j<n & flag; ++j)
                flag=Math.abs(data[i][j])<1E-20;
            return flag;
    }

    public  boolean isUpTriangular() {
        if (!isSquare()) throw new IllegalArgumentException ("Не квадратная");
        boolean flag=true;
        for (int i=0;i<m & flag; ++i)
            for (int j=0; j<i & flag; ++j)
                flag = Math.abs(data[i][j]) < 1E-10;
        return flag;
    }

    public  boolean isDiag(){
        return isDownTriangular()&isUpTriangular();
    }

    public boolean isNull(){
        boolean flag=true;
        for (int i=0;i<m & flag; ++i)
            for (int j=0; j<n & flag; ++j)
                flag=Math.abs(data[j][i])<1E-10;
        return flag;
    }

    public boolean isOne(){
        boolean flag=true;
        for (int i=0;i<m & flag; ++i)
            for (int j=0; j<n & flag; ++j)
                flag=Math.abs(data[j][i]-1)<1E-10;
        return flag;
    }

    public double getData(int n,int m){
        return data[n][m];
    }
    public boolean isEuals(@NotNull Matrix in){
        boolean flag=n==in.n&m==m;
        for (int i=0;i<m & flag; ++i)
            for (int j=0; j<n & flag; ++j)
                flag=Math.abs(data[j][i]-in.data[j][i])<1E-10;
        return flag;
    }

    public Matrix multiply(double in){
        Matrix tmp= new Matrix(n,m, data);
        for (int i=0;i<m; ++i)
            for (int j=0;j<n; ++j)
            tmp.data[i][j]*=in;
            return tmp;
    }

    public Matrix multiply(@NotNull Matrix in){
        if (m!=in.n) throw new IllegalArgumentException ("размеры не совпадают");
        Matrix tmp= new Matrix(n,in.m);
        for (int i=0; i<n; ++i)
            for (int j=0; j<in.m; ++j)
                for (int k=0; k<m; ++k)
                    tmp.data[i][j] += data[i][k] * in.data[k][j];
        return tmp;
    }

    public boolean isSymmetrical(){
        if (m!=n) throw new IllegalArgumentException ("Не квадратная");
        boolean flag=true;
        for (int i=0;i<n & flag; ++i)
            for (int j=1+i; j<n & flag; ++j) {
                double tmp1 = data[i][j];
                double tmp2 = data[j][i];
                flag = data[j][i] == data[i][j];
            }
        return flag;
    }




}
