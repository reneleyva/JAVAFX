package hello;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;

/**
 *
 * @author rene
 */
public class Hello extends Application {
    public static void main(String[] args) {
        Application.launch(args);
    }
    @Override
    public void start(Stage stage) {
        Label nameLabel = new Label("Enter your name");
        TextField textField = new TextField();
        
        Label msg = new Label("");
        msg.setStyle("-fx-text-fill: blue;");
        
        //Botones
        Button sayHelloBtn = new Button("Say Hello");
        Button exitBtn = new Button("Exit");
        
        //Add handelers
        sayHelloBtn.setOnAction(e -> {
            String name = textField.getText();
            if (name.trim().length() > 0) {
                msg.setText("Hello " + name);
            } else {
                msg.setText("Dont you have a name!!");
            }
        });
        
        //Add handelers for the exit Button 
        exitBtn.setOnAction(e -> Platform.exit());
        
        //Create the root node 
        VBox root = new VBox();
        
        //Set vertical stuff between childrens
        root.setSpacing(5);
        
        //Add children to the root 
        root.getChildren().addAll(nameLabel, textField, msg, sayHelloBtn, exitBtn);
        
        Scene scene = new Scene(root, 350, 150);
        stage.setScene(scene);
        stage.setTitle("Some JAVAFX Stuff bruh");
        stage.show();
        
    }
}
