public class FartTime extends Staff{
    private double Hourly=100;
    private double workTime;
    public FartTime(){}

    @Override
    public double getSalary() {
        return workTime*Hourly;
    }

    public FartTime(int staffCode, String fullName, int age, int phoneNumber, String gmail, double hourly, double workTime) {
        super(staffCode, fullName, age, phoneNumber, gmail);
        Hourly = hourly;
        this.workTime = workTime;
    }

    public double getHourly() {
        return Hourly;
    }

    public void setHourly(double hourly) {
        Hourly = hourly;
    }

    public double getWorkTime() {
        return workTime;
    }

    public void setWorkTime(double workTime) {
        this.workTime = workTime;
    }

    @Override
    public int compareTo(Staff o) {
        int b= (int)(this.getSalary()-o.getSalary());
        return b;
    }

//    @Override
//    public double getFartTime() {
//        return workTime*Hourly;
//    }
}
