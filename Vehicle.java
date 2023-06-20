public abstract class Vehicle {
    private String brand;
    private int kms;

    public Vehicle(String brand, int kms) {
        this.brand = brand;
        this.kms = kms;
    }

    public abstract String doStuff();

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getKms() {
        return this.kms;
    }

    public void setKms(int kms) {
        this.kms = kms;
    }

}
