package minitestweek4;

import com.sun.org.apache.xerces.internal.impl.XMLStreamReaderImpl;
import org.openjsse.util.RSAKeyUtil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ClientList clientList=new ClientList();
        Receipt receipt=new Receipt();
        int choose=0;
        do{
            System.out.println("menu");
            System.out.println("1:nhap thong tin ho su dung");
            System.out.println("2:hien thi thong tin va hoa don");
//            System.out.println("3: tien dien phai tra");
            choose=sc.nextInt();
            switch (choose){
                case 1:
                    sc.nextLine();
                    // them thong tin chu ho
                    System.out.println("nhap full name");String fullName=sc.nextLine();
                    System.out.println("nhap apartmentNumber:");int apartmentNumber=sc.nextInt();
                    System.out.println("nhap materCode:");int materCode=sc.nextInt();
                    System.out.println("nhap electricityFirst:");double electricityFirst=sc.nextDouble();
                    System.out.println("nhap usedElectricity:");double usedElectricity=sc.nextDouble();
                    Client info=new Client(fullName,apartmentNumber,materCode,electricityFirst,usedElectricity);
                    clientList.add(info);
                    break;
                case 2:
                    // in ra
                    System.out.println("nhap electricityFirst:");double electricityFirst1=sc.nextDouble();
                    System.out.println("nhap usedElectricity:");double usedElectricity1=sc.nextDouble();
                    System.out.println("so tien phai tra :"+receipt.sub(electricityFirst1,usedElectricity1));
                    clientList.inClient();

                    break;
//                case 3:
//                    System.out.println("nhap electricityFirst:");double electricityFirst1=sc.nextDouble();
//                    System.out.println("nhap usedElectricity:");double usedElectricity1=sc.nextDouble();
//                    System.out.println("so tien phai tra :"+receipt.sub(electricityFirst1,usedElectricity1));


            }
        }while (choose!=0);
    }
}
