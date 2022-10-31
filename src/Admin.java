
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Admin {

    private String adminname;
    private int adminID;
    private Garage garage;

    public Admin(String adminname, int adminID, Garage garage) {
        this.adminname = adminname;
        this.adminID = adminID;
        this.garage = garage;
    }

    public void setAdminname(String name) {
        this.adminname = name;
    }

    public void setAdminID(int ID) {
        this.adminID = ID;
    }

    public String getAdminname() {
        return adminname;
    }

    public int getAdminID() {
        return adminID;
    }

    public void setGarage(Garage garage) {
        this.garage = garage;
    }

    public Garage getGarage() {
        return garage;
    }

    public void printSlots() {
        if (garage.getAvilableslots().isEmpty()) {
            System.out.println("There is no available slot");
            return;
        }
        for (int i = 0; i < garage.getAvilableslots().size(); i++) {
            System.out.println("Slot: " + garage.getAvilableslots().get(i).getSlotID() + ", Depth: "
                    + garage.getAvilableslots().get(i).getSlotdepth() + ", width: "
                    + garage.getAvilableslots().get(i).getSlotwidth());
        }
    }

    public int numberOfcars() {
        return garage.getBusySlots().size();

    }

    public boolean parkCar(Vehicle car) {
        if (garage.getTotalslots() != 0 && !garage.getAvilableslots().isEmpty()) {
            for (int i = 0; i < garage.getAvilableslots().size(); i++) {
                if (garage.getAvilableslots().get(i).getSlotwidth() >= car.getCarwidth()
                        && garage.getAvilableslots().get(i).getSlotdepth() >= car.getCardepth()) {
                    System.out.println("Car" + car.getCarID() + " Parked Successfully in slot: "
                            + garage.getAvilableslots().get(i).getSlotID());
                    Ticket ticket = new Ticket(garage.getAvilableslots().get(i).getSlotID());
                    car.setTicket(ticket);
                    garage.AddBusyslot(garage.getAvilableslots().get(i));
                    garage.removeAvailableslot(garage.getAvilableslots().get(i));
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    public void parkOut(Vehicle car) {
        if (car.getTicket() == null) {
            System.out.println("This car is not parking here!");
            return;
        }
        int slotId = car.getTicket().getSlotId();
        for (IDimensions slot : garage.getBusySlots()) {
            if (slot.getSlotID() == slotId) {
                garage.removeBusyslot(slot);
                garage.AddAvilableslots(slot);
                car.getTicket().setDeparttime(LocalTime.now());
                calculateFees(car);
            }
            return;
        }
        System.out.println("This car is not parking here!");
    }

    public void calculateFees(Vehicle car) {
        long elapsedTime = ChronoUnit.SECONDS.between(car.getTicket().getArrivetime(), car.getTicket().getDeparttime());
        System.out.println("Car" + car.getCarID() + " Parked Out Successfully from slot: " + car.getTicket().getSlotId()
                + "\nThe fees of parking is: " + elapsedTime * 5);
        addtoTotalincome((int) elapsedTime * 5);
    }

    public void addtoTotalincome(int price) {
        garage.addtoTalincome(price);
    }

    public void printTotalincome() {
        System.out.println("current total income for garage is: " + garage.gettotalincome());
    }
}
