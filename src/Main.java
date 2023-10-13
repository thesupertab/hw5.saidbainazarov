class Hero {
    private int health;
    private int damage;
    private String superpower;

    public Hero(int health, int damage, String superpower) {
        this.health = health;
        this.damage = damage;
        this.superpower = superpower;
    }

    public Hero(int health, int damage) {
        this(health, damage, "Kick");
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperpower() {
        return superpower;
    }
}

class Boss {
    private int health;
    private int damage;
    private String defenseType;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public String getDefenseType() {
        return defenseType;
    }

    public void setDefenseType(String defenseType) {
        this.defenseType = defenseType;
    }

    public Boss(int health, int damage, String defenseType) {
        this.health = health;
        this.damage = damage;
        this.defenseType = defenseType;
    }
}

public class Main {
    public static void main(String[] args) {
        Boss boss = new Boss(1200, 40, "Armor");
        System.out.println("Boss Information:");
        System.out.println("Health: " + boss.getHealth());
        System.out.println("Damage: " + boss.getDamage());
        System.out.println("Defense Type: " + boss.getDefenseType());

        Hero hero1 = new Hero(110, 30, "Chop");
        System.out.println("\nHero 1 Information:");
        System.out.println("Health: " + hero1.getHealth());
        System.out.println("Damage: " + hero1.getDamage());
        System.out.println("Superpower: " + hero1.getSuperpower());

        Hero hero2 = new Hero(120, 35);
        System.out.println("\nHero 2 Information:");
        System.out.println("Health: " + hero2.getHealth());
        System.out.println("Damage: " + hero2.getDamage());
        System.out.println("Superpower: " + hero2.getSuperpower());
    }
}