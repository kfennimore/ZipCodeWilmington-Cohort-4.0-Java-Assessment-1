package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class RockPaperSissorsEvaluator {
    protected static final String ROCK = "rock";
    protected static final String PAPER = "paper";
    protected static final String SCISSOR = "scissor";

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective winning move
     */
    public String getWinningMove(String handSign) {
        String returnValue;
        switch (handSign) {
            case "rock":
                returnValue = "paper";
                break;
            case "paper":
                returnValue = "scissor";
                break;
            case "scissor":
                returnValue = "rock";
                break;
            default:
                returnValue = "N/A";
        }
        return returnValue;
    }

    /**
     * @param handSign a string representative of a hand sign
     * @return the respective losing move
     */
    public String getLosingMove(String handSign) {
        String returnValue;
        switch (handSign) {
            case "rock":
                returnValue = "scissor";
                break;
            case "paper":
                returnValue = "rock";
                break;
            case "scissor":
                returnValue = "paper";
                break;
            default:
                returnValue = "N/A";
        }
        return returnValue;
    }

    /**
     * @param handSignOfPlayer1 a string representative of a hand sign of a player
     * @param handSignOfPlayer2 a string representative of a hand sign of a challenger
     * @return a string representative of the winning hand sign between the two players
     */
    public String getWinner(String handSignOfPlayer1, String handSignOfPlayer2) {
        String returnVal;
        if (handSignOfPlayer1.equalsIgnoreCase("Rock") &&
                handSignOfPlayer2.equalsIgnoreCase("Scissor")) {
            returnVal = "rock";
        } else if (handSignOfPlayer1.equalsIgnoreCase("Rock") &&
                handSignOfPlayer2.equalsIgnoreCase("Paper")) {
            returnVal = "paper";
        } else if (handSignOfPlayer1.equalsIgnoreCase("Paper") &&
                handSignOfPlayer2.equalsIgnoreCase("Scissor")) {
            returnVal = "scissor";
        } else
        returnVal = "none";

        return returnVal;
    }
}
