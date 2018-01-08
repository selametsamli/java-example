package selametsamli;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Separator;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args) {
launch(args);    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        HBox hBox=new HBox();
        hBox.setPadding(new Insets(15,12,15,12));
        hBox.setStyle("-fx-background-color:#336699");
        ChoiceBox cb=new ChoiceBox();
        cb.setItems(FXCollections.observableArrayList(
                "New Document","Open",new Separator(),"Save","Save as"
        ));

        hBox.getChildren().addAll(cb);
        Scene scene=new Scene(hBox);
        primaryStage.setScene(scene);
        primaryStage.show();


    }

}
