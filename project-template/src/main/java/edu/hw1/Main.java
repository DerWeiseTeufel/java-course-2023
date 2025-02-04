package edu.hw1;

// Use this editor to write, compile and run your Java code online

import java.util.Arrays;
import java.util.logging.Logger;

class Main {
    public static int minutesToSeconds(String time) {
        var input = time.split(":");

        boolean err = input.length != 2;
        if (err) {
            return -1;
        }

        int secs = 0;
        try {
            secs = Integer.parseInt(input[1]);

        } catch (NumberFormatException e) {
            err = true;
        }
        if (secs > 59 || secs < 0) {
            err = true;
        }
        int mins = 0;
        try {
            mins = Integer.parseInt(input[0]);
        } catch (NumberFormatException e) {
            err = true;// wrong input
        }
        if (err) {
            return -1;
        }
        return mins * 60 + secs;

        //return n;
    }

    public static int countDigits(int n) {
        String str = String.valueOf(n);
        return str.length();
    }

    public static boolean isNestable(int[] a, int[] b) {
        int n = a.length;
        int m = b.length;
        int minA = a[0];
        int minB = b[0];
        int maxA = a[0];
        int maxB = b[0];

        for (int i = 0; i < n; ++i) {
            if (a[i] < minA) {
                minA = a[i];
            }
            if (a[i] > maxA) {
                maxA = a[i];
            }
        }
        for (int i = 0; i < m; ++i) {
            if (b[i] < minB) {
                minB = b[i];
            }
            if (b[i] > maxB) {
                maxB = b[i];
            }
        }
        return maxA < maxB && minA > minB;

    }

    public static String fixString(String str) {
        int n = str.length();

        char[] newstr = new char[n];
        if (n % 2 == 1) {

            n--;
            newstr[n] = str.charAt(n);
        }
        for (int i = 0; i < n; i += 2) {
            newstr[i] = str.charAt(i + 1);
            newstr[i + 1] = str.charAt(i);
        }
        return new String(newstr);
    }

    public static Boolean isPalindromeDescendant(int num) {
        String s = String.valueOf(num);
        int n = s.length();
        if (n < 2) {
            return false;
        }
        boolean isPal = true;
        int newnum = 0;
        int[] power = {1, 10, 100, 1000, 10000};
        for (int i = 0; i < n; i += 2) {
            //System.out.println(i/2 - 1);
            newnum += (s.charAt(i) - '0' + s.charAt(i + 1) - '0') * power[(n - i) / 2 - 1];
        }
        for (int i = 0; i < n / 2; i++) {
            if (s.charAt(i) != s.charAt(n - i - 1)) {
                isPal = false;
                break;
            }
        }
        //System.out.println(newnum);
        return isPal || isPalindromeDescendant(newnum);
    }

    public static void helloWorld() {
        java.util.logging.Logger logger
            = Logger.getLogger(
            Main.class.getName());

        // Call info method
        logger.info("Привет, Мир!");
    }

    public static int countK(int n) {
        int kapnum = 6174;
        if (n == kapnum) {
            return 0;
        }

        var a = new int[4];
        int[] power = {1, 10, 100, 1000};
        for (int i = 0; i < 4; ++i) {
            a[i] = n / power[i] % 10;
        }
        if (a[0] == a[1] && a[1] == a[2] && a[2] == a[3]) {
            return -1;
        }
        Arrays.sort(a);

        int newnum = 0;
        for (int i = 0; i < 4; ++i) {
            newnum += (a[i] - a[3 - i]) * power[i];
        }
        //System.out.println(newnum);
        //return 0;
        return countK(newnum) + 1;

    }

    public static int rotateLeft(int n, int shift) {
        int len = 0;
        int x = n;
        while (x > 0) {
            x /= 2;
            len++;
        }
        var power = new int[len + 1];
        power[0] = 1;
        for (int i = 1; i < len + 1; ++i) {
            power[i] = power[i - 1] * 2;
        }
        while (shift > 0) {
            boolean flag = false;
            n *= 2;
            if (n > power[len] - 1) {
                flag = true;
            }

            if (flag) {
                n -= power[len];
                n += 1;
                //System.out.println(n);
            }

            shift--;

        }
        return n;
    }

    public static int rotateRight(int n, int shift) {
        int len = 0;
        int x = n;
        while (x > 0) {
            x /= 2;
            len++;
        }
        var power = new int[len + 1];
        power[0] = 1;
        for (int i = 1; i < len + 1; ++i) {
            power[i] = power[i - 1] * 2;
        }
        while (shift > 0) {
            boolean flag = false;
            if (n % 2 == 1) {
                flag = true;
            }
            n /= 2;
            if (flag) {
                n += power[len - 1];
                //System.out.println(n);
            } else {
                len--;
            }
            shift--;

        }
        return n;
    }

    public static Boolean knightBoardCapture(int[][] field) {
        int n = 8;
        int[][] zuge = {{-2, -1}, {-2, 1}, {-1, -2}, {-1, 2}, {1, -2}, {1, 2}, {2, -1}, {2, 1}};
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; j++) {
                if (field[i][j] == 1) {
                    for (int[] zug : zuge) {
                        int row = i + zug[0];
                        int col = j + zug[1];

                        if ((row >= 0 && row < n && col >= 0 && col < n) && field[row][col] == 1) {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(minutesToSeconds("324:12"));
        int[] a = {1, 2, 3, 4};
        int[] b = {2, 3};
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
        System.out.println(isNestable(a, b));
        System.out.println(fixString("badce"));
        System.out.println(fixString("123456"));
        System.out.println(fixString("hTsii  s aimex dpus rtni.g"));
        System.out.println(countK(6621));
        System.out.println(countK(6554));
        System.out.println(countK(1234));
        System.out.println(rotateLeft(16, 1));
        System.out.println(rotateRight(15, 2));
        System.out.println(rotateRight(15, 2));
        System.out.println(knightBoardCapture(chess));
        System.out.println(knightBoardCapture(chess2));
        System.out.println(knightBoardCapture(chess3));
        System.out.println(isPalindromeDescendant(11211230));//isPalindromeDescendant(13001120)
        System.out.println(isPalindromeDescendant(13001120));
        System.out.println(isPalindromeDescendant(23336014));
        helloWorld();
        System.out.println(countK(2222));
    }
}
