package ru.job4j.converter;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class ConverterTest {

    @Test
    void whenConvert140RubleThen2Euro() {
        float in = 140;
        float expected = 2;
        float out = Converter.rubleToEuro(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert140RubleThen2dot3333Dollar() {
        float in = 140;
        float expected = 2.3333F;
        float out = Converter.rubleToDollar(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvert140RubleThen1dot3461Franc() {
        float in = 140;
        float expected = 1.3461F;
        float out = Converter.rubleToFranc(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvertRubleThen1dot1965PoundSterling() {
        float in = 140;
        float expected = 1.1965F;
        float out = Converter.rubleToPoundSterling(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvertRubleThen200Yen() {
        float in = 140;
        float expected = 200;
        float out = Converter.rubleToYen(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }

    @Test
    void whenConvertRubleThen56Hryvnia() {
        float in = 140;
        float expected = 56;
        float out = Converter.rubleToHryvnia(in);
        float eps = 0.0001f;
        assertThat(out).isEqualTo(expected, withPrecision(eps));
    }
}