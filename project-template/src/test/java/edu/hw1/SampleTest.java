package edu.hw1;

import org.junit.jupiter.api.Assertions;
import static org.junit.jupiter.api.Assertions.*;

class SampleTest {

    @org.junit.jupiter.api.Test
    void Task1() {
        int expected = 60;
        int actual = Main.minutesToSeconds("01:00");
        Assertions.assertEquals(expected, actual);
        int expected2 = 836;
        int actual2 = Main.minutesToSeconds("13:56");
        Assertions.assertEquals(expected2, actual2);
        int expected3 = -1;
        int actual3 = Main.minutesToSeconds("10:60");
        Assertions.assertEquals(expected3, actual3);

    }

    @org.junit.jupiter.api.Test
    void Task2() {
        int expected = 4;
        int actual = Main.countDigits(4666);
        Assertions.assertEquals(expected, actual);
        int expected2 = 3;
        int actual2 = Main.countDigits(544);
        Assertions.assertEquals(expected2, actual2);
        int expected3 = 1;
        int actual3 = Main.countDigits(0);
        Assertions.assertEquals(expected3, actual3);

    }

    @org.junit.jupiter.api.Test
    void Task3() {
        int[] a = {1, 2, 3, 4};
        int[] b = {0, 6};
        int[] a2 = {3, 1};
        int[] b2 = {4, 0};
        int[] a3 = {9, 9, 8};
        int[] b3 = {8, 9};
        int[] a4 = {1, 2, 3, 4};
        int[] b4 = {2, 3};
        /*isNestable([3, 1], [4, 0]) -> true
isNestable([9, 9, 8], [8, 9]) -> false
isNestable([1, 2, 3, 4], [2, 3]) -> false */

        Assertions.assertTrue(Main.isNestable(a, b));
        Assertions.assertTrue(Main.isNestable(a2, b2));
        Assertions.assertFalse(Main.isNestable(a3, b3));
        Assertions.assertFalse(Main.isNestable(a4, b4));

    }

    @org.junit.jupiter.api.Test
    void Task4() {
        var expected = "abcde";
        var actual = Main.fixString("badce");
        Assertions.assertEquals(expected, actual);
        var expected2 = "214365";
        var actual2 = Main.fixString("123456");
        Assertions.assertEquals(expected2, actual2);
        var expected3 = "This is a mixed up string.";
        var actual3 = Main.fixString("hTsii  s aimex dpus rtni.g");
        Assertions.assertEquals(expected3, actual3);
    }

    @org.junit.jupiter.api.Test
    void Task5() {
        Assertions.assertTrue(Main.isPalindromeDescendant(11211230));
        Assertions.assertTrue(Main.isPalindromeDescendant(13001120));
        Assertions.assertTrue(Main.isPalindromeDescendant(23336014));
    }

    @org.junit.jupiter.api.Test
    void Task6() {
        int expected = 5;
        int actual = Main.countK(6621);
        Assertions.assertEquals(expected, actual);
        int expected2 = 4;
        int actual2 = Main.countK(6554);
        Assertions.assertEquals(expected2, actual2);
        int expected3 = 3;
        int actual3 = Main.countK(1234);
        Assertions.assertEquals(expected3, actual3);

    }

    @org.junit.jupiter.api.Test
    void Task7() {
        int exptected = 1;
        int exptected2 = 6;
        int exptected3 = 4;
        int actual = Main.rotateLeft(16, 1);
        int actual2 = Main.rotateLeft(17, 2);
        int actual3 = Main.rotateRight(8, 1);
        Assertions.assertEquals(exptected, actual);
        Assertions.assertEquals(exptected2, actual2);
        Assertions.assertEquals(exptected3, actual3);
    }

    @org.junit.jupiter.api.Test
    void Task8() {
        int[][] chess = {
            {0, 0, 0, 1, 0, 0, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 1, 0, 1, 0},
            {0, 1, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 0, 0, 0},
            {0, 1, 0, 0, 0, 0, 0, 1},
            {0, 0, 0, 0, 1, 0, 0, 0}};
        int[][] chess2 = {
            {1, 0, 1, 0, 1, 0, 1, 0},
            {0, 1, 0, 1, 0, 1, 0, 1},
            {0, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 1, 0, 0, 1, 0, 1},
            {1, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 0, 0, 1, 0, 1},
            {1, 0, 0, 0, 1, 0, 1, 0},
            {0, 0, 0, 1, 0, 1, 0, 1}
        };
        int[][] chess3 = {
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 1, 0, 0, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0},
            {0, 0, 0, 0, 1, 0, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {0, 0, 0, 0, 0, 1, 0, 0},
            {1, 0, 0, 0, 0, 0, 0, 0}
        };
        Assertions.assertTrue(Main.knightBoardCapture(chess));
        Assertions.assertFalse(Main.knightBoardCapture(chess2));
        Assertions.assertFalse(Main.knightBoardCapture(chess3));
    }

    @org.junit.jupiter.api.Test
    void main() {
    }
}
