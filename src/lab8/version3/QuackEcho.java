package lab8.version3;

public class QuackEcho implements Quackable {

    private Quackable duck;

    public QuackEcho(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        System.out.print("Echo : ");
        duck.quack();
    }

}