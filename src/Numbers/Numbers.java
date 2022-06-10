package Numbers;

public class Numbers {
    public static void main(String[] args) {
        System.out.println("This is an excersise for the 3rd class");
        // We call the function and add our 3 numbers.
        add(40, 5, 20);
    }
    // Create a function with 3 numbers as parameters.
    public static void add(int a, int b, int c){
        int res;
        // We made the logic and save the output in a variable.
        res = a + b + c;
        // Print the variable.
        System.out.println(res);
    }
}
