package java8.lambda_expressions_in_Java_8;

import java.util.ArrayList;
import java.util.HashMap;

import java8.lambda_expressions_in_Java_8.functional.interfaces.FuncInterface;

public class Test extends Test2{

	int i;
	int j;
	int k;
	String string;
	double d;
	
	
	
	public Test() {
		//super();
		// TODO Auto-generated constructor stub
	}


	public Test(int i, int j, int k) {
		super();
		this.i = i;
		this.j = j;
		this.k = k;
		HashMap<String, String> hashMap = new HashMap<>();
		 
	}


	public Test(int j) {
		//super();
		this.j = j;
	}


	// operation is implemented using lambda expressions 
    interface FuncInter1 
    { 
        int operation(int a, int b); 
    }
    
    
    // sayMessage() is implemented using lambda expressions 
    // above 
    interface FuncInter2 
    { 
        void sayMessage(String message); 
       
    } 
    
    
 // Performs FuncInter1's operation on 'a' and 'b' 
    private int operate(int a, int b, FuncInter1 fobj) 
    { 
        return fobj.operation(a, b); 
    } 
	
	
	public static void main(String args[]) 
    { 
		
		Test test = new Test(4);
		 
		System.out.print(test.i + test.j + test.k);
		
		FuncInter2 nn = message -> System.out.println("hello " + message);
		
		
		nn.sayMessage("RHP");
		
		
		// lambda expression for addition for two parameters 
        // data type for x and y is optional. 
        // This expression implements 'FuncInter1' interface 
        FuncInter1 add = (int x, int y) -> x + y; 
        
        // lambda expression multiplication for two parameters 
        // This expression also implements 'FuncInter1' interface 
        FuncInter1 multiply = (int x, int y) -> x * y; 
		
        // Creating an object of Test to call operate using 
        // different implementations using lambda Expressions 
        Test tobj = new Test();
        
        
     // Add two numbers using lambda expression 
        System.out.println("Addition is " + 
                          tobj.operate(6, 3, add)); 
        
        
     // Multiply two numbers using lambda expression 
        System.out.println("Multiplication is " + 
                          tobj.operate(6, 3, multiply));
        
		
        // lambda expression to implement above 
        // functional interface. This interface 
        // by default implements abstractFun() 
        FuncInterface fobj = (int x)->System.out.println(2*x);
        
        
        
        fobj.normalFun();
  
        // This calls above lambda expression and prints 10. 
        fobj.abstractFun(5); 
        
        
        // Creating an ArrayList with elements 
        // {1, 2, 3, 4} 
        ArrayList<Integer> arrL = new ArrayList<Integer>(); 
        arrL.add(1); 
        arrL.add(2); 
        arrL.add(3); 
        arrL.add(4); 
  
        // Using lambda expression to print all elements 
        // of arrL 
        arrL.forEach(n -> System.out.println(n)); 
  
        // Using lambda expression to print even elements 
        // of arrL 
        arrL.forEach(n -> { if (n%2 == 0) System.out.println(n); }); 
        
        
    } 
}
