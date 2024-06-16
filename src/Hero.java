// Класс Hero
public class Hero {
    private int health;
    private int damage;
    private boolean superpower;

    public Hero(int health, int damage, boolean superpower) {
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }

    public Hero(int health, int damage) {
        this.health = health;
        this.damage = damage;
        this.superpower = false;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public boolean hasSuperpower() {
        return superpower;
    }
}
