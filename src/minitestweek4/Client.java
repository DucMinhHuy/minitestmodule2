package minitestweek4;

public class Client {
    private String fullName;
    private int apartmentNumber;
    private int materCode;
    private double electricityFirst;
    private double usedElectricity;

    public Client(String fullName, int apartmentNumber, int materCode, double electricityFirst, double usedElectricity) {
        this.fullName = fullName;
        this.apartmentNumber = apartmentNumber;
        this.materCode = materCode;
        this.electricityFirst = electricityFirst;
        this.usedElectricity = usedElectricity;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getApartmentNumber() {
        return apartmentNumber;
    }

    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }

    public int getMaterCode() {
        return materCode;
    }

    public void setMaterCode(int materCode) {
        this.materCode = materCode;
    }

    public double getElectricityFirst() {
        return electricityFirst;
    }

    public void setElectricityFirst(double electricityFirst) {
        this.electricityFirst = electricityFirst;
    }

    public double getUsedElectricity() {
        return usedElectricity;
    }

    public void setUsedElectricity(double usedElectricity) {
        this.usedElectricity = usedElectricity;
    }

    @Override
    public String toString() {
        return "Client{" +
                "fullName='" + fullName + '\'' +
                ", apartmentNumber=" + apartmentNumber +
                ", materCode=" + materCode +
                ", electricityFirst=" + electricityFirst +
                ", usedElectricity=" + usedElectricity +
                '}';
    }
}
