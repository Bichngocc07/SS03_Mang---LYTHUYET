// ProductionEmployee.java
public class ProductionEmployee extends Employee {
    private int productCount;
    private double wagePerProduct;

    public ProductionEmployee(String name, int productCount, double wagePerProduct) {
        super(name);
        this.productCount = productCount;
        this.wagePerProduct = wagePerProduct;
    }

    @Override
    public double calculateSalary() {
        return productCount * wagePerProduct;
    }
}
