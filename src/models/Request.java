package models;

public class Request {
    private Product requestedProduct;
    private int requestedAmount;
    private int estimatedExpense;
    private Supplier supplier;

    public Request(Product requestedProduct, int requestedAmount, int estimatedExpense, Supplier supplier) {
        this.requestedProduct = requestedProduct;
        this.requestedAmount = requestedAmount;
        this.estimatedExpense = estimatedExpense;
        this.supplier = supplier;
    }

    public Product getRequestedProduct() {
        return requestedProduct;
    }

    public void setRequestedProduct(Product requestedProduct) {
        this.requestedProduct = requestedProduct;
    }

    public int getRequestedAmount() {
        return requestedAmount;
    }

    public void setRequestedAmount(int requestedAmount) {
        this.requestedAmount = requestedAmount;
    }

    public int getEstimatedExpense() {
        return estimatedExpense;
    }

    public void setEstimatedExpense(int estimatedExpense) {
        this.estimatedExpense = estimatedExpense;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public Supplier getSupplier() {
        return supplier;
    }
}
