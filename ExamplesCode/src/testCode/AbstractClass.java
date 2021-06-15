package testCode;


public abstract class AbstractClass {
 
	public int methodimplemented() {
		return 1+1;
	}
	
	public abstract String implemententotherClass();
	
	final public String  overrideM() {
		return "test override";
	}
	
	final public String  overrideM(String tem) {
		return "test override" + tem;
	}
	
}
