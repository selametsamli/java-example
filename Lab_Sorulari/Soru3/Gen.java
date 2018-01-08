package selametsamli;

public class Gen<T> {
    T ob;
    Gen(T a){
        ob=a;
    }

    T getOb(){
        return ob;
    }

    void showType(){
        System.out.println("Type of T is :"+ob.getClass().getName());
    }
}
