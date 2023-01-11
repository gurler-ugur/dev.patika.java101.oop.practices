package GuessNumberHotCold;

public class Messages {

    static String welcome = "*** Welcome to Hot/Cold Guess Number Game ***";
    static String explanation = "You must guess the number determined by the game with your guessing rights.\n" +
            "If you cannot guess the number correctly until your rights are gone,\n" +
            "you will lose the game.\n" +
            "As you get closer to the number, the place gets HOT,\n" +
            "as you get farther, the place gets COLD. \n";
    static String totalGuessRights = "!!! Your guess rights => ";
    static String guessMessage = "Let's guess the luck number: ";
    static String success = "Yeah! Finally, you got the right number. Congratulations!!";
    static String failed = "What a bad luck. You lost. Don't worry, try again!";
    static String guessLeft = " guesses left! Be careful!";
    static String hot = "It is hot. You're closer to the lucky number!";
    static String veryHot = "It is very hot. You're so close to the lucky number!";
    static String burning = "This place is on fire! The lucky number is right here somewhere!";
    static String cold = "It is cold. You're far from the lucky number!";
    static String veryCold = "It is very cold. You're so far from the lucky number!";
    static String freezing = "This place is frozen! There are planets between you and the lucky number!";

    static void printMessage(String message) {
        System.out.println(message);
    }

    @Override
    public String toString() {
        return "Messages{}";
    }
}
