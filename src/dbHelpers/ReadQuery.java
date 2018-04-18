package dbHelpers;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.NumberFormat;

import model.Product;

public class ReadQuery {
	
	private Connection connection;
	private ResultSet results;
	//need to add number format so it returns correctly 
	NumberFormat defaultFormat = NumberFormat.getCurrencyInstance();
	
	public ReadQuery(String dbName, String uname, String pwd){
		String url = "jdbc:mysql://localhost:3306/" + dbName;
		
		// set up the driver
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
			this.connection = DriverManager.getConnection(url, uname, pwd);
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public void doRead(){
		String query = "select * from products";
		try {
			PreparedStatement ps = this.connection.prepareStatement(query);
			this.results= ps.executeQuery();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public String getHTMLTable(){
		String table ="";
		
		try {
			while(this.results.next()){
				Product product = new Product();
				product.setSku(this.results.getString("SKU"));
				product.setProductType(this.results.getString("ProductType"));
				product.setFlavor(this.results.getString("Flavor"));
				product.setCost(this.results.getDouble("Cost"));
				product.setPrice(this.results.getDouble("Price"));
				product.setQuantity(this.results.getInt("Quantity"));
				
				table +="<tr>"; table +="<td>";
				table += product.getSku();
				table +="</td>"; table +="<td>";
				table += product.getProductType();
				table +="</td>"; table +="<td>";
				table += product.getFlavor();
				table +="</td>"; table +="<td>";
				table += defaultFormat.format(product.getCost());
				table +="</td>"; table +="<td>";
				table += defaultFormat.format(product.getPrice());
				table +="</td>"; table +="<td>";
				table += product.getQuantity();
				table +="</td>";table +="<td class='edit'>";
				table += "<a href=update?sku=" + product.getSku() + ">update</a>"; 
				table +="</td>";table += "<td class='edit'>";
				table += "<a href=delete?sku=" + product.getSku() + ">delete</a>";
				table +="</td>";table +="</tr>";	
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return table;
	}
	
}