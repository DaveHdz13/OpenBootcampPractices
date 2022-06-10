package Numbers;

public class Car {
    public static void main(String[] args) {
        // Create an object myCar.
        Vehicle myCar = new Vehicle();
        // Each time we call our function it adds 1 door to our object.
        myCar.addDoors();
        myCar.addDoors();
        myCar.addDoors();
        myCar.addDoors();

        System.out.println(myCar.door_numbers);
    }
    // Create a class for car (vehicle).
    static class Vehicle {
        // This is a integer counter starting from 0.
        public int door_numbers = 0;
        // We made a function for addition.
        public void addDoors(){
            this.door_numbers++;
        }
    }
}
