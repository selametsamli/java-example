package selametsamli;

import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Toggle;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
	launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {

        FlowPane flowPane=new FlowPane();

        RadioButton oddBtn=new RadioButton("odd");
        RadioButton evenBtn=new RadioButton("even");
        RadioButton erkek=new RadioButton("Erkek");
        RadioButton kadin=new RadioButton("Kadın");

        Label label =new Label();

        ToggleGroup group1=new ToggleGroup();
        ToggleGroup group2=new ToggleGroup();

        oddBtn.setToggleGroup(group1);
        evenBtn.setToggleGroup(group1);

        erkek.setToggleGroup(group2);
        kadin.setToggleGroup(group2);

        group1.selectToggle(oddBtn);
        group2.selectToggle(erkek);

        ChangeListener<Toggle> chng=new ChangeListener<Toggle>() {
            @Override
            public void changed(ObservableValue<? extends Toggle> observable, Toggle oldValue, Toggle newValue) {
                label.setText("Selected button is " + ((RadioButton)
                        group1.getSelectedToggle()).getText() + "ve"+
                        ((RadioButton) group2.getSelectedToggle()).getText());
            } };

        group1.selectedToggleProperty().addListener(chng);
        group2.selectedToggleProperty().addListener(chng);
        VBox root = new VBox();
        root.getChildren().addAll(oddBtn, evenBtn);
        root.getChildren().addAll(erkek, kadin, label);
        Scene sc = new Scene(root);
        primaryStage.setScene(sc);
        primaryStage.show();


    }
}
