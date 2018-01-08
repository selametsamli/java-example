package selametsamli;

public class Deneme implements Multiply {
    @Override
    public int multiplyTwo(int n1, int n2) {
        return n1*n2;
    }

    @Override
    public int multiplyThree(int n1, int n2, int n3) {
        return n1*n2*n3;
    }
}
