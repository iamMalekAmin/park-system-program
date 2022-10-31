
import java.util.ArrayList;

public class Garage {

    private Admin admin;
    private final ArrayList<IDimensions> availSlots = new ArrayList<>();
    private final ArrayList<IDimensions> busySlots = new ArrayList<>();
    private int totalSlots;
    private int totalincome;

    Garage() {
        totalSlots = 0;
    }

    public ArrayList<IDimensions> getAvilableslots() {
        return availSlots;
    }

    public ArrayList<IDimensions> getBusySlots() {
        return busySlots;
    }

    public void AddAvilableslots(IDimensions slot) {
        availSlots.add(slot);
    }

    public void removeAvailableslot(IDimensions slot) {
        availSlots.remove(slot);
    }

    public void AddBusyslot(IDimensions slot) {
        busySlots.add(slot);
    }

    public void removeBusyslot(IDimensions slot) {
        busySlots.remove(slot);
    }

    public void setTotalslots(int total) {
        this.totalSlots = total;
    }

    public int getTotalslots() {
        return totalSlots;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void addtoTalincome(int t) {
        totalincome += t;
    }

    public int gettotalincome() {
        return totalincome;
    }
}
