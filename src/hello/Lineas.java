package hello;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Slider;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.scene.shape.StrokeLineCap;

/**
 *
 * @author Renoir
 */
public class Lineas extends Application {

    @Override
    public void start(Stage primaryStage) {
        Group root = new Group();
        Scene scene = new Scene(root, 300, 250, Color.BLACK);
        
        //Red Line
        Line redLine = new Line(10, 10, 200, 10);
        
        redLine.setStroke(Color.RED);
        redLine.setStrokeWidth(10);
        redLine.setStrokeLineCap(StrokeLineCap.BUTT);
        
        // creating a dashed pattern
        redLine.getStrokeDashArray().addAll(2d);
        redLine.setStrokeDashOffset(0);
 
        root.getChildren().add(redLine);
 
        // White line
        Line whiteLine = new Line(10, 30, 200, 30);
        whiteLine.setStroke(Color.WHITE);
        whiteLine.setStrokeWidth(10);
        whiteLine.setStrokeLineCap(StrokeLineCap.BUTT);
        whiteLine.getStrokeDashArray().addAll(5d);

 
        root.getChildren().add(whiteLine);

        // Blue line
        Line blueLine = new Line(10, 50, 200, 50);
        blueLine.setStroke(Color.BLUE);
        blueLine.setStrokeWidth(10);
        blueLine.getStrokeDashArray().addAll(2d);
         
        root.getChildren().add(blueLine);
         
         
        // slider min, max, and current value
        Slider slider = new Slider(0, 100, 0);
        slider.setLayoutX(10);
        slider.setLayoutY(95);
         
        // bind the stroke dash offset property
        redLine.strokeDashOffsetProperty()
            .bind(slider.valueProperty());
        root.getChildren()
            .add(slider);

        Text offsetText = new Text("Stroke Dash Offset: 0.0");
        offsetText.setX(10);
        offsetText.setY(80);
        offsetText.setStroke(Color.WHITE);
         
        // display stroke dash offset value
        slider.valueProperty()
        .addListener((ov, curVal, newVal) ->
            offsetText.setText("Stroke Dash Offset: " + slider.getValue()));
        root.getChildren().add(offsetText);
        
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args Launch that shit y'all
     */
    public static void main(String[] args) {
        launch(args);
    }

}
