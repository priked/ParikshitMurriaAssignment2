package com.conestoga;

public class Rectangle {

    private int length;

    private int width;

    public Rectangle() {
        this.length = 1;
        this.width = 1;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getPerimeter() {
        return (2*(length + width));
    }

    public int getArea() {
        return length * width;
    }
}