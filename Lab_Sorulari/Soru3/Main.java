package selametsamli;

public class Main {

    public static void main(String[] args) {
    Gen<Integer> nesne =new Gen<Integer>(5);
    nesne.showType();

    Gen nesne2=new Gen("selamet");
    nesne2.showType();
        }
}
