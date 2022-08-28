package minitestTDD;
import java.time.LocalDate;
public abstract class Material {
    private int id;
    private String name;
    private LocalDate manufacturingDate;
    private int cost;
//    private Node head;
//    private int numNodes;
    public Material() {
//        head=new Node(data);
    }
//    private class Node{
//        private Node next;
//        private Object data;
//        public Node(Object data) {
//            this.data=data;
//        }
//        public Object getData(){
//            return this.data;
//        }
//    }
    public Material(int id, String name, LocalDate manufacturingDate, int cost) {
        this.id = id;
        this.name = name;
        this.manufacturingDate = manufacturingDate;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getManufacturingDate() {
        return manufacturingDate;
    }

    public void setManufacturingDate(LocalDate manufacturingDate) {
        this.manufacturingDate = manufacturingDate;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }
    public abstract double getAmount();

    public abstract int getExpiryDate() ;

    public abstract void add(int index, Object data);

//    public abstract void remote(int index);
    public abstract void addFirst(Object data);
}
