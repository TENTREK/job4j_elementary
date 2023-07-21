package ru.job4j.calculator;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

class FitTest {

    @Test
    void whenMan180Then69() {
        short in = 180;
        double expected = 69;
        double out = Fit.manWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.9));
    }

    @Test
    void whenWoman170Then52() {
        short in = 170;
        double expected = 52;
        double out = Fit.womanWeight(in);
        assertThat(out).isEqualTo(expected, withPrecision(0.9));
    }
}