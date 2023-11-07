package org.example.task_4.item_3;

public class Shape {

    public int calculationArea(int a, int b) {
        return a * b;
    }

    public double calculationArea(int r){
        return Math.PI * r * r;
    }

    public double calculationArea(double a, double h) {
        return 0.5 * a * h;
    }

    public double calculationArea(double a, double b, double c) {
        double p = (a + b + c) / 2;
        return Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        System.out.println("Square rectangle - "+shape.calculationArea(10, 5));
        System.out.println("Square circle - "+shape.calculationArea(6));
        System.out.println("Square triangle - "+shape.calculationArea(5.0d, 5.0d));
        System.out.println("Square triangle (heron 's formula) - "+shape.calculationArea(3.d, 4.0d, 5.0d));
    }
}
