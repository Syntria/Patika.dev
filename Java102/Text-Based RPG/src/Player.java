public class Player {

    public Inventory inventory;
    private int health;
    private int maxHealth;
    private int damage;
    private int money;
    private String character;

    public Player(Inventory inventory, int damage, int health, int maxHealth, int money, String character) {
        this.inventory = inventory;
        this.health = health;
        this.maxHealth = maxHealth;
        this.damage = damage;
        this.money = money;
        this.character = character;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMaxHealth() {
        return maxHealth;
    }

    public void setMaxHealth(int maxHealth) {
        this.maxHealth = maxHealth;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getCharacter() {
        return character;
    }

    public void setCharacter(String character) {
        this.character = character;
    }
}
