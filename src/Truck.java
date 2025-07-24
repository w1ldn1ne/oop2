public class Truck implements Vehicle, EngineVehicle, TrailerVehicle {

    private VehicleService service = new VehicleService();
    public String modelName;
    public int wheelsCount;

    public Truck(String modelName, int wheelsCount) {
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }


    @Override
    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    @Override
    public int getWheelsCount() {
        return wheelsCount;
    }

    public void setWheelsCount(int wheelsCount) {
        this.wheelsCount = wheelsCount;
    }


    @Override
    public void updateTyre() {
        service.updateTyre(modelName, wheelsCount);
    }

    @Override
    public void checkEngine() {
        service.checkEngine(modelName);
    }

    @Override
    public void checkTrailer() {
        service.checkTrailer(modelName);
    }
}