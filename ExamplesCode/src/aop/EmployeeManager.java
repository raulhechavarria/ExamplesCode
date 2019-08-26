package aop;

import org.springframework.stereotype.Component;

@Component
public class EmployeeManager {

	public EmployeeManager() {
		// TODO Auto-generated constructor stub
	}
	
	public EmployeeDTO getEmployeeById(Integer employeeId) {
        System.out.println("Method getEmployeeById() called");
        return new EmployeeDTO();
    }

}
