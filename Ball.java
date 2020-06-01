package y2020_mehta_sujay_period_4_individual_project;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.Text;

public class Ball extends Actor {
	int dy;
	int dx;
	int numShots;
	int madeShots;
	public Ball() {
		dx = 0;
		dy = 0;
		madeShots = 0;
		numShots = 15;
		String path = getClass ( ).getClassLoader ( ).getResource ( "resources/Ball.png" ).toString ( );
        setImage ( new Image ( path ) );

	}
	
	public void act(long now) {
		
		 BallWorld wrld = (BallWorld) getWorld ( );
		
	     if(getWorld().isKeyDown(KeyCode.SPACE)) {
	    	move(3,0);
	    	 if(((BallWorld) getWorld()).getMeter().madeShot()) {
	    		 if(this.getX() != ((BallWorld) getWorld()).getHoop().getX()) {
	    			 move(3,0);
	    		 }
	    		 if(this.getOneIntersectingObject(Hoop.class) != null) {
	    			 dy = 2;
	    			 dx = 0;
	    			 move(dx,dy);
	    		 }
	    		 madeShots++;
	    		 
	    		 wrld.getScore ( ).setScore ( wrld.getScore ( ).getScore ( ) + 1 );
	    		 numShots--;
	    		 resetPosition();
	    	 } else {
	    		if(this.getX() + this.getWidth() + this.getWidth()/4 != ((BallWorld) getWorld()).getHoop().getX()) {
	    			dx = 3;
	    			move(dx,dy);
	    		}
	    		if(this.getY() != ((BallWorld) getWorld()).getHoop().getY()){
	    			dy = 2;
	    			move(dx,dy);
	    		}
	    		numShots--;
	    		resetPosition();
	    	 }
	     }
	     
	    
	    
	        
	}
	
	public int getShots() {
		return numShots;
		
	}
	
	public void resetPosition() {
		this.setX(50);
		this.setY(250);
	}
}
