package edu.hw2;

import edu.hw2.Task2.Figures;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

public class Test2 {



    @org.junit.jupiter.api.Test
    void Task2() {
        var rect = new Figures.Rectangle(20, 10);
        var exp = 200;
        Assertions.assertEquals(exp, rect.area());

    }

}