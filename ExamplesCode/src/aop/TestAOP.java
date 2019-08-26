package aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAOP {

	 @SuppressWarnings("resource")
	    public static void main(String[] args) {
	  
	        //ApplicationContext context = new ap
	 
	        EmployeeManager manager = new EmployeeManager(); 
	  
	        manager.getEmployeeById(1);
	    }
}
