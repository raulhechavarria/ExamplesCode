package designPattern.behavioral.state;

public class ExamplesState {

	
	public static void main(String[] args) {
		Radio radio = new Radio(new OffRadioState()); //initial status
		
		radio.setState(new OnRadioState());
		radio.execute(); //radio on
		
		radio.setState(new OffRadioState());
		radio.execute(); //radio off
		
		String string = radio.getState().getValue(); // i need to create  of any way to  take value  that i need  and is of the on or the off class

	}

}
