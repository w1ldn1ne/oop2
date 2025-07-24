public class ServiceStation {
    public void check(Vehicle vehicle) {
        if (vehicle == null) {
            System.out.println("Транспорт не указан");
            return;
        }

        System.out.println();
        System.out.println("Обслуживаем " + vehicle.getModelName());

        if (vehicle instanceof Bicycle || vehicle instanceof Car || vehicle instanceof Truck) {
            vehicle.updateTyre();
        }

        if (vehicle instanceof EngineVehicle) {
            ((EngineVehicle) vehicle).checkEngine();
        }

        if (vehicle instanceof TrailerVehicle) {
            ((TrailerVehicle) vehicle).checkTrailer();
        }
    }
}