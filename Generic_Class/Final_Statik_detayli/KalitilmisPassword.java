package selametsamli;

public class KalitilmisPassword extends Password {

    private int passwordSifresiz;

    KalitilmisPassword(int pass) {
        super(pass);
        this.passwordSifresiz=pass;
    }

   /* @Override
    public void sifreSakla() {
        System.out.println("Şifre şu şekilde  saklandı: "+this.passwordSifresiz);

    }*/
}
