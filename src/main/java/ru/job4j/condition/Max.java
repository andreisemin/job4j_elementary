package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        return (left >= right) ? left : right;
    }

    public static int max(int left, int right, int up) {
        return max(max(left, right), up);
    }

    public static int max(int left, int right, int up, int down) {
        return max(max(left, right), up, down);
    }

    public static void main(String[] args) {
        int left = 20;
        int right = 10;
        int up = 15;
        int down = 30;
        int result = max(left, right);
        System.out.println("Максимальное число из 2: " + result);
        int result2 = max(left, right, up);
        System.out.println("Максимальное число из 3: " + result2);
        int result3 = max(left, right, up, down);
        System.out.println("Максимальное число из 4: " + result3);
    }
}

