package minitestweek3;

import java.util.List;
import java.util.Scanner;
public class main {
    public static List<Hotel> hotelList= Managehotel.hotelList;
    public static void main(String[] args) {
        Managehotel mh = new Managehotel();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Application Manager Render");
            System.out.println("Enter 1: to add new render!");
            System.out.println("Enter 2: to display render!");
            System.out.println("Enter 3: To delete information render!");
            System.out.println("Enter 4: To cal price of Render!");
            System.out.println("Enter 5: To exit!");
            String line = sc.nextLine();
            switch (line) {
                case "1": {
                    mh.addRenderToList(hotelList);
                    break;
                }
                case "2": {
                    for (Hotel list : hotelList
                    ) {
                        System.out.println(list.toString());
                    }
                    break;
                }
                case "3": {
                    mh.deleteRender(hotelList);
                    break;
                }
                case "4": {
                    System.out.println(mh.payMoney());
                    break;
                }
                case "5": {
                    return;
                }
                default:
                    System.out.println("Invalid");
                    continue;
            }
        }
    }
}
