package selametsamli;


import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.ListView;

import java.time.LocalDate;
import java.util.ArrayList;


public class Main extends Application{

    public static void main(String[] args) {
	launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        BorderPane borderPane =new BorderPane();

        ListView lvNotlarListesi=new ListView();
        borderPane.setLeft(lvNotlarListesi);//ListView sol kısma ekliyoruz.
        TextArea taNotDetay=new TextArea();
        Label lBitisTarihi=new Label("Bitiş Tarihi: ");
        Label BitisTarihi=new Label("   ");
        HBox hBox=new HBox(lBitisTarihi,BitisTarihi);
        VBox vBox=new VBox(taNotDetay,hBox);
        vBox.setVgrow(taNotDetay, Priority.ALWAYS);
        borderPane.setCenter(vBox);

        lvNotlarListesi.getSelectionModel().selectFirst();//Listedeki ilk elemanı çalıştır.

        lvNotlarListesi.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {

                 NotOge secilenNot= (NotOge) lvNotlarListesi.getSelectionModel().getSelectedItem();
                 taNotDetay.setText(secilenNot.getNotDetay());
                 BitisTarihi.setText(secilenNot.getBitisTarih().toString());

            }
        });



/*
        lvNotlarListesi.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
               NotOge secilenNot= (NotOge) lvNotlarListesi.getSelectionModel().getSelectedItem();//seçilen nesneyi
                // NotOge sınıfındaki bir tipe döndürüyoruz
//
//                StringBuilder sb=new StringBuilder(secilenNot.getNotDetay());
//                sb.append("\n\n\n\n\n");
//                sb.append(secilenNot.getBitisTarih().toString());
//
//                taNotDetay.setText(sb.toString());

            }
        });
*/



        ArrayList<NotOge> notlarListesi;
        notlarListesi=new ArrayList<>();

        NotOge not1=new NotOge("Hediye al","Anneler Günü için alışverişe çıkmalısın",
                LocalDate.of(2017,2,21));
        NotOge not2=new NotOge("Markete Git","Markete Gitmelisin",
                LocalDate.of(2017,3,22));
        NotOge not3=new NotOge("Spora Git","Lanet Olası şişkonun teki oldun spora gitmelisin",
                LocalDate.of(2017,4,23));
        NotOge not4=new NotOge("Araba Muayene Randevu","Muayene az kaldı randevu alman gerekiyor",
                LocalDate.of(2017,5,24));
        NotOge not5=new NotOge("Ders Çalış","Lanet Olsun dostum finaller is coming",
                LocalDate.of(2017,6,25));


        notlarListesi.add(not1);
        notlarListesi.add(not2);
        notlarListesi.add(not3);
        notlarListesi.add(not4);
        notlarListesi.add(not5);



        lvNotlarListesi.getItems().setAll(notlarListesi);



        Scene scene=new Scene(borderPane,900,700);
        primaryStage.setScene(scene);
        primaryStage.show();

    }
}
