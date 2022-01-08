package Classwork21;

public class InternetMarket {
    private double shipPrice;
    private double shipSpeed;
    private double tax;
    private String name;
    private double shipRsik;
    private double stars;

    public InternetMarket(double shipPrice, double shipSpeed, double tax,double shipRsik,String name) {
        this.shipPrice = shipPrice;
        this.shipSpeed = shipSpeed;
        this.tax = tax;
        this.name = name;
        this.shipRsik  = shipRsik;
        this.stars = 0;
    }

    public double getShipPrice() {
        return shipPrice;
    }

    public void setShipPrice(double shipPrice) {
        this.shipPrice = shipPrice;
    }

    public double getShipSpeed() {
        return shipSpeed;
    }

    public void setShipSpeed(double shipSpeed) {
        this.shipSpeed = shipSpeed;
    }

    public double getTax() {
        return tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getShipRsik() {
        return shipRsik;
    }

    public void setShipRsik(double shipRsik) {
        this.shipRsik = shipRsik;
    }

    public double getStars() {
        return stars;
    }

    public void setStars(double stars) {
        this.stars = stars;
    }

    public double countShipPrice(Product product){
        double shipSum = product.getWeight() * shipPrice;
        shipSum += product.getPrice() * tax;
        return shipSum;
    }
    public double getlooseRisk(Product product){
        if (product.getWeight() > 10000){
            return shipRsik;
        }
        return 0;
    }
}
