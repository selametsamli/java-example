package selametsamli;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;


public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Merhaba");
        GridPane gridPane=new GridPane();

        Button btnMerhaba=new Button("Merhaba");
        Button btnHoscakal=new Button("Hoşçakal");
        Button button3=new Button("TextField Yazdir");

        TextField textField=new TextField();
        textField.setPromptText("Adınızı Girin");

        CheckBox checkBox=new CheckBox("Tıkladıktan Sonra Temizle");

        
        btnMerhaba.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                butonMerhaba();
            }
        });

        btnHoscakal.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                butonHoscakal();
            }
        });
        button3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String girilen=textField.getText();
                System.out.println(girilen);

                if(checkBox.isSelected()){
                    textField.clear();
                }
            }
        });

        checkBox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                checkBoxDegisti(checkBox);
            }
        });



        gridPane.add(btnHoscakal,2,1);
        gridPane.add(btnMerhaba,0,1);
        gridPane.add(textField,0,3);
        gridPane.add(button3,2,3);
        gridPane.add(checkBox,0,4);



        Scene scene=new Scene(gridPane,400,300);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public void butonMerhaba(){
        System.out.println("Merhaba ");
    }
    public void butonHoscakal(){
        System.out.println("Hoşçakal");
    }

    public void checkBoxDegisti(CheckBox checkBox){
        System.out.println("Checkbox "+ (checkBox.isSelected()? "Seçildi":"Seçilmedi"));


    }
}
