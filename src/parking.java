public class parking {

    final Vehicle car;

    parking(Vehicle car) {
        this.car = car;
    }

    public void parkin(Garage garage) {
        if (!garage.getAdmin().parkCar(car)) {
            System.out.println("Car" + car.getCarID() + " Parked Failed, there is not available slot for your car");
        }

    }

    public void parkOut(Garage garage) {
        garage.getAdmin().parkOut(car);
    }

}
