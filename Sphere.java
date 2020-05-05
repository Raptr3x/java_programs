package com.company;
import java.lang.Math;

/*
Name: Bogdan Caleta Ivkovic
Date: 3.5.2020
Class: 2BBKIF
*/

public class Sphere {
    private Double radius;

    public Sphere(Double r){
        setRadius(r);
        getAll();
    }

    private void setRadius(Double r){
        this.radius = r;
    }

    private Double getRadius(){
        return radius;
    }

    private Double getArea(){
        // 4 * pi * r^2
        return 4 * Math.PI * Math.pow(radius, 2);
    }

    private Double getVolume(){
        // 4/3 * pi * r^3
        return 4.0/3.0 * Math.PI * Math.pow(radius, 3);
    }

    private void getAll(){
        System.out.println("Sphere values: ");
        System.out.println("Radius: "+getRadius());
        System.out.println("Area: "+getArea());
        System.out.println("Volume: "+getVolume());
        System.out.println("\n");
    }
}
