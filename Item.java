
public class Item{

    private String name;
    private double price;
// --------CONSTRUCTOR--------------
    public Item(String name, double price){
        setName(name);
        setPrice(price);
    }
// --------SETTERS--------------
    public void setName(String name){
        this.name = name;
    }
    public void setPrice(double price){
        this.price = price;
    }
// --------GETTERS--------------
    public String getName(){
        return this.name;
    }
    public double getPrice(){
        return this.price;
    }
}
