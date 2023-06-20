public class Car extends Vehicle {
    public Car(String brand, int kms) {
        super(brand, kms);
    }

    @Override
    public String doStuff() {
        return "I am " + this.getBrand() + " and i go brrr";
    }
}
