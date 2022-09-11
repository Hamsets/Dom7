public class Motorcycle extends Vehicle{
    private int maxSpeed;
    public Motorcycle(int wheelCount, int maxSpeed) {
        super(wheelCount);
        this.maxSpeed = maxSpeed;
    }

    @Override
    protected void printInfo() {
        System.out.printf("Транспортное средство: Мотоцикл. Количество колес: %s. Максимальная скорость: %s. \n", this.wheelCount, this.maxSpeed);

    }
}
