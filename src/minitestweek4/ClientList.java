package minitestweek4;

import java.util.ArrayList;

public class ClientList {
    private ArrayList<Client>list;
    public ClientList(ArrayList<Client>list){
        this.list=list;
    }
    public ClientList(){
        this.list=new ArrayList<Client>();
    }
    public void add(Client client){
        this.list.add(client);
    }
    public void inClient(){
        for (Client ClientList:list) {
            System.out.println(ClientList.toString());
        }
    }
}
