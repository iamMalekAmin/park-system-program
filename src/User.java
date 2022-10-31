
public class User {

    private String nameuser;
    private int userID;
    final parking park;

    User(String name, int ID, parking park) {
        this.nameuser = name;
        this.userID = ID;
        this.park = park;
    }

    public void setID(int ID) {
        this.userID = ID;
    }

    public void setNameuser(String name) {
        this.nameuser = name;
    }

    public int getID() {
        return userID;
    }

    public String getNameuser() {
        return nameuser;
    }

}
