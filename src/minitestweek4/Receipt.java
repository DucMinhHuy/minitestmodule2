package minitestweek4;

public class Receipt implements Electricity{

    @Override
    public double sub(double electricityFirst, double usedElectricity) {
         double result=(usedElectricity-electricityFirst)*750;
        return result;
    }
}
