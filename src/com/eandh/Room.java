package com.eandh;

/**
 * Created by localadmin on 7/27/16.
 */
public class Room implements Cost{
    private String name;
    private Floor floor;
    private Paint paint;
    private int Length;
    private int Height;
    private int Width;

    public Room(String name, Floor floor, Paint paint, int length, int height, int width) {
        this.name = name;
        this.floor = floor;
        this.paint = paint;
        Length = length;
        Height = height;
        Width = width;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setFloor(Floor floor) {
        this.floor = floor;
    }

    public void setPaint(Paint paint) {
        this.paint = paint;
    }

    public void setLength(int length) {
        Length = length;
    }

    public void setHeight(int height) {
        Height = height;
    }

    public void setWidth(int width) {
        Width = width;
    }

    public String getName() {
        return name;
    }

    public Floor getFloor() {
        return floor;
    }

    public Paint getPaint() {
        return paint;
    }

    public int getLength() {
        return Length;
    }

    public int getHeight() {
        return Height;
    }

    public int getWidth() {
        return Width;
    }

    @Override
    public double floorCost() {
       return Length*Width*floor.getCost();
    }

    @Override
    public double paintCost() {
        return (2*Length*Height)+(2*Width*Height)*paint.getCost();
    }
}
