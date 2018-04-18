package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dbHelpers.UpdateQuery;
import model.Product;

/**
 * Servlet implementation class UpdateProductServlet
 */
@WebServlet(urlPatterns={ "/updateProduct" })
public class UpdateProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateProductServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		this.doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 
		
		//get input
		String sku = request.getParameter("sku");
		 String productType = request.getParameter("productType");
		 String flavor = request.getParameter("flavor");
		 double cost = Double.parseDouble(request.getParameter("cost"));
		 double price = Double.parseDouble(request.getParameter("price"));
		 int quantity = Integer.parseInt(request.getParameter("quantity"));

		 Product product = new Product();
		 product.setSku(sku);
		 product.setProductType(productType);
	     product.setFlavor(flavor);
		 product.setCost(cost);
	     product.setPrice(price);
		 product.setQuantity(quantity);
		
		UpdateQuery uq = new UpdateQuery("grocery", "root", "root");
		uq.doUpdate(product);
		
		// pass control on to the ReadServlet
		String url = "/read";
		
		RequestDispatcher dispatcher = request.getRequestDispatcher(url);
		dispatcher.forward(request, response);
	}

}
