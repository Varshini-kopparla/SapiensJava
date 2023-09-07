package SpringDemo.POC6;

public class ProductDashboard {

	private int product_id;
	private String product_discription;
	private double price;

	public int getProduct_id() {
		return product_id;
	}

	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}

	public String getProduct_discription() {
		return product_discription;
	}

	public void setProduct_discription(String product_discription) {
		this.product_discription = product_discription;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "ProductDashboard [product_id=" + product_id + ", product_discription=" + product_discription
				+ ", price=" + price + "]";
	}

}
