package edu.hw2;

import edu.hw2.Task1.Expr;
import org.junit.jupiter.api.Assertions;

public class Test1 {
    @org.junit.jupiter.api.Test
    void Task1() {
        var two = new Expr.Constant(2);
        var exp2 = 2.;
        var four = new Expr.Constant(4);

        var negOne = new Expr.Negate(new Expr.Constant(1));
        var exp_1 = -1.;
        var sumTwoFour = new Expr.Addition(two, four);
        var exp24 = 2+4;
        var mult = new Expr.Multiplication(sumTwoFour, negOne);
        var exp_24 = exp24 * -1;
        var exp = new Expr.Exponent(mult, 2);
        var exp_exp = Math.pow(exp_24,2);
        var res = new Expr.Addition(exp, new Expr.Constant(1));
        var exp_res = exp_exp + 1;
        Assertions.assertEquals(two.evaluate(), exp2);
        Assertions.assertEquals(negOne.evaluate(), exp_1);
        Assertions.assertEquals(sumTwoFour.evaluate(), exp24);
        Assertions.assertEquals(mult.evaluate(), exp_24);
        Assertions.assertEquals(exp.evaluate(), exp_exp);
        Assertions.assertEquals(res.evaluate(), exp_res);

    }

}
