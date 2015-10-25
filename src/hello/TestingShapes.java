package hello;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.*; //EveryOne!!!
/**
 *
 * @author Renoir
 */
public class TestingShapes extends Application {

    @Override
    public void start(Stage primaryStage) {
        
        Group root = new Group();
        Scene scene = new Scene(root, 800, 500);
      
        CubicCurve cubicCurve = new CubicCurve(
            50, // start x point
            75, // start y point
            280, // control x1 point
            -100, // control y1 point
            110, // control x2 point
            300, // control y2 point
            340, // end x point
            75); // end y point
        cubicCurve.setStrokeType(StrokeType.CENTERED);
        cubicCurve.setStroke(Color.BLACK);
        cubicCurve.setStrokeWidth(3);
        cubicCurve.setFill(Color.WHITE);
        //Line line = new Line(40, 40, 600, 40);
        root.getChildren().addAll(cubicCurve);
        
        // Ice cream cone
        Path path = new Path();
        path.setStrokeWidth(3);
         
        // create top part beginning on the left
        MoveTo moveTo = new MoveTo();
        moveTo.setX(50);
        moveTo.setY(150);
         
        // curve ice cream (dome)
        /*QuadCurveTo quadCurveTo = new QuadCurveTo();
        quadCurveTo.setX(150);
        quadCurveTo.setY(150);
        quadCurveTo.setControlX(100);
        quadCurveTo.setControlY(50);*/
 
        path.getElements().add(moveTo);
        //path.getElements().add(quadCurveTo);
         
        path.setTranslateY(30);
 
        root.getChildren().add(path);
        primaryStage.setTitle("Hello World!");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args 
     * Launch that shit y'all
     */
    public static void main(String[] args) {
        launch(args);
    }

}
