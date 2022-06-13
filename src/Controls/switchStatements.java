package Controls;

public class switchStatements {
    public static void main(String[] args) {
        // Switch statement
        swNumber();
    }

    public static void swNumber() {
        // Choose a season
        String season = "Spring";

        // Spring its only pointing to 1 case to print
        switch (season) {
            case "Winter":
                System.out.println("Its Winter!");
                break;
            case "Spring":
                System.out.println("Its Spring!");
                break;
            default:
                System.out.println("Its nether Winter nor Spring. Its another Season!");
        }
    }
}
