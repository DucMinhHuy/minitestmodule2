package salary;

public class FullTimeStaff extends Staff {
    private double bonus;
    private double fine;
    private double hardSalary;
    public FullTimeStaff(){}
    public FullTimeStaff(int staffCode, String fullName, int age, int phoneNumber, String gmail) {
        super(staffCode, fullName, age, phoneNumber, gmail);
    }

    @Override
    public double getSalary() {
        return hardSalary+(bonus-fine);
    }

    public FullTimeStaff(int staffCode, String fullName, int age, int phoneNumber, String gmail, double bonus, double fine, double hardSalary) {
        super(staffCode, fullName, age, phoneNumber, gmail);
        this.bonus = bonus;
        this.fine = fine;
        this.hardSalary = hardSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getFine() {
        return fine;
    }

    public void setFine(double fine) {
        this.fine = fine;
    }

    public double getHardSalary() {
        return hardSalary;
    }

    public void setHardSalary(double hardSalary) {
        this.hardSalary = hardSalary;
    }

    @Override
    public int compareTo(Staff o) {
       int a= (int) (this.getSalary()-o.getSalary());
        return a;
    }

//    @Override
//    public double getFullTime() {
//        return hardSalary+(bonus-fine);
//    }

}
