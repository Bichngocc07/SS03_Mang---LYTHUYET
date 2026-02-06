
public abstract class Vehicle {
    protected String brand;

    public Vehicle(String brand) {
        this.brand = brand;
    }

    public abstract void move();

    public void showInfo() {
        System.out.print(brand + " - Cách di chuyển: ");
        move();
    }
}
