package OOP.TMA;

public class Machine {
    private String brandName;
    private int productionYear;

    public Machine() {
    }

    public Machine(String brandName, int productionYear) {
        this.brandName = brandName;
        this.productionYear = productionYear;
    }

    public String getBrandName() {
        return brandName;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return "brand name: " + brandName + "\n production year " + productionYear;
    }
}