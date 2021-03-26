package Portatil;

public class Periferics {
	/*** ATRIBUTS ***/
	private String touchPad;
	private String Screen;
	private String mouse;
	private String keyboard;
	
	/*** CONSTRUCTOR ***/
	
	public Periferics(String touchPad, String Screen, String mouse, String keyboard) {
		this.touchPad = touchPad;
		this.Screen = Screen;
		this.mouse = mouse;
		this.keyboard = keyboard;
	}
	
	/*** GETTERS & SETTERS ***/

	public String getTouchPad() {
		return touchPad;
	}

	public void setTouchPad(String touchPad) {
		this.touchPad = touchPad;
	}

	public String getScreen() {
		return Screen;
	}

	public void setScreen(String screen) {
		Screen = screen;
	}

	public String getMouse() {
		return mouse;
	}

	public void setMouse(String mouse) {
		this.mouse = mouse;
	}

	public String getKeyboard() {
		return keyboard;
	}

	public void setKeyboard(String keyboard) {
		this.keyboard = keyboard;
	}
	
	/*** METODES ***/
	
	public String toString() {
		return "TouchPad: " + this.touchPad + "Screen: " + this.Screen + "Mouse: " + this.mouse + "Keyboard" + this.keyboard;
	}
	
	
}
