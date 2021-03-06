package evidence;

public class Car extends Vehicle {

    public static void main(String[] args) {
        Car car = new Car(120, 2000, "red", 2500);
        System.out.println("" + car.getSalePrice());
    }

    private final int weight;

    public Car(int speed, double regularPrice, String color, int weight) {
        super(speed, regularPrice, color);
        this.weight = weight;
    }

    @Override
    public double getSalePrice() {
        if (weight > 2000) {
            return super.getSalePrice() - (0.1 * super.getSalePrice());

        } else {
            return super.getSalePrice();
        }

    }

}
