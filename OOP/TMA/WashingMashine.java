package OOP.TMA;

public class WashingMashine extends Machine implements Comparable<WashingMashine> {
    private int capacity;

    WashingMashine(String brandName, int productionYear, int capacity) {
        setBrandName(brandName);
        setProductionYear(productionYear);
        this.capacity = capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getCapacity() {
        return capacity;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + "\ncapacity: " + capacity;
    }

    @Override
    public boolean equals(Object obj) {
        // TODO Auto-generated method stub
        if (obj instanceof WashingMashine) {
            return this.getBrandName() == ((WashingMashine) obj).getBrandName()
                    && this.getProductionYear() == ((WashingMashine) obj).getProductionYear()
                    && capacity == ((WashingMashine) obj).getCapacity();
        } else {
            return false;
        }
    }

    @Override
    public int compareTo(WashingMashine o) {
        if (getBrandName().charAt(0) > o.getBrandName().charAt(0))
            return 1;
        else if (getBrandName().charAt(0) < o.getBrandName().charAt(0))
            return -1;
        else
            return 0;
    }

}
