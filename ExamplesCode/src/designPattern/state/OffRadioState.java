package designPattern.state;

public class OffRadioState implements RadioState {

	@Override
	public void execute(Radio radio) {
		 //throws exception if radio is already off
        radio.setOn(false);
	}

	@Override
	public String getValue() {
		// TODO Auto-generated method stub
		return " this is off";
	}

}
