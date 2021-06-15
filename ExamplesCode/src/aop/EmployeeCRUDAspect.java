package aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class EmployeeCRUDAspect {

	@Before("execution(* aop.EmployeeManager.getEmployeeById(..))")         //point-cut expression
    public void logBeforeV1(JoinPoint joinPoint)
    {
		int i = 0;
        System.out.println("EmployeeCRUDAspect.logBeforeV1() : " + joinPoint.getSignature().getName());
    }
	
}
