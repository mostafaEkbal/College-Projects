package OOP;

public class Sale {
    private String itemName;
    private double price;

    public Sale() {
        this.itemName = "razor PC";
        this.price = 0.25;
    }

    public Sale(String itemname, double price) {
        this.itemName = itemname;
        this.price = price;
    }

    public String getItemName() {
        return itemName;
    }

    public double getPrice() {
        return price;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return "the item name is " + itemName + " and the price is " + price;
    }

    public double bill() {
        return price;
    }
}

public class DiscountSale extends Sale {
    private double discount;
}
