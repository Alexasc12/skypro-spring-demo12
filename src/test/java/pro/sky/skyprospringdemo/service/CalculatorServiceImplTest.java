package pro.sky.skyprospringdemo.service;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorServiceImplTest {
    CalculatorServiceImpl cs = new CalculatorServiceImpl();
    @Test
    void plus() {

        assertEquals(12,cs.plus(cs.getA(), cs.getB()));
        cs.setA(4);
        cs.setB(12);
        assertEquals(16,cs.plus(cs.getA(), cs.getB()));


    }

    @Test
    void minus() {
        Number actual = cs.minus(3,1);
        Assertions.assertThat(actual).isEqualTo(2);

        actual = cs.minus(9,4);
        Assertions.assertThat(actual).isEqualTo(5);

    }



    @Test
    void multiple() {
        Number actual = cs.multiple(7,7);
        Assertions.assertThat(actual).isEqualTo(49);

        actual = cs.multiple(8,4);
        Assertions.assertThat(actual).isEqualTo(32);
    }

    @Test
    void divideTest() {
        Number actual = cs.divide(45,9);
        Assertions.assertThat(actual).isEqualTo(5.0);

        actual = cs.divide(55,5);
        Assertions.assertThat(actual).isEqualTo(11.0);

        Assertions.assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(()-> cs.divide(3,0))
                .withMessage("Делить на ноль нельзя!");

    }




}