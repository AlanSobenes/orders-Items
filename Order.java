import java.util.ArrayList;

public class Order{

    private String name;
    private double total;
    private Boolean ready;
    public ArrayList<Item> items = new ArrayList<Item>();
    
    // --------CONSTRUCTOR--------------
    public Order(){ 
        setReady(false);      
    }
    // --------SETTERS--------------
    public void setName(String name){
        this.name = name;
    }
    public void setTotal(double price){
        this.total += price;
    }
    public void setReady(Boolean ready){
        this.ready = ready;
    }
    
    
    // --------GETTERS--------------

    public String getName(){
        return this.name;
    }
    public double getTotal(){
        return this.total;
    }
    public Boolean getReady(){
        return this.ready;
    }



}