package ru.job4j.lambda;
import static org.junit.Assert.assertThat;
import static org.hamcrest.Matchers.is;
import junit.framework.TestCase;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;


public class DiapasonFTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        List<Double> result = DiapasonF.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result, is(expected));
    }

    @Test
    public void whensquareFunctionThenLinearResults() {
        List<Double> result = DiapasonF.diapason(5, 8, x ->x * x + 1);
        List<Double> expected = Arrays.asList(26D, 37D, 50D);
        assertThat(result, is(expected));
    }
    @Test
    public void whenpowerFunctionThenLinearResults() {
        List<Double> result = DiapasonF.diapasonp(5, 8,  x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(32.0, 64.0, 128.0);
        assertThat(result, is(expected));
    }
}