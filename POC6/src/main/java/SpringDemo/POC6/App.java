package SpringDemo.POC6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
    	
    	UserInfo userInfo = (UserInfo) context.getBean("userInfo");
    	
    	System.out.println("------ User Information ------");
    	
    	System.out.println("Email: " + userInfo.getEmail());
        System.out.println("Password: " + userInfo.getPassword());
        System.out.println();
        System.out.println(userInfo.toString());
        System.out.println();
        
        ProductDashboard productDashboard = (ProductDashboard) context.getBean("productDashboard");

        System.out.println("------ Product Details ------");
        System.out.println("Product ID: " + productDashboard.getProduct_id());
        System.out.println("Product Description: " + productDashboard.getProduct_discription());
        System.out.println("Price: $" + productDashboard.getPrice());
        System.out.println();
        System.out.println(productDashboard.toString());
        System.out.println();
        
        ProductPriceCalculator calculator = (ProductPriceCalculator) context.getBean("calculator");
        //System.out.println(calculator.toString());

     
        System.out.println("------ Product Billing ------");
        double totalCost = calculator.calculateTotalCost();
        System.out.println("Total Cost: $" + totalCost);
        System.out.println();
    	
    	
        CartFileStorage cartFileStorage = (CartFileStorage) context.getBean("cartFileStorage");
        
        try {
        	
        	cartFileStorage.saveCartSummary(calculator.toString());
        	
            String cartSummary = cartFileStorage.loadCartSummary();
            System.out.println("Loaded cart summary: " + cartSummary);

        } catch (Exception e) {
            e.printStackTrace();
        }
        
      
    }
}
