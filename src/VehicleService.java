public class VehicleService {
    public void updateTyre(String modelName, int wheelsCount) {
        if (wheelsCount == 1) {
            System.out.println("Меняем " + wheelsCount + " покрышку у " + modelName);
        } else if (wheelsCount <= 0) {
            System.out.println("Значение количества покрышек некорректное");
        } else if (wheelsCount < 5) {
            System.out.println("Меняем " + wheelsCount + " покрышки у " + modelName);
        } else {
            System.out.println("Меняем " + wheelsCount + " покрышек у " + modelName);
        }
    }

    public void checkEngine(String modelName) {
        System.out.println("Проверяем двигатель у " + modelName);
    }

    public void checkTrailer(String modelName) {
        System.out.println("Проверяем прицеп у " + modelName);
    }
}