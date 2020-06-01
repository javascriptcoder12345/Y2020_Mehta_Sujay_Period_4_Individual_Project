package y2020_mehta_sujay_period_4_individual_project;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class BallWorld extends World {

    private Score score;
    
    private Meter meter;
    private Ball ball;
    private Hoop hoop;
    private Rectangle top;
    private Rectangle middle;
    private Rectangle bottom;
    public BallWorld() {
        score = new Score();
        score.setX(225);
        score.setY(225);
        meter = new Meter();
        ball = new Ball();
        hoop = new Hoop();
        middle = new Rectangle(50,100);
        middle.setFill(Color.GREEN);
        bottom = new Rectangle(50,100);
        bottom.setFill(Color.RED);
        hoop.setX(700);
        hoop.setY(700);
        ball.setX(50);
        ball.setY(600);
        top = new Rectangle(50,100);
        top.setFill(Color.RED);
        top.setX(40);
        top.setY(100);
        middle.setX(40);
        middle.setY(200);
        bottom.setX(40);
        bottom.setY(300);
        meter.setX(80);
        meter.setY(300);
       
        
        getChildren().addAll(meter,ball,hoop,top,middle,bottom);
        
    }

    @Override
    public void act(long now) {
        if (isGameOver()) {
            System.exit ( 1 );
        }
    }

    public Score getScore() {
        return score;
    }

    public boolean isGameOver() {
    	if(ball.getShots() == 0) {
    		return true;
    	}
    	return false;
    }
    
    public Meter getMeter() {
    	return meter;
    	
    }
    
    public Rectangle getTop() {
    	return top;
    }
    
    public Rectangle getBottom() {
    	return bottom;
    }
    
    public Rectangle getMiddle() {
    	return middle;
    }
    
    public Hoop getHoop() {
    	return hoop;
    }
   
}

