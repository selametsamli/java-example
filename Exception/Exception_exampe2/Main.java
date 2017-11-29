package selametsamli;

public class Main {

    public static void main(String[] args) {

        try{
            Personel p1=new Personel(53);
            System.out.println("P1 yaş:"+p1.getYas());

            Personel p2=new Personel(-1);
            System.out.println("P2 yaş:"+p2.getYas());



        }catch (Exception e1){
            System.out.println(e1.getMessage());
            System.out.println(e1.toString());
        }finally {
            Personel p3=new Personel(1453);
            System.out.println("P3 yaş:"+p3.getYas());
        }
        System.out.println("Main Bitti");











        /*ISTISNA SINIFLARI
        1-ERROR SINIF
            A)VirtualMachineError:
            B)AWTError
            C)OutOfMemoryError
        2-EXCEPTION SINIFI
            A)ClassNotFoundException Sınıfı
            B)IOException Sınıfı
            C)RunTimeException Sınıfı
                1)AritmeticException Sınıfı
                2)NullPointException Sınıfı
                3)IllegalArgumentException Sınıfı

        KULLANILAN METHODLAR

            getMessage()=Istisna nesnesi içindeki mesajı döndürür.
            toString()=İstisna mesajını, istisna adını arada bir boşluk ile geri döndürür.
            printStackTress()=Oluşan istisna bilgilerini aşama aşama yazdırır
            getStackTrace()=Oluşan istisnanın bilgileri aşama aşama stacktrace tipinde bir dizi olarak döner

         */





    }
}
