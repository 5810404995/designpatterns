package version2;

public class GooseAdapter implements Quackable {

    private Goose goose;

    public GooseAdapter(Goose goose) {
        this.goose = goose;
    }

    @Override
    public void quack() {
        this.goose.honk();
    }
}
