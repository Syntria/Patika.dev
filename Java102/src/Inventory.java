public class Inventory {

    private boolean includeWater;
    private boolean includeFood;
    private boolean includeFirewood;
    private String weaponName;
    private String armorName;
    private int weaponDamage;
    private int armorProtection;

    public Inventory(boolean includeWater, boolean food, boolean firewood, String weaponName, String armorName, int weaponDamage, int armorProtection) {
        this.includeWater = includeWater;
        this.includeFood = food;
        this.includeFirewood = firewood;
        this.weaponName = weaponName;
        this.armorName = armorName;
        this.weaponDamage = weaponDamage;
        this.armorProtection = armorProtection;
    }


    public boolean isIncludeWater() {
        return includeWater;
    }

    public void setIncludeWater(boolean includeWater) {
        this.includeWater = includeWater;
    }

    public boolean isIncludeFood() {
        return includeFood;
    }

    public void setIncludeFood(boolean includeFood) {
        this.includeFood = includeFood;
    }

    public boolean isIncludeFirewood() {
        return includeFirewood;
    }

    public void setIncludeFirewood(boolean includeFirewood) {
        this.includeFirewood = includeFirewood;
    }

    public String getWeaponName() {
        return weaponName;
    }

    public void setWeaponName(String weaponName) {
        this.weaponName = weaponName;
    }

    public String getArmorName() {
        return armorName;
    }

    public void setArmorName(String armorName) {
        this.armorName = armorName;
    }

    public int getWeaponDamage() {
        return weaponDamage;
    }

    public void setWeaponDamage(int weaponDamage) {
        this.weaponDamage = weaponDamage;
    }

    public int getArmorProtection() {
        return armorProtection;
    }

    public void setArmorProtection(int armorProtection) {
        this.armorProtection = armorProtection;
    }
}
