
public class Vehicle {

    private String carname;
    private int carID;
    private int year;
    private int cardepth;
    private int carwidth;
    private Ticket ticket;

    public Vehicle(String carname, int carID, int year, int cardepth, int carwidth) {
        this.carname = carname;
        this.carID = carID;
        this.year = year;
        this.cardepth = cardepth;
        this.carwidth = carwidth;
    }

    public void setCarID(int ID) {
        this.carID = ID;
    }

    public void setYear(int y) {
        this.year = y;
    }

    public void setCardepth(int dep) {
        this.cardepth = dep;
    }

    public void setCarwidth(int wid) {
        this.carwidth = wid;
    }

    public void setCarname(String name) {
        this.carname = name;
    }

    public int getCarID() {
        return carID;
    }

    public String getcarname() {
        return carname;
    }

    public int getYear() {
        return year;
    }

    public int getCardepth() {
        return cardepth;
    }

    public int getCarwidth() {
        return carwidth;
    }

    public void setTicket(Ticket t) {
        this.ticket = t;
    }

    public Ticket getTicket() {
        return ticket;
    }

}
