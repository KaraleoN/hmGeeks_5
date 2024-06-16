// Класс Main
public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setDefenseType("Armor");

        System.out.println("Информация о боссе:");
        System.out.println("Здоровье: " + boss.getHealth());
        System.out.println("Урон: " + boss.getDamage());
        System.out.println("Тип защиты: " + boss.getDefenseType());

        Hero[] heroes = createHeroes();

        System.out.println("\nИнформация о героях:");
        for (Hero hero : heroes) {
            System.out.println("Здоровье: " + hero.getHealth() +
                    ", Урон: " + hero.getDamage() +
                    ", Суперспособность: " + (hero.hasSuperpower() ? "Есть" : "Нет"));
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 20, true);
        Hero hero2 = new Hero(80, 25);
        Hero hero3 = new Hero(120, 18, true);

        Hero[] heroes = {hero1, hero2, hero3};

        return heroes;
    }
}