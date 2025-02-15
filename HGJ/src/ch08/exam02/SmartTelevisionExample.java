package ch08.exam02;

import ch08.exam01.RemoteControl;

public class SmartTelevisionExample {
	public static void main(String[] args) {
		SmartTelevision tv = new SmartTelevision();
		
		RemoteControl rc = tv;
		Searchable searchable = tv;
	}
}
