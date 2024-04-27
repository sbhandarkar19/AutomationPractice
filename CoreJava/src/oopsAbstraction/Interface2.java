package oopsAbstraction;
// Program ==> How to achieve multiple inheritance
//             If there is no constructor in the interface, then multiple inheritance can be achieved by using it.

interface BluetoothHeadset {
	void playMusic();
	
	void stopMusic();
}

interface SmartWatch {
	void calculateHeartRate();
	
	void calling();
}

class SmartWearables implements BluetoothHeadset, SmartWatch {
//	this is example of multiple inheritance 
	public void playMusic() {
		
	}
	
	public void stopMusic() {
		
	}
	
	public void calculateHeartRate() {
		
	}
	
	public void calling() {
		
	}
}

public class Interface2 {

	public static void main(String[] args) {
		

	}

}
