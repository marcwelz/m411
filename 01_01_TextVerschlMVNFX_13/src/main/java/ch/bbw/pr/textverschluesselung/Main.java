package ch.bbw.pr.textverschluesselung;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;

/**
 * Main Application
 * @author Peter Rutschmann
 * @version 26.08.2020
 */
public class Main extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			FXMLLoader myLoader = new FXMLLoader(getClass().getResource("View.fxml"));
			Pane root = myLoader.load();
			primaryStage.setTitle("TextVerschluesselung");
			Scene scene = new Scene(root, 300, 120);
			scene.getRoot().setStyle("-fx-font-family: 'serif'");
			primaryStage.setScene(scene);

			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		System.out.println("JavaFX " + System.getProperty("javafx.version") + ", running on Java " + System.getProperty("java.version") + ".");
		launch(args);
	}
}
