import java.util.Scanner;
public class Avg {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter bouns");
        double bouns = sc.nextDouble();
        System.out.println("enter fine");
        double fine = sc.nextDouble();
        System.out.println("enter bouns1");
        double bouns1 = sc.nextDouble();
        System.out.println("enter fineq");
        double fine1 = sc.nextDouble();
        System.out.println("enter bouns2");
        double bouns2 = sc.nextDouble();
        System.out.println("enter fine2");
        double fine2 = sc.nextDouble();
        System.out.println("enter Hourly");
        double Hourly = sc.nextDouble();
        System.out.println("enter worktime");
        double workTime = sc.nextDouble();

        Staff staff = new FullTimeStaff(1233, "Duc minh huy", 23, 971365312, "ducminhhuy99tbvn@gmail.com", bouns, fine, 250000);
        Staff staff1 = new FullTimeStaff(123, "pham xuan han", 26, 932553, "phanxuanhan.com", bouns1, fine1, 200.000);
        Staff staff2 = new FullTimeStaff(234, "nguyen duy phong", 23, 34544, "ndp.com", bouns2, fine2, 100.000);
        Staff staff3 = new FartTime(234, "conga", 32, 45567, "sff.com", Hourly, workTime);
        Staff staff4 = new FartTime(567, "concho", 24, 456782, "gdfd.com", Hourly, workTime);
        Staff[] listStaff = {staff, staff2, staff1, staff3, staff4};
//        double StaffSalary = 0;
        double sum = 0;
//        double count = 0;
//        for (int i = 0; i < listStaff.length; i++) {
//            if (listStaff[i] instanceof FullTimeStaff) {
//                FullTimeStaff p = (FullTimeStaff) listStaff[i];
//                StaffSalary = p.getFullTime();
//                count++;
//                for (Staff huy:listStaff) {
//                    sum+=count;
//                }
//            }
//        }
//        for (int i = 0; i < listStaff.length; i++) {
//            if (listStaff[i] instanceof FartTime) {
//                FartTime p = (FartTime) listStaff[i];
//                StaffSalary = p.getFartTime();
//                count++;
//                for (Staff huy:listStaff) {
//                    sum+=p.getFartTime();
//                }
//            }
//        }
//        System.out.println(count);
        for (Staff huy : listStaff) {
            sum += huy.getSalary();
        }
        System.out.println(sum);
        double avg = 0;
        avg = sum / listStaff.length;
        System.out.println(avg);
//        if(avg> staff.getSalary()) {
//            System.out.println(staff.getSalary());
//        }
        double count = 0;
        for (int i = 0; i < listStaff.length; i++) {
            if (listStaff[i] instanceof FullTimeStaff) {
                FullTimeStaff p = (FullTimeStaff) listStaff[i];
                double salary = p.getSalary();
                if (salary < avg) {
                    count++;
                    System.out.println(" nhân viên fulltime lương thấp hơn lương trung bình thứ " + count + " là: " + p.getFullName());
                }
            }
        }
        for (int i = 0; i < listStaff.length; i++) {
            if (listStaff[i] instanceof FartTime) {
                FartTime p = (FartTime) listStaff[i];
                double salary = p.getSalary();
                System.out.println("tra cho staff fasttime:"+salary);
            }
        }
        java.util.Arrays.sort(listStaff);
        for (Staff huy:listStaff) {
            System.out.println(huy.getFullName()+":"+huy.getSalary());
        }
    }
}
