package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double x = x2 - x1;
        double y = y2 - y1;
        double pow = Math.pow(x, 2) + Math.pow(y, 2);
        double rsl = Math.sqrt(pow);
        return rsl;
    }

    public static void main(String[] args) {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double result = Point.distance(x1, y1, x2, y2);
        System.out.println("result (" + x1 + ", " + y1 + ") to (" + x2 + ", " + y2 + ") " + result);
    }
}
