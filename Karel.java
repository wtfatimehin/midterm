import stanford.karel.SuperKarel;


public class Karel {
	
	public void run() {
		move();
		
		turnLeft();
		
		move();
		
		while(notFacingEast()) {
			
			turnLeft();
		}
		
		placeTheBeepers();
	}
	
	private void placeTheBeepers( ) {
		for int(int k = 0; k < 4; k++) {
			while(frontIsClear()) {
				if(noBeepersPresent()) {
					putBeepers();
				}
				move();
			}
			backup();
			turnLeft();
		}
	}
	
	private void backUp() {
		turnAround();
		move();
		turnAround();
	}
}
