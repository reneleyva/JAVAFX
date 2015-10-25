package hello;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
/**
 *
 * @author Renoir
 */
public class TestLines extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        //Line line = new Line(0, 0, 1360, 780);
        //line.setStroke(Color.BLUE);
        Group root = new Group();
        //line.getStrokeDashArray().addAll(5d);
        //Moveré la ultima y poco a poco hasta uqe abarque toda la pantalla
       for (int i = 0; i< 1000; i++) {
            Line l = new Line(0, 0, 1360, (double) i);
            
            root.getChildren().add(l);
            //line.getStrokeDashArray().addAll((double) i);
        }
       /*for (int i = 0; i < 1000; i+=2) {
           Line l = new Line(1360, 0, 0, (double) i);
           root.getChildren().add(l);
       }*/
        
        //root.getChildren().add(line);
        Scene scene = new Scene(root);
        primaryStage.setTitle("Line");
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
