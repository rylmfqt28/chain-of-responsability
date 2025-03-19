package models;

public class Supplier {
    private String name;
    private boolean offersWarranty;

    public Supplier(String name, boolean offersWarranty) {
        this.name = name;
        this.offersWarranty = offersWarranty;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isOffersWarranty() {
        return offersWarranty;
    }

    public void setOffersWarranty(boolean offersWarranty) {
        this.offersWarranty = offersWarranty;
    }
}
