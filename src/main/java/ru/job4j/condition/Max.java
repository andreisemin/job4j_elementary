package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return (left >= right) ? left : right;
    }

    public static void main(String[] args) {
        int left = 20;
        int right = 10;
        int result = max(left, right);
        System.out.println("Максимальное число: " + result);
    }
}
