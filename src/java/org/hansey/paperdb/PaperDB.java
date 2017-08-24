import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.geometry.Rectangle2D;


public class PaperDB extends Application { 
	@Override 
	public void start(Stage stage) {
		Screen screen = Screen.getPrimary();
		Rectangle2D bounds = screen.getVisualBounds();

		//Creating a Group object
		Group root = new Group(); 

		//Creating a scene object 
		Scene scene = new Scene(root, 800, 600, Color.BLACK);

		//Setting title to the Stage 
		stage.setTitle("PaperDB"); 

		//Adding scene to the stage 
		stage.setScene(scene);

		stage.setX(bounds.getMinX());
		stage.setY(bounds.getMinY());
		stage.setWidth(bounds.getWidth());
		stage.setHeight(bounds.getHeight());

		//Displaying the contents of the stage 
		stage.show(); 
	}   

	public static void main(String args[]) { 
		launch(args); 
	} 
} 
