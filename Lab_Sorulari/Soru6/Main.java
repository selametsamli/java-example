package selametsamli;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args) {
	launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        StackPane root=new StackPane();


        Canvas canvas=new Canvas(300,200);
        GraphicsContext gc=canvas.getGraphicsContext2D();
        gc.strokeLine(50,50,250,50);
        gc.fillText("My text",100,100);
        gc.strokeLine(50,150,250,150);
        root.getChildren().add(canvas);

        Scene scene=new Scene(root);


        primaryStage.setScene(scene);
        primaryStage.show();



    }
}
