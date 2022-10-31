
public class Dimensions implements IDimensions {

    private int slotwidth;
    private int slotdepth;
    private int slotID;

    public Dimensions(int slotwidth, int slotdepth, int slotID) {
        this.slotwidth = slotwidth;
        this.slotdepth = slotdepth;
        this.slotID = slotID;
    }

    @Override
    public void setSlotwidth(int width) {
        this.slotwidth = width;
    }

    @Override
    public void setSlotdepth(int depth) {
        this.slotwidth = depth;
    }

    @Override
    public void setSlotID(int ID) {
        this.slotID = ID;
    }

    @Override
    public int getSlotwidth() {
        return slotwidth;
    }

    @Override
    public int getSlotID() {
        return slotID;
    }

    @Override
    public int getSlotdepth() {
        return slotdepth;
    }

}
