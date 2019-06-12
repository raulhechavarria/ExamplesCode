package designPattern.state;

public class Radio {
	private boolean on;
	private RadioState state;

	public Radio(RadioState state) {
		this.state = state;
	}
	
	public void execute() {
		state.execute(this);
	}

	public void setState(RadioState state) {
		this.state = state;
		//execute(); // avoid doble line code
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public boolean isOn() {
		return on;
	}

	public boolean isOff() {
		return !on;
	}

	public RadioState getState() {
		return state;
	}

	
	
}
