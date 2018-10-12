package com.website.ecommerceclientapp;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.client.RestTemplate;

import com.website.ecommerceclientapp.entity.LineItems;
import com.website.ecommerceclientapp.entity.Products;
import com.website.ecommerceclientapp.repository.ProductRepository;

@Controller
public class HelloController {
	private static final RestTemplate REST_TEMPLATE = new RestTemplate();
	private static final String baseUrl = "http://localhost:7070/";
	private List<LineItems> cart;

	@Autowired
	private ProductRepository productRepository;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String helloWorld(HttpServletRequest request) {
		HttpSession session = request.getSession();
		List<Products> products = productRepository.findAll();
		session.setAttribute("products", products);
		session.setAttribute("cart", cart);
		return "displayall";
	}
	
	@RequestMapping(value="/addtocart/{productId}",method=RequestMethod.GET)
	public String addToCart(HttpServletRequest request,Model model,@PathVariable int productId) {
		HttpSession session = request.getSession();
		int itemQuantity=1;
		for (LineItems lineItems : cart) {
			if(lineItems.getProductid()==productId)
				itemQuantity++;
		}
		LineItems cartItems=new LineItems(1, itemQuantity, productId);
		cart.add(cartItems);
		session.setAttribute("cartSize", cart.size());
		return "displayall";
	}
	
}
