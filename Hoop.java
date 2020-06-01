package y2020_mehta_sujay_period_4_individual_project;


import java.net.URL;

import javafx.scene.image.Image;

public class Hoop extends Actor {
	
	
	public Hoop() { 
		String path = getClass().getClassLoader ( ).getResource("resources/hoop.png").toString();
		setImage(new Image (path));
		
	}
	
	
	@Override
	public void act(long now) {
		
		
	}

}

