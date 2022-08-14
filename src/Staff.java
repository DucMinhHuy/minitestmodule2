public abstract class Staff implements Comparable<Staff> {
    private int staffCode;
    private String fullName;
    private int age;
    private int phoneNumber;
    private String Gmail;
    public Staff(){

    }

    public Staff(int staffCode, String fullName, int age, int phoneNumber, String gmail) {
        this.staffCode = staffCode;
        this.fullName = fullName;
        this.age = age;
        this.phoneNumber = phoneNumber;
        Gmail = gmail;
    }

    public int getStaffCode() {
        return staffCode;
    }

    public void setStaffCode(int staffCode) {
        this.staffCode = staffCode;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(int phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getGmail() {
        return Gmail;
    }

    public void setGmail(String gmail) {
        Gmail = gmail;
    }
public abstract double getSalary();
}
