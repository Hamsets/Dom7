public class Car extends Vehicle implements Costable{

   private int doorsCount;
   private int price = 6500;

    public Car(int wheelCount, int doorsCount) {
        super(wheelCount);
        this.doorsCount = doorsCount;
    }

    @Override
    public int getCost() {
        return this.price;
    }

    @Override
    protected void printInfo() {
        System.out.printf("Транспортное средство: Машина. Количество дверей: %s. Количество колес: %s. Цена: %s руб.", this.doorsCount, this.wheelCount, getCost());
        System.out.println();
    }
}
