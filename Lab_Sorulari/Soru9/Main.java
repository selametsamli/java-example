package selametsamli;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application{

    public static void main(String[] args) {
	// write your code here
    }

    @Override
    public void start(Stage primaryStage) throws Exception {


        GridPane gridPane=new GridPane();
        gridPane.setPadding(new Insets(10,10,10,10));
        gridPane.setVgap(5);
        gridPane.setHgap(5);
        TextField comment=new TextField();
        comment.setPromptText("enter your comment");

    }
}
