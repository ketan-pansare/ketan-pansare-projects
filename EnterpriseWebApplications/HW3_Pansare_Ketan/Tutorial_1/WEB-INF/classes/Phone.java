import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Phone")

/* 
	Phone class contains class variables name,price,image,retailer,condition,discount.

	Phone class has a constructor with Arguments name,price,image,retailer,condition,discount.
	  
	Phone class contains getters and setters for name,price,image,retailer,condition,discount.

*/

public class Phone extends HttpServlet{
	private String id;
	private String name;
	private double price;
	private String image;
	private String retailer;
	private String condition;
	private double discount =0;
	
	public Phone(String id,String name, double price, String image, String retailer,String condition,double discount){
		this.id=id;
		this.name=name;
		this.price=price;
		this.image=image;
		this.condition=condition;
		this.discount = discount;
		this.retailer = retailer;
	}
	
	public Phone(){
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
		

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getRetailer() {
		return retailer;
	}
	public void setRetailer(String retailer) {
		this.retailer = retailer;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}

	public double getDiscount() {
		return discount;
	}

	public void setDiscount(double discount) {
		this.discount = discount;
	}
	
}
