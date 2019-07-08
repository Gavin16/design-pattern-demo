package singleton;

public class Test {

    public static void main(String[] args){
        Singleton4 s41 = Singleton4.getInstance();
        Singleton4 s42 = Singleton4.getInstance();

        System.out.println(s41);
        System.out.println(s42);
    }
}
