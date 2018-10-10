package version2;

public class DuckSimulator {

    public static void main(String[] args) {
        DuckSimulator simulator = new DuckSimulator();
        simulator.simulate();
    }

    void simulate() {
        Quackable mallardDuck1 = new QuackCounter(new QuackEcho(new MallardDuck()));
        Quackable redheadDuck1 = new QuackCounter(new QuackEcho(new RedheadDuck()));
        Quackable duckCall1 = new QuackCounter(new QuackEcho(new DuckCall()));
        Quackable rubberDuck1 = new QuackCounter(new QuackEcho(new RubberDuck()));
        Quackable gooseDuck1 = new GooseAdapter(new Goose());
        Quackable pigeonDuck1 = new PigeonAdapter(new Pigeon());

        Quackable mallardDuck2 = new QuackEcho(new QuackCounter(new MallardDuck()));
        Quackable redheadDuck2 = new QuackEcho(new QuackCounter(new RedheadDuck()));
        Quackable duckCall2 = new QuackEcho(new QuackCounter(new DuckCall()));
        Quackable rubberDuck2 = new QuackEcho(new QuackCounter(new RubberDuck()));
        Quackable gooseDuck2 = new GooseAdapter(new Goose());
        Quackable pigeonDuck2 = new PigeonAdapter(new Pigeon());

        System.out.println("---แบบที่1 : new QuackCounter(new QuackEcho(new MallardDuck())---");
        simulate(mallardDuck1);
        simulate(redheadDuck1);
        simulate(duckCall1);
        simulate(rubberDuck1);
        simulate(gooseDuck1);
        simulate(pigeonDuck1);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times.");
        QuackCounter.setNumberOfQuacks(0); //รีเซ็ตจำนวน Quack เพื่อเริ่มแบบที่ 2

        System.out.println("\n---แบบที่2 : new QuackEcho(new QuackCounter(new MallardDuck())---");
        simulate(mallardDuck2);
        simulate(redheadDuck2);
        simulate(duckCall2);
        simulate(rubberDuck2);
        simulate(gooseDuck2);
        simulate(pigeonDuck2);

        System.out.println("The ducks quacked " + QuackCounter.getQuacks() + " times.");
    }

    void simulate(Quackable duck) {
        duck.quack();
    }
}
