package y2020_mehta_sujay_period_4_individual_project;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Game extends Application  {
	
	
	 
	 
	 BallWorld bw;
	 public static void main(String[] args) {
	        launch(args);
	 }
	 
	@Override
	public void start(Stage stage) throws Exception {
        
        stage.setTitle("Basketball Shootout");
        bw = new BallWorld();
        
        Scene scene = new Scene(bw);
        stage.setScene(scene);
        bw.start();
        stage.show();
        bw.requestFocus();
        
        stage.requestFocus();
        }

	
	}

	

