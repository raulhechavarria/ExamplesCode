package designPattern.state;

public class OnRadioState implements RadioState {

	final public String test = "this si in on";
	
	
	@Override
	public void execute(Radio radio) {
		//throws exception if radio is already on
        radio.setOn(true);
	}


	@Override
	public String getValue() {
		
		return "the value  is in  on " ;
	}
	

}
