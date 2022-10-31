
import java.time.LocalTime;

public class Ticket {

    LocalTime arrivetime;
    LocalTime departtime;
    Vehicle car;
    int slotId;

    public Ticket(int slotId) {
        this.arrivetime = LocalTime.now();
        this.slotId = slotId;
    }

    public Ticket() {

    }

    public void setDeparttime(LocalTime departtime) {
        this.departtime = departtime;
    }

    public LocalTime getArrivetime() {
        return arrivetime;
    }

    public LocalTime getDeparttime() {
        return departtime;
    }

    public void setCar(Vehicle car) {
        this.car = car;
    }

    public Vehicle getCar() {
        return car;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public int getSlotId() {
        return slotId;
    }

}
