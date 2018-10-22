package lab8.version4;

import java.util.ArrayList;

public class Flock implements Quackable {

    private ArrayList<Quackable> quackers = new ArrayList();

    public void add(Quackable quacker) {
        quackers.add(quacker);
    }

    public void quack() {
        for (int i = 0; i < quackers.size(); i++) {
            if (i == 0) {
                quackers.get(i).quack();
                quackers.get(i).quack();
            }
            quackers.get(i).quack();
        }
    }
}
