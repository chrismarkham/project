package model;

public class Product {

	private String sku;
	private String productType;
	private String flavor;
	private double cost;
	private double price;
	private int quantity;
	
	public Product() {
		this.sku = "1";
		this.productType = "No type";
		this.flavor = "No flavor";
		this.cost = 0.0;
		//this.price = 0.0;
		this.quantity=0; 
		}
	
	/**
	 * @param sku
	 * @param productType
	 * @param flavor
	 * @param cost
	 * @param price
	 * @param quantity
	 */

	
	public Product(String sku, String productType, String flavor, double cost, double price, int quantity) {
		this.sku = sku;
		this.productType = productType;
		this.flavor = flavor;
		this.cost = cost;
		this.price = price;
		this.quantity = quantity;
	}

	/**
	 * @return the sku
	 */
	public String getSku() {
		return sku;
	}

	/**
	 * @return the productType
	 */
	public String getProductType() {
		return productType;
	}

	/**
	 * @return the flavor
	 */
	public String getFlavor() {
		return flavor;
	}

	/**
	 * @return the cost
	 */
	public double getCost() {
		return cost;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @return the quantity
	 */
	public int getQuantity() {
		return quantity;
	}

	/**
	 * @param sku the sku to set
	 */
	public void setSku(String sku) {
		this.sku = sku;
	}

	/**
	 * @param productType the productType to set
	 */
	public void setProductType(String productType) {
		this.productType = productType;
	}

	/**
	 * @param flavor the flavor to set
	 */
	public void setFlavor(String flavor) {
		this.flavor = flavor;
	}

	/**
	 * @param cost the cost to set
	 */
	public void setCost(double cost) {
		this.cost = cost;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	
	@Override
	public String toString() {
		return "Product [sku=" + sku + ", productType=" + productType + ", flavor=" + flavor + ", cost=" + cost
				+ ", price=" + price + ", quantity=" + quantity + "]";
	}	
}
