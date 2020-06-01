package y2020_mehta_sujay_period_4_individual_project;

import javafx.scene.image.Image;

public class Meter extends Actor {
	boolean isMovingUp;
	public Meter() {
		isMovingUp = true;
		String path = getClass().getClassLoader().getResource("resources/meter.png").toString ();
        this.setImage(new Image (path));
		
		
	}
	

	@Override
	public void act(long now) {
		
		if(isMovingUp) {
			
			move(0,-5);
			if(this.getY() <= ((BallWorld)getWorld()).getTop().getY()) {
				isMovingUp = !isMovingUp;
			}
		}
		
		if(!isMovingUp) {
			move(0,5);
			if(this.getY() >= ((BallWorld)getWorld()).getBottom().getY() + ((BallWorld)getWorld()).getBottom().getHeight()) {
				isMovingUp = !isMovingUp;
			}
		}
		
	}	
		
	public double getPositionY() {
		return this.getY();
		
	}
	
	public boolean madeShot() {
		if(this.getY() > ((BallWorld)getWorld()).getMiddle().getY() && this.getY() < ((BallWorld)getWorld()).getMiddle().getY() +  ((BallWorld)getWorld()).getBottom().getHeight()) {
			return true;
			
		} else {
			return false;
		}
		
	}

}
