package designPattern.state;

public class OnRadioState implements RadioState {

	@Override
	public void execute(Radio radio) {
		//throws exception if radio is already on
        radio.setOn(true);
	}

}
