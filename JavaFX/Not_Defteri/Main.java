package selametsamli;


import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.event.EventType;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Optional;


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



        //--------------------Menü Kısmı-------------------------------

        MenuBar menuBar=new MenuBar();
        Menu menu=new Menu("Dosya");
        menuBar.getMenus().setAll(menu);
        MenuItem menuItem1=new MenuItem("Yeni Not");
        MenuItem menuItem2=new MenuItem("Çıkış");
        SeparatorMenuItem separatorMenuItem=new SeparatorMenuItem();

        menu.getItems().addAll(menuItem1,separatorMenuItem,menuItem2);

        borderPane.setTop(menuBar);



        //---------DialogPane Kısmı---------------------
        DialogPane dialogPane=new DialogPane();

        dialogPane.setHeaderText("Yeni bir not ekle");

        GridPane gridPane=new GridPane();
        gridPane.setVgap(10);
        gridPane.setHgap(10);




        Label lNotBasligi=new Label("Not Başlığı");
        gridPane.add(lNotBasligi,0,0);

        TextField LNBtextField=new TextField();
        gridPane.add(LNBtextField,1,0);

        Label lNotDetay=new Label("Not Detay");
        gridPane.add(lNotDetay,0,1);

        TextArea LNDtextField=new TextArea();
        gridPane.add(LNDtextField,1,1);

        Label lBtsTarihi=new Label("Bitiş Tarihi");
        gridPane.add(lBtsTarihi,0,2);

        DatePicker BTStextField=new DatePicker();
        gridPane.add(BTStextField,1,2);

        dialogPane.setContent(gridPane);

        menuItem1.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                Dialog<ButtonType> dialog=new Dialog<>();
                dialog.initOwner(borderPane.getScene().getWindow());//dialog kapanınca geri dönülecek kısmı belirtiyoruz.
                dialog.getDialogPane().setContent(dialogPane);

                dialog.getDialogPane().getButtonTypes().add(ButtonType.OK);
                dialog.getDialogPane().getButtonTypes().add(ButtonType.CANCEL);

                ButtonType buttonType=new ButtonType("Yeni Button");
                dialog.getDialogPane().getButtonTypes().add(buttonType);



               // dialog.show();
                 Optional<ButtonType> sonuc=dialog.showAndWait();
                 if(sonuc.get()==ButtonType.OK){
                     NotOge yeniNot=yeniNotEkle();
                     lvNotlarListesi.getItems().setAll(NotData.getInstance().getNotListesi());
                     lvNotlarListesi.getSelectionModel().select(yeniNot);
                 }else if(sonuc.get()==ButtonType.CANCEL){
                     System.out.println("Cancel Basıldı");
                 }else if(sonuc.get()==buttonType){
                     System.out.println("Yeni Button Basıldı");
                 }
            }

            public  NotOge yeniNotEkle(){

                String notBaslik=LNBtextField.getText().trim();
                String notDetay=LNDtextField.getText().trim();
                LocalDate notBitisTarihi=BTStextField.getValue();

                NotOge yeniNot=new NotOge(notBaslik,notDetay,notBitisTarihi);

                NotData.getInstance().yeniNotEkle(yeniNot);
                    return yeniNot;
            }
        });






        NotData.getInstance();


        lvNotlarListesi.getSelectionModel().selectFirst();//Listedeki ilk elemanı çalıştır.
        lvNotlarListesi.getSelectionModel().selectedItemProperty().addListener(new ChangeListener() {
            @Override
            public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                if(newValue!= null){
                 NotOge secilenNot= (NotOge) lvNotlarListesi.getSelectionModel().getSelectedItem();
                 taNotDetay.setText(secilenNot.getNotDetay());
                 DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
                 BitisTarihi.setText(secilenNot.getBitisTarih().format(formatter));

            }
            }
        });



/*
        lvNotlarListesi.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
               NotOge secilenNot= (NotOge) lvNotlarListesi.getSelectionModel().getSelectedItem();//seçilen nesneyi
                // NotOge sınıfındaki bir tipe döndürüyoruz
                StringBuilder sb=new StringBuilder(secilenNot.getNotDetay());
                sb.append("\n\n\n\n\n");
                sb.append(secilenNot.getBitisTarih().toString());

                taNotDetay.setText(sb.toString());

            }
        });
*/



        ArrayList<NotOge> notlarListesi;
        notlarListesi=new ArrayList<>();
/*
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

        //Tek seferlik yukarıdaki elemanları dosyaya yazalım.
        NotData.getInstance().setNotListesi(notlarListesi);*/


        lvNotlarListesi.getItems().setAll(NotData.getInstance().getNotListesi());



        Scene scene=new Scene(borderPane,900,700);
        primaryStage.setScene(scene);
        primaryStage.show();

    }

    @Override
    public void stop() throws Exception {

        try {
            NotData.getInstance().notlariDosyayaYaz();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void init() throws Exception {
        NotData.getInstance().notlariDosyadanGetir();
    }




}
