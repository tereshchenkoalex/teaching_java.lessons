package io.github.tereshchenkoalex.heading_java.lesson6;

/*
public class SimpleDotComGame {
    public static void main (String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        DotCom theDotCom = new DotCom();

        int randomNum = (int) (Math.random() * 5);
        int[] locations = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(locations);
        boolean isAlive = true;

        while (isAlive ==true) {
            String guess = helper.getUserInput("enter a number");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("kill")) {
                isAlive = false;
                System.out.println("You took "+ numOfGuesses + " guesses");
            }
        }
    }
}
*/
