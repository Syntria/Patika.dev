public abstract class Dungeon {

    private Monster monsterType;
    private int monsterAmount;
    private String specialItem;

    public Dungeon(Monster monsterType, int monsterAmount, String specialItem) {
        this.monsterType = monsterType;
        this.monsterAmount = monsterAmount;
        this.specialItem = specialItem;
    }

    public void combat(Player player, Monster monster) throws InterruptedException {

        while (player.getHealth() > 0 && monster.getHealth() > 0) {

            System.out.println("Your HP: " + player.getHealth() + "        Enemy HP: " + monster.getHealth());
            System.out.println();
            System.out.println("You dealt " + (player.getDamage()+player.inventory.getWeaponDamage()) + " damage to monster");
            monster.setHealth(monster.getHealth() - (player.getDamage()+player.inventory.getWeaponDamage()));

            if (monster.getDamage() - player.inventory.getArmorProtection() > 0) {
                System.out.println("You receive " + (monster.getDamage() - player.inventory.getArmorProtection()) + " damage");
                player.setHealth(player.getHealth() - (monster.getDamage() - player.inventory.getArmorProtection()));

            }

            else {
                System.out.println("You receive 0 damage");
            }

            Thread.sleep(700);
            System.out.println();
        }

        if (player.getHealth() > 0) {
            System.out.println("You won the battle");
            System.out.println("Your HP: " + player.getHealth());
            System.out.println();
        }

        else {

            System.out.println("You died, thanks for playing");

        }

    }


    public Monster getMonsterType() {
        return monsterType;
    }

    public void setMonsterType(Monster monsterType) {
        this.monsterType = monsterType;
    }

    public int getMonsterAmount() {
        return monsterAmount;
    }

    public void setMonsterAmount(int monsterAmount) {
        this.monsterAmount = monsterAmount;
    }

    public String getSpecialItem() {
        return specialItem;
    }

    public void setSpecialItem(String specialItem) {
        this.specialItem = specialItem;
    }
}
