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

    public static float rubleToTenge(float value) {
        float rsl = (float) (value / 0.21);
        return rsl;
    }

    public static float rubleToBelarusianRuble(float value) {
        float rsl = value / 30;
        return rsl;
    }

    public static float rubleToLira(float value) {
        float rsl = (float) (value / 3.48);
        return rsl;
    }

    public static float rubleToYuan(float value) {
        float rsl = value / 13;
        return rsl;
    }

    public static float rubleToZloty(float value) {
        float rsl = value / 23;
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
        float tenge = Converter.rubleToTenge(140);
        System.out.println("140 rubles are " + tenge + " tenge.");
        float belarusianruble = Converter.rubleToBelarusianRuble(140);
        System.out.println("140 rubles are " + belarusianruble + " belarusianruble.");
        float lira = Converter.rubleToLira(140);
        System.out.println("140 rubles are " + lira + " lira.");
        float yuan = Converter.rubleToYuan(140);
        System.out.println("140 rubles are " + yuan + " yuan.");
        float zloty = Converter.rubleToZloty(140);
        System.out.println("140 rubles are " + zloty + " zloty.");
    }
}
