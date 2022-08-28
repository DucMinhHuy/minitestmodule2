package minitestTDD;

import java.time.LocalDate;

public class Meat extends Material implements Discount {
    private double Weight;

    public Meat(double weight) {
        Weight = weight;
    }

    public Meat(int id, String name, LocalDate manufacturingDate, int cost, double weight) {
        super(id, name, manufacturingDate, cost);
        Weight = weight;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double weight) {
        Weight = weight;
    }

    @Override
    public double getAmount() {
        return getCost()*Weight;
    }

    @Override
    public int getExpiryDate() {
        int LocalDate=getManufacturingDate().getDayOfMonth();
        return LocalDate;
    }

    @Override
    public void add(int index ,Object data) {

    }

//    @Override
//    public void remote(int index) {
//    }

    @Override
    public void addFirst(Object data) {

    }

    @Override
    public double getRealMoney() {
        return 0;
    }
}
