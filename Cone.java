package com.company;

/*
Name: Bogdan Caleta Ivkovic
Date: 3.5.2020
Class: 2BBKIF
*/

public class Cone {
    private Double radius;
    private Double height;
    private Double volume;
    private Double area;

    public Cone(Double r, Double v, Double h){
        /*Expected radius, volume, area and height
        values that are unknown should be passed as 0*/

        //look for two values that are above 0 because they are the known ones
        if(r>0 && h>0){
            setRadius(r);
            setHeight(h);
            volume = getVolume();
            setVolume(volume);
        }
        else if(r>0 && v>0){
            setRadius(r);
            setVolume(v);
            height = getHeight();
            setHeight(height);
        }
        else if(v>0 && h>0){
            setVolume(v);
            setHeight(h);
            radius = getRadius();
            setRadius(radius);
        }
        else{ //in case two or more values are 0 program will stop as the values are false
            System.out.println("Some value was falsely entered. Start again.");
            return;
        }
        //area is calculated at the end as it will always require same variables
        area = getArea();
        setArea(area);
        getAll();
    }

    private void setRadius(Double r){
        this.radius = r;
    }

    private void setVolume(Double v){
        this.volume = v;
    }

    private void setHeight(Double h){
        this.height = h;
    }

    private void setArea(Double a){
        this.area = a;
    }

    private Double getRadius(){
        if(radius!=null){ //if value exist it will be used, otherwise calculated
            return radius;
        }
        // r = sqrt(3*v/(pi*h))
        return Math.sqrt(3.0*volume/(Math.PI*height));
    }

    private Double getArea(){
        if(area!=null){ //if value exist it will be used, otherwise calculated
            return area;
        }
        // a = pi * r * (r + sqrt(h^2+r^2))
        return Math.PI*radius*(radius+Math.sqrt(Math.pow(height,2)+Math.pow(radius,2)));

    }

    private Double getVolume(){
        if(volume!=null){ //if value exist it will be used, otherwise calculated
            return volume;
        }
        // v = PI * r^2 * h/3
        return Math.PI * Math.pow(radius,2) * height/3.0;
    }

    private Double getHeight(){
        if(height!=null){ //if value exist it will be used, otherwise calculated
            return height;
        }
        // h =  3*v/(pi*r^2)
        return 3.0*volume/(Math.PI*Math.pow(radius,2));
    }

    private void getAll(){
        System.out.println("Cone values: ");
        System.out.println("Radius: "+getRadius());
        System.out.println("Volume: "+getVolume());
        System.out.println("Area: "+getArea());
        System.out.println("Height: "+getHeight());
        System.out.println("\n");
    }
}
