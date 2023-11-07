package edu.project1;

import org.jetbrains.annotations.NotNull;
import java.util.Locale;
import java.util.Scanner;

public class Main {
    /*
    interface Dictionary {
        @NotNull String randomWord();
    }

    class Session {
        private final String answer;
        private final char[] userAnswer;
        private final int maxAttempts;
        private int attempts;

        @NotNull GuessResult guess(char guess);

        @NotNull GuessResult giveUp();
    }

    sealed interface GuessResult {
        char[] state();

        int attempt();

        int maxAttempts();

        @NotNull String message();

        record Defeat(...) implements GuessResult {
            @Override
            public char[] state() {
                return new char[0];
            }

            @Override
            public int attempt() {
                return 0;
            }

            @Override
            public int maxAttempts() {
                return 0;
            }

            @Override
            public @NotNull String message() {
                return null;
            }
        }

        record Win(...) implements GuessResult {
            @Override
            public char[] state() {
                return new char[0];
            }

            @Override
            public int attempt() {
                return 0;
            }

            @Override
            public int maxAttempts() {
                return 0;
            }

            @Override
            public @NotNull String message() {
                return null;
            }
        }

        record SuccessfulGuess(...) implements GuessResult {
            @Override
            public char[] state() {
                return new char[0];
            }

            @Override
            public int attempt() {
                return 0;
            }

            @Override
            public int maxAttempts() {
                return 0;
            }

            @Override
            public @NotNull String message() {
                return null;
            }
        }

        record FailedGuess(...) implements GuessResult {
        }
    }

    class ConsoleHangman {
        public void run() {

            while (true){
                int max = printMenuGetAtt();

            }
        }

        private GuessResult tryGuess(Session session, String input) {
        }

        private void printState(GuessResult guess) {
        }
        private int printMenuGetAtt(){
            System.out.println("Hello, this is hangman, choose the difficulty level: easy, medium, hard");
            Scanner scan = new Scanner(System.in);
            String s = scan.next().toLowerCase(Locale.ROOT);
            String l1 = "easy", l2 = "medium", l3= "hard";
            int maxAtt = -1;
            if(s.equals(l1)){
                maxAtt = 10;
            } else if (s.equals(l2)) {
                maxAtt=7;
            }else {
                maxAtt = 5;
            }
            return maxAtt;

        }
    }

     */
}
