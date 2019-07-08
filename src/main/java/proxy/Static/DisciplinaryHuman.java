package proxy.Static;


public class DisciplinaryHuman implements Human {

    private Human human;

    public DisciplinaryHuman(){
        this.human = new Woman();
    }

    public void eat() {
        System.out.println("washing hands before eating");
        human.eat();
        System.out.println("clean mouth after eating");
    }

    public void work() {
        human.work();
    }

    public void sleep() {
        System.out.println("take a shower");
        human.sleep();
    }
}
