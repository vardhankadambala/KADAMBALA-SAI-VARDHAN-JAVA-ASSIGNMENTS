package co.ey.taskcollections;
import java.util.*;

public class ProductService {
	
	List<Product> plist=new ArrayList<>();
	
	public String addProduct(Product p) {
		plist.add(p);
		return "product added sucessfully";
		
	}
	public String deleteProduct(Product p) { //to be  implement
		plist.remove(p);
		return "product removed sucessfully";
	}
	public String updateProduct(Product p) {//to be  implement
		plist.set(p.id-1, p);
		return "Product updated suceesfully";
	}
	public void  listProducts(){
		plist.forEach(x->System.out.println(x));
	}
	public Product getProduct(Integer id) {//to be  implement
		Product s=plist.get(id-1);
		return s;
	}

}
