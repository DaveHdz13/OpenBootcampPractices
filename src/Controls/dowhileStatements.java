package Controls;

public class dowhileStatements {
    public static void main(String[] args) {
        // While statement
        doNumber(1);
    }

    // Do While statement
    public static void doNumber(int number) {
        do {
            number++;
        } while(number < 3);

        // Shows the final number added to doNumber() until it equals 3
        System.out.println(number);
    }
}
