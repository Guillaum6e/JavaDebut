public class Hangar {
    public static void main(String[] args) {
        Car car1 = new Car("peugeot", 1000);
        Boat boat1 = new Boat("Blackearl", 100000);

        System.out.println(car1.doStuff());
        System.out.println(boat1.doStuff());
    }
}
