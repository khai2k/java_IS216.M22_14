package application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.paint.Color;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class AddFoodScene {
	public void start(Stage primaryStage) {
		try {
			AnchorPane root = (AnchorPane)FXMLLoader.load(getClass().getResource("addFoodUI.fxml"));
			Scene scene = new Scene(root,527,501);
			scene.setFill(Color.TRANSPARENT);
			primaryStage.setResizable(false);
			primaryStage.initStyle(StageStyle.TRANSPARENT);
			primaryStage.setScene(scene);
			primaryStage.initModality(Modality.APPLICATION_MODAL); 
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}