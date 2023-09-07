package SpringDemo.POC6;

public class ProductPriceCalculator {
	
	private ProductDashboard productDashboard;
    private ProductCart productCart;

    public void setProductDashboard(ProductDashboard productDashboard) {
        this.productDashboard = productDashboard;
    }

    public void setProductCart(ProductCart productCart) {
        this.productCart = productCart;
    }
    
    public double calculateTotalCost() {
        int quantity = productCart.getQuantity();
        double price = productDashboard.getPrice();
        return quantity * price;
    }

	@Override
	public String toString() {
		return "ProductPriceCalculator [productDashboard=" + productDashboard + ", productCart=" + productCart + "]";
	}
    

}
