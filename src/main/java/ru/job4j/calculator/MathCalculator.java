package ru.job4j.calculator;

import ru.job4j.math.MathFunction;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return MathFunction.sum(first, second)
                + MathFunction.multiply(first, second);
    }

    public static double differenceAndDivide(double first, double second) {
        return MathFunction.difference(first, second)
                + MathFunction.divide(first, second);
    }

    public static void main(String[] args) {
        double allsumm = sumAndMultiply(10, 20) + differenceAndDivide(10, 20);
        System.out.println("Результат расчета разности и деление двух чисел равен: " + sumAndMultiply(10, 20));
        System.out.println("Резельтат расчета суммы и умножения двух чисел: " + differenceAndDivide(10, 20));
        System.out.println("Результат расчета суммы предыдущих вычислений: " + allsumm);
    }
}
