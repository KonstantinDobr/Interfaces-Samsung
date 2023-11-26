public class Warrior extends Unit {
    private int armor;

    public Warrior(String name, int hp, int armor) {
        super(name, hp);
        this.armor = armor;
    }

    public int getArmor() {
        return armor;
    }

    @Override
    public void getDmg(int dmg) {
        if (armor > 0) {
            armor -= 1;
            hp -= (int) (dmg / 1.2);
        } else {
            hp -= dmg;
        }
    }

    @Override
    public void doDmg(Unit unit) {
        unit.getDmg(10);
    }

    @Override
    public String toString() {
        return super.toString() + "\nArmor : " + armor;
    }
}
