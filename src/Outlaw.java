import static java.lang.Math.random;

public class Outlaw extends Unit {
    private double luck;

    public Outlaw(String name, int hp, double luck) {
        super(name, hp);
        if (luck >= 0 && luck <= 1) {
            this.luck = luck;
        } else {
            this.luck = random();
        }
    }

    public double getLuck() {
        return luck;
    }

    @Override
    public void getDmg(int dmg) {
        hp -= dmg;
    }

    @Override
    public void doDmg(Unit unit) {
        if (random() < luck) {
            unit.getDmg(25);
        } else {
            unit.getDmg(8);
        }
    }

    @Override
    public String toString() {
        return super.toString() + "\nLuck : " + luck;
    }
}
