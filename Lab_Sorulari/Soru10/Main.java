package selametsamli;

import javafx.beans.InvalidationListener;
import javafx.beans.Observable;
import javafx.beans.property.DoubleProperty;
import javafx.beans.property.SimpleDoubleProperty;


public class Main {

    public static void main(String[] args) {

        DoubleProperty puan=new SimpleDoubleProperty(20);

        puan.addListener(new InvalidationListener() {
            @Override
            public void invalidated(Observable observable) {
                System.out.println("invalid!!");
            }
        });

        puan.set(14);
        puan.set(24);
        double a=puan.getValue();
        puan.set(53);
    }

}
