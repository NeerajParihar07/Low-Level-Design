package StateDesignPattern;

public class Item {
    Itemtype type;
    int price;

    public ItemType getType(){return type;}

    public void setType(ItemType type){this.type = type;}

    public int getPrice(){return price;}

    public void setPrice(int price){this.price = price;}
}
