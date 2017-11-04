package selametsamli;

public  class Password {

    private static final int anahtarDeger=10;
    private final int sifrelenmisPassword;

    Password(int pass){
        this.sifrelenmisPassword=passwordSifrele(pass);
    }

    private int passwordSifrele(int pass) {

        return pass^anahtarDeger;
    }

    public final void sifreSakla(){

        System.out.println("Şifre şu şekilde  saklandı: "+this.sifrelenmisPassword);
    }

    public boolean girisYap(int pass ){
        if(passwordSifrele(pass)==sifrelenmisPassword){
            System.out.println("Hoşgeldiniz.");
            return true;
        }else{
            System.out.println("Hatalı parola");
            return false;
        }
    }


}
