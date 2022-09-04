import java.util.Scanner;

public class ToolStore extends Location{
    Scanner inp = new Scanner(System.in);
    private int itemSelection = 1;

    public ToolStore(String name) {

        super(name);
    }

    public void menu(){
        System.out.println("1-Sword (Damage:2 Money:25)");
        System.out.println("2-Pistol (Damage:3 Money:35)");
        System.out.println("3-Rifle (Damage:7 Money:45)");
        System.out.println();
        System.out.println("4-Light Armor (Protection:1 Money:15)");
        System.out.println("5-Middle Armor (Protection:3 Money:25)");
        System.out.println("6-Heavy Armor (Protection:5 Money:40)");
        System.out.println();


    }

    public void buy(Player player) throws InterruptedException {

        System.out.println();
        System.out.println("Your current money is: " + player.getMoney());


        while (itemSelection >=0 && itemSelection <= 6) {

            System.out.println("Please select your item: (0: Exit)");
            itemSelection = inp.nextInt();

            if (itemSelection == 0) {
                System.out.println();
                System.out.println("Goodbye");
                break;
            }

            else if (itemSelection == 1) {
                if (player.getMoney() >= 25) {

                    player.inventory.setWeaponDamage(2);
                    player.inventory.setWeaponName("Sword");

                    player.setMoney(player.getMoney() - 25);

                    System.out.println("You have purchased the sword");
                    System.out.println("Your current money is: " + player.getMoney());
                } else {
                    System.out.println("Not enough money");
                }

            }

            else if (itemSelection == 2) {

                if (player.getMoney() >= 35) {

                    player.inventory.setWeaponDamage(3);
                    player.inventory.setWeaponName("Pistol");

                    player.setMoney(player.getMoney() - 35);

                    System.out.println("You have purchased the Pistol");
                    System.out.println("Your current money is: " + player.getMoney());
                } else {
                    System.out.println("Not enough money");
                }

            }

            else if (itemSelection == 3) {

                if (player.getMoney() >= 45) {

                    player.inventory.setWeaponDamage(7);
                    player.inventory.setWeaponName("Pistol");

                    player.setMoney(player.getMoney() - 45);

                    System.out.println("You have purchased the Pistol");
                    System.out.println("Your current money is: " + player.getMoney());
                } else {
                    System.out.println("Not enough money");
                }

            }

            else if (itemSelection == 4) {

                if (player.getMoney() >= 15) {

                    player.inventory.setArmorProtection(1);
                    player.inventory.setArmorName("Light Armor");

                    player.setMoney(player.getMoney() - 15);
                    System.out.println("You have purchased the Light Armor");
                    System.out.println("Your current money is: " + player.getMoney());
                } else {
                    System.out.println("Not enough money");
                }

            }

            else if (itemSelection == 5) {

                if (player.getMoney() >= 25) {

                    player.inventory.setArmorProtection(3);
                    player.inventory.setArmorName("Middle Armor");

                    player.setMoney(player.getMoney() - 25);

                    System.out.println("You have purchased the Middle Armor");
                    System.out.println("Your current money is: " + player.getMoney());
                } else {
                    System.out.println("Not enough money");
                }

            }

            else if (itemSelection == 6) {

                if (player.getMoney() >= 45) {

                    player.inventory.setArmorProtection(5);
                    player.inventory.setArmorName("Heavy Armor");

                    player.setMoney(player.getMoney() - 45);

                    System.out.println("You have purchased the Heavy Armor");
                    System.out.println("Your current money is: " + player.getMoney());
                } else {
                    System.out.println("Not enough money");
                }

            }

            else {
                System.out.println("Invalid option");
            }

            System.out.println();
            Thread.sleep(650);
            menu();


        }




    }


}
