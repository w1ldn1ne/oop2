public class Main {
    public static void main(String[] args) {
        Vehicle bicycle1 = new Bicycle("bicycle1", 2);
        Vehicle bicycle2 = new Car("bicycle2", 3);

        Vehicle car1 = new Car("car1", 4);
        Vehicle car2 = new Car("car2", 6);

        Vehicle truck1 = new Truck("truck1", 8);
        Vehicle truck2 = new Truck("truck2", 12);

        ServiceStation station = new ServiceStation();

        station.check(bicycle1);
        station.check(bicycle2);
        station.check(car1);
        station.check(car2);
        station.check(truck1);
        station.check(truck2);
    }
}