package edu.hw2.Task1;

public sealed interface Expr {
    double evaluate();

    public record Constant(double number) implements Expr {
        @Override
        public double evaluate() {
            return number;
        }
    }

    public record Negate(Expr c) implements Expr {

        @Override
        public double evaluate() {
            return -c.evaluate();
        }
    }

    public record Exponent(Expr a, double power) implements Expr {
        @Override
        public double evaluate() {

            return Math.pow(a.evaluate(), power);
        }
    }

    public record Addition(Expr a, Expr b) implements Expr {
        @Override
        public double evaluate() {
            return a.evaluate() + b.evaluate();
        }
    }

    public record Multiplication(Expr a, Expr b) implements Expr {
        @Override
        public double evaluate() {
            return a.evaluate() * b.evaluate();
        }
    }
}
