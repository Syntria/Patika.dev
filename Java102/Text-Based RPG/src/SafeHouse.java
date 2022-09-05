public class SafeHouse extends Location{

    public SafeHouse(String name) {

        super(name);
    }

    public void restoreHP(Player player) {

        player.setHealth(player.getMaxHealth());
    }
}
