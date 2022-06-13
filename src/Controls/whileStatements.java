package Controls;

public class whileStatements {
    public static void main(String[] args) {
        // While statement
        whileNumber(0);
    }

    // While statement
    public static void whileNumber(int number) {
        while (number < 3) {
            // Increment number until it equals 3.
            number++;
            System.out.println(number);
        }
    }
}
