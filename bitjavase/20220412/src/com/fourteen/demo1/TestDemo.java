package com.fourteen.demo1;

import java.util.Scanner;

/**
 * @Author:
 * @Description:
 * @Date: 2022/4/12 15:23
 */
class Shape {

    public void draw() {
        System.out.println("画图形！");
    }
}

class Cycle extends Shape {
    @Override
    public void draw() {
        System.out.println("⚪");
    }
}

class Rect extends Shape {
    @Override
    public void draw() {
        System.out.println("♦");
    }
}

class Flower extends Shape {
    @Override
    public void draw() {
        System.out.println("❀");
    }
}



public class TestDemo {
    Scanner sc = new Scanner(System.in);

    public static void drawShapes1() {
        Rect rect = new Rect();
        Cycle cycle = new Cycle();
        Flower flower = new Flower();
        String[] shapes = {"cycle", "rect", "cycle", "rect", "flower"};
        for (String shape : shapes) {
            if (shape.equals("cycle")) {
                cycle.draw();
            } else if (shape.equals("rect")) {
                rect.draw();
            } else if (shape.equals("flower")) {
                flower.draw();
            }
        }
    }

    public static void drawShapes() {
        Rect rect = new Rect();
        Cycle cycle = new Cycle();
        Flower flower = new Flower();

        Shape[] shapes = new Shape[] {cycle,rect,cycle,rect,flower};

        for (Shape shape : shapes) {
            shape.draw();
        }

    }

    public static void drawMap(Shape shape) {
        shape.draw();
    }

    public static void main(String[] args) {
        drawShapes();
    }

    public static void main2(String[] args) {
        Cycle cycle = new Cycle();
        Rect rect = new Rect();

        drawMap(cycle);
        drawMap(rect);
        drawMap(new Flower());

    }

    public static void main1(String[] args) {
        Shape shape = new Cycle();
        shape.draw();
    }
}
