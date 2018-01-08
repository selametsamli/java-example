pimport javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;



public class Main extends Application {


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Scene Example");
        FlowPane flowPane=new FlowPane();

        Label label=new Label("my label");

        flowPane.getChildren().setAll(label);

        Scene scene=new Scene(flowPane,400,300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


}
