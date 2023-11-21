package controller;
import java.util.List;
import java.util.Optional;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import entity.Product;
import service.DbService;

@Controller
public class ProductController {
	DbService dbService;
	
	public ProductController() {
		dbService = new DbService();
	}
	
	@GetMapping("/addproduct")
	public String addproductform() {
		return "addproductform";
	}

	@PostMapping("/addproduct")
	public String addproduct(@ModelAttribute("product") Product product, Model model) {
		dbService.addProduct(product);//save product into database, using DbService
		model.addAttribute("product",product);
		return "addproduct";
	}
	
	@GetMapping("/viewallproducts")
	public String viewallproducts(Model model) {
		List<Product> products = dbService.getAllProducts();
		model.addAttribute("products",products);
		return "viewallproducts";
	}
	
	@GetMapping("/viewproduct")
	public String viewproduct(HttpServletRequest request, Model model) {
		//get the product name, you can use request, @RequestParam etc here...
		String name = request.getParameter("name");
		//ask dbService for product detail based on product name
		System.out.println("product name is: "+name);
		Product product = dbService.getProductById(name);

		if (product!=null) { //product exist
			System.out.println("product exist : "+name);
			model.addAttribute("product",product);			
		}
		else { // product not exist
			System.out.println("product doesnt exist :"); 
		}
		return "viewproductdetail";
	}
	
	@RequestMapping("/deleteproduct")
	public String deleteproduct() {
		return "deleteproduct";
	}

	@RequestMapping("/editproduct")
	public String editproduct() {
		return "editproduct";
	}	
}