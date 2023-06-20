public class Boat extends Vehicle {
    public Boat(String brand, int kms) {
        super(brand, kms);
    }

    @Override
    public String doStuff() {
        return "I am " + this.getBrand() + " and i go bloups";
    }
}
