package Controls;

public class forStatements {
    public static void main(String[] args) {
        // For statement
        forNumber();
    }

    // For statement
    public static void forNumber() {
        // Declare number variable ; Prove that number is equal or less than 3 ; Add one each time
        for (int number = 0; number <= 3; number++) {
            System.out.println(number);
        }
    }
}
