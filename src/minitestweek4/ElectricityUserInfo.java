package minitestweek4;

public abstract class ElectricityUserInfo {
    private String electricityUserInformation;
    public abstract void electricityUserInformation();

    public ElectricityUserInfo(String electricityUserInformation) {
        this.electricityUserInformation = electricityUserInformation;
    }

    public String getElectricityUserInformation() {
        return electricityUserInformation;
    }

    public void setElectricityUserInformation(String electricityUserInformation) {
        this.electricityUserInformation = electricityUserInformation;
    }
}
