package ru.job4j.converter;

public class Converter {

    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static float rubleToFranc(float value) {
        float rsl = value / 104;
        return rsl;
    }

    public static float rubleToPoundSterling(float value) {
        float rsl = value / 117;
        return rsl;
    }

    public static float rubleToYen(float value) {
        float rsl = (float) (value / 0.7);
        return rsl;
    }

    public static float rubleToHryvnia(float value) {
        float rsl = (float) (value / 2.5);
        return rsl;
    }

    public static void main(String[] args) {
        float dollar = Converter.rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float franc = Converter.rubleToFranc(140);
        System.out.println("140 rubles are " + franc + " franc.");
        float poundsterling = Converter.rubleToPoundSterling(140);
        System.out.println("140 rubles are " + poundsterling + " poundsterling.");
        float yen = Converter.rubleToYen(140);
        System.out.println("140 rubles are " + yen + " yen.");
        float hryvnia = Converter.rubleToHryvnia(140);
        System.out.println("140 rubles are " + hryvnia + " hryvnia.");

        float in = 140;
        float expected1 = 2.3333333F;
        float out1 = Converter.rubleToDollar(in);
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2.3333333. Test result : " + passed1);
        float expected2 = 2;
        float out2 = Converter.rubleToEuro(in);
        boolean passed2 = expected2 == out2;
        System.out.println("140 rubles are 2. Test result : " + passed2);
        float expected3 = 1.3461539F;
        float out3 = Converter.rubleToFranc(in);
        boolean passed3 = expected3 == out3;
        System.out.println("140 rubles are 1.3461539. Test result : " + passed3);
        float expected4 = 1.1965812F;
        float out4 = Converter.rubleToPoundSterling(in);
        boolean passed4 = expected4 == out4;
        System.out.println("140 rubles are 1.1965812. Test result : " + passed4);
        float expected5 = 200;
        float out5 = Converter.rubleToYen(in);
        boolean passed5 = expected5 == out5;
        System.out.println("140 rubles are 200. Test result : " + passed5);
        float expected6 = 56;
        float out6 = Converter.rubleToHryvnia(in);
        boolean passed6 = expected6 == out6;
        System.out.println("140 rubles are 56. Test result : " + passed6);
    }
}
