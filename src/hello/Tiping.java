package hello;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.control.*;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
/**
 *
 * @author Renoir
 */
public class Tiping extends Application{
    
    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) {
        Label nameLabel = new Label("Enter your name: ");
        TextField textField = new TextField();
        Label msg = new Label();
        msg.setStyle("-fx-text-fill: blue;");
        Button showMsgBtn = new Button("Show Message");
        
        showMsgBtn.setOnAction(e -> {
            String text = textField.getText();
            if (text.trim().length() > 0)
                msg.setText("Fuck you " + text);
            else 
                msg.setText("You thought you were smart Fuck you anyway");
        });
        
        VBox root = new VBox();
        root.getChildren().addAll(nameLabel, textField, msg, showMsgBtn);
        Scene scene = new Scene(root, 300, 100);
        stage.setScene(scene);
        stage.setTitle("Another test");
        stage.show();
        
        
    }
}