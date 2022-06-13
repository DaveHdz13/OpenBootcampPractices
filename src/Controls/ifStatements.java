package Controls;

public class ifStatements {
    public static void main(String[] args) {
        // If statement
        ifNumber(-30);
    }

    // If statement
    public static void ifNumber(int number) {
        // Number has 3 cases: negative, zero and positive
        if (number > 0) {
            System.out.println("Its a positive number");
        }
        else if (number == 0) {
            System.out.println("Number is equal to 0");
        }
        else {
            System.out.println("Its a negative number");
        }
    }
}
