package info.androidhive.navigationdrawer.model;

public class Vehicle {

    private String vid;
    private String manufacture;
    private String type;
    private int engCapacity;
    private double price;

    public String getVid() {
        return vid;
    }

    public void setVid(String vid) {
        this.vid = vid;
    }

    public String getManufacture() {
        return manufacture;
    }

    public void setManufacture(String manufacture) {
        this.manufacture = manufacture;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getEngCapacity() {
        return engCapacity;
    }

    public void setEngCapacity(int engCapacity) {
        this.engCapacity = engCapacity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}