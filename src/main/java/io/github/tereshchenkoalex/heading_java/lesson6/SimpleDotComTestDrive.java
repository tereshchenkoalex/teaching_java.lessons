package io.github.tereshchenkoalex.heading_java.lesson6;

public class SimpleDotComTestDrive {
    public static void main (String[] args) {
        DotCom dot = new DotCom();
        int[] locations = {2, 3, 4};
        String userGuess = "2";
        String result = dot.checkYourself(userGuess);
    }
}
