package minitestTDD;

import java.time.LocalDate;

public class CrispyFlour extends Material implements Discount{
    private int quantity;
    private Node head;
    private int numNodes;
    private int index;
    private int size=0;
    public CrispyFlour(){
//        head=new Node(data);
    }
    private class Node{
        private Node next;
        private Object data;
        public Node(Object data) {
            this.data=data;
        }
        public Object getData(){
            return this.data;
        }
    }
    private boolean isElementIndex(int index){
        return index>=0&& index<size;
    }
    public CrispyFlour(int id, String name, LocalDate manufacturingDate, int cost, int quantity) {
        super(id, name, manufacturingDate, cost);
        this.quantity = quantity;
    }

    public CrispyFlour(int quantity) {
        super();
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public double getAmount() {
        return quantity*getCost();
    }

    @Override
    public int getExpiryDate() {
        int LocalDate = getManufacturingDate().getYear();
       return LocalDate;
    }

    @Override
    public void add(int index,Object data){
        Node temp=head;
        Node holder;
        for(int i=0;i<index&&temp.next!=null;i++){
            temp=temp.next;
        }
        holder=temp.next;
        temp.next=new Node(data);
        temp.next.next=holder;
        numNodes++;
    }

//    @Override
//    public void remote(int index) {
//        checkElementIndex(index);
//
//    }

//    private void checkElementIndex(int index) {
//        if(!isElementIndex(index))
//            throw new IndexOutOfBoundsException(outOfboundsMgs(index));
//    }
//    private String outOfboundsMgs(int index){
//        return "Index:"+index+",size"+size;
//    }
    @Override
    public void addFirst(Object data) {
        Node temp=head;
        head=new Node(data);
        head.next=temp;
        numNodes++;
    }

    @Override
    public double getRealMoney() {
        return 0;
    }
}

