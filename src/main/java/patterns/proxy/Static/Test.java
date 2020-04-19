package patterns.proxy.Static;

public class Test {

    public static void main(String[]args){
        Human human = new DisciplinaryHuman();
        human.eat();
        human.sleep();
    }
}
