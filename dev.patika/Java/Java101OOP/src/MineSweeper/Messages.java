package MineSweeper;

public class Messages {
    static String fieldLength = "Type length of the mine field: ";
    static String fieldWidth = "Type width of the mine field: ";
    static String guess = "Type your guess coordinates;";
    static String row = "Type => Row: ";
    static String column = "Type => Column: ";
    static String errorRowOrColumn = "You typed wrong column or row number. Try again!";
    static String gameOverFailed = "Oh, No! You stepped on a mine!! My condolences.";
    static String gameOverSuccess = "Yes. Congratulations! You passed the mine field!";

    @Override
    public String toString() {
        return "Messages{}";
    }
}
