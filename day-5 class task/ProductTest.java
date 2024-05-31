package co.ey.taskcollections;
import java.util.*;

public class ProductTest {
	public static void main(String[] args) {  //rest, run, ui,
		
		System.out.println("==========Welcome to product.com==========");
		System.out.println("Enter your operation from below choice :");
		System.out.println("***To Add a product - 1***");
		System.out.println("***To Delete a product - 2***");
		System.out.println("***To Update a product - 3***");
		System.out.println("***To dispay the product - 4***");
		System.out.println("***To dispay the product by giving index - 5***");
		
		
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();		
		
		ProductService ps=new ProductService();

		//menu should be displayed, take user choice to perform operation, 1...5
		Product p1=new Product(1,"doll");
		Product p2=new Product(2,"mango");
		Product p3=new Product(3,"apple");
		Product p4=new Product(4,"fox toy");
		Product p5=new Product(5,"fan");
		Product p6=new Product(6,"banana");
		ps.addProduct(p1);
		ps.addProduct(p2);
		ps.addProduct(p3);
		ps.addProduct(p4);
		ps.addProduct(p5);
		ps.addProduct(p6);
		
		
		
		if(n==1) {
			System.out.println("Enter the product id");
			int x=sc.nextInt();
			System.out.println("Enter the product name");
			String y=sc.next(); 
			Product product=new Product(x,y);
			String result=ps.addProduct(product);
			System.out.println(result);
			ps.listProducts();
		}
		else if (n==2) {
			ps.listProducts();
			System.out.println("Enter the product id that you want to delete:");
			int x=sc.nextInt();
			System.out.println("Enter the product name that you want to delete:");
			String y=sc.next(); 
			Product product=new Product(x,y);
			String result=ps.deleteProduct(product);
			System.out.println(result);
			ps.listProducts();
		}
		else if (n==3) {
			ps.listProducts();
			System.out.println("Enter the product id that you want to update:");
			int x=sc.nextInt();
			System.out.println("Enter the product new product name :");
			String y=sc.next();
			Product product=new Product(x,y);
			String result=ps.updateProduct(product);
			System.out.println(result);
			ps.listProducts();
		}
		
		else if(n==4) {
			ps.listProducts();
		}
		
		else if(n==5) {
			System.out.println("Enter the id of the producyt that you want to See:");
			int x=sc.nextInt();
			Product result=ps.getProduct(x);
			System.out.println(result);
		}
		else
			System.out.println("THANK YOU FOR USING PRODUCT.COM ENTER THE CORRECT OPTION!!!");

	}
	
}
