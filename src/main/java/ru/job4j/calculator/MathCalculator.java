package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + multiply(first, second);
    }

    public static double sumMinusDel(double first, double second) {
        return minus(first, second)
                + del(first, second);
    }

    public static double sumAll(double first, double second) {
        return sumAndMultiply(first, second) + sumMinusDel(first, second);
    }

    public static void main(String[] args) {
        double first = 10;
        double second = 20;
        System.out.println("Результат расчета суммы сложения и умножения равен: " + sumAndMultiply(first, second));
        System.out.println("Результат расчета суммы вычитания и деления равен: " + sumMinusDel(first, second));
        System.out.println("Результат расчета суммы сложения, умножения,вычитания и деления равен: "
                + sumAll(first, second));
    }
}
