import javafx.application.Application; 
import javafx.collections.ObservableList; 
import javafx.scene.Group; 
import javafx.scene.Scene; 
import javafx.stage.Stage; 
import javafx.scene.text.Font; 
import javafx.scene.text.Text; 

public class PaperDB extends Application { 
	@Override 
	public void start(Stage stage) {       

		//Creating a Group object  
		Group root = new Group(); 

		//Creating a scene object 
		Scene scene = new Scene(root, 1200, 800); 

		//Setting title to the Stage 
		stage.setTitle("PaperDB"); 

		//Adding scene to the stage 
		stage.setScene(scene); 

		//Displaying the contents of the stage 
		stage.show(); 
	}   

	public static void main(String args[]) { 
		launch(args); 
	} 
} 
