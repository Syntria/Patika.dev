import java.util.Random;
import java.util.Scanner;

public class Game {

    Scanner inp = new Scanner(System.in);
    Random rnd = new Random();
    Player player;
    Inventory inventory = new Inventory(false,false, false, "none","none",0,0);
    SafeHouse safeHouse = new SafeHouse("Safe House");
    ToolStore toolStore = new ToolStore("Tool Store");
    Forest forest;
    Cave cave;
    River river;
    Zombie zombie;
    Vampire vampire;
    Bear bear;


    private int characterSelection;
    private int travelSelection;
    private int actionSelection;
    private int monsterAmount;
    private String location;
    private boolean isGameEnded = false;



    public Game() {

    }

    public void gameRun() throws InterruptedException {

        System.out.println("Welcome to the most epic world");
        System.out.println();
        System.out.println("Please Select Your Character");
        System.out.println("1-Samurai (Damage:5 Health:21 Money:15)");
        System.out.println("2-Archer (Damage:7 Health:18 Money:20)");
        System.out.println("3-Knight (Damage:8 Health:25 Money:5)");

        characterSelection = inp.nextInt();

        switch (characterSelection) {
            case 1 -> player = new Player(inventory, 5, 21, 21, 15, "Samurai");
            case 2 -> player = new Player(inventory, 7,18, 18, 20, "Archer");
            case 3 -> player = new Player(inventory, 8,25, 25, 5, "Knight");
            default -> System.out.println("Error");
        }

        while (!isGameEnded) {

            System.out.println("Where do you want to go?");
            System.out.println("1-SafeHouse");
            System.out.println("2-ToolStore");
            System.out.println("3-Forest");
            System.out.println("4-Cave");
            System.out.println("5-River");

            travelSelection = inp.nextInt();
            System.out.println();

            if (travelSelection == 1) {

                Thread.sleep(500);
                System.out.println("You traveled to Safe House");
                safeHouse.restoreHP(player);
                System.out.println("Your HP is fulled " + "(HP: " + player.getHealth() + ")");
                System.out.println();

            }

            else if (travelSelection == 2) {

                Thread.sleep(500);
                System.out.println("You traveled to ToolStore");

                toolStore.menu();
                toolStore.buy(player);
                System.out.println();


            }

            else if (travelSelection == 3) {

                Thread.sleep(500);
                System.out.println("You traveled to Forest");

                monsterAmount = rnd.nextInt(2) + 1;

                Forest forest = new Forest(zombie, monsterAmount ,"firewood");

                while (monsterAmount > 0) {

                    zombie = new Zombie("Zombie", 10, 3,4);
                    System.out.println("There is a zombie ahead of you. What do you want to do?");
                    System.out.println("1-Combat");
                    System.out.println("2-Run");
                    System.out.println();
                    actionSelection = inp.nextInt();

                    if (actionSelection == 1) {

                        forest.combat(player, zombie);

                        if (player.getHealth() > 0) {

                            monsterAmount--;

                            System.out.println("You found " + zombie.getMoney() + " money");
                            player.setMoney(player.getMoney() + zombie.getMoney());
                            System.out.println("Your total money is: " + player.getMoney());
                            System.out.println();
                        }

                        else {

                            isGameEnded = true;
                            break;
                        }

                        if (monsterAmount == 0) {

                            System.out.println("You cleared the Dungeon");
                            System.out.println("You found " + forest.getSpecialItem());
                            player.inventory.setIncludeFirewood(true);
                            System.out.println();
                        }

                    }

                    else if(actionSelection == 2) {

                        break;
                    }

                    else {

                        System.out.println("Please choose a valid option");
                        System.out.println();
                    }



                }

            }

            else if (travelSelection == 4) {

                Thread.sleep(500);
                System.out.println("You traveled to Cave");

                monsterAmount = rnd.nextInt(3) + 1;

                Cave cave = new Cave(vampire, monsterAmount ,"food");

                while (monsterAmount > 0) {

                    vampire = new Vampire("Vampire", 14, 4,7);
                    System.out.println("There is a vampire ahead of you. What do you want to do?");
                    System.out.println("1-Combat");
                    System.out.println("2-Run");
                    System.out.println();
                    actionSelection = inp.nextInt();

                    if (actionSelection == 1) {

                        cave.combat(player, vampire);

                        if (player.getHealth() > 0) {

                            monsterAmount--;

                            System.out.println("You found " + vampire.getMoney() + " money");
                            player.setMoney(player.getMoney() + vampire.getMoney());
                            System.out.println("Your total money is: " + player.getMoney());
                            System.out.println();
                        }

                        else {

                            isGameEnded = true;
                            break;
                        }

                        if (monsterAmount == 0) {

                            System.out.println("You cleared the Dungeon");
                            System.out.println("You found " + cave.getSpecialItem());
                            player.inventory.setIncludeFood(true);
                            System.out.println();
                        }

                    }

                    else if(actionSelection == 2) {

                        break;
                    }

                    else {

                        System.out.println("Please choose a valid option");
                        System.out.println();
                    }



                }
            }

            else if (travelSelection == 5) {

                Thread.sleep(500);
                System.out.println("You traveled to River");

                monsterAmount = rnd.nextInt(2) + 1;

                River river = new River(bear, monsterAmount ,"firewood");

                while (monsterAmount > 0) {

                    bear = new Bear("Bear", 20, 7,12);
                    System.out.println("There is a bear ahead of you. What do you want to do?");
                    System.out.println("1-Combat");
                    System.out.println("2-Run");
                    System.out.println();
                    actionSelection = inp.nextInt();

                    if (actionSelection == 1) {

                        river.combat(player, bear);

                        if (player.getHealth() > 0) {

                            monsterAmount--;

                            System.out.println("You found " + bear.getMoney() + " money");
                            player.setMoney(player.getMoney() + bear.getMoney());
                            System.out.println("Your total money is: " + player.getMoney());
                            System.out.println();
                        }

                        else {

                            isGameEnded = true;
                            break;
                        }

                        if (monsterAmount == 0) {

                            System.out.println("You cleared the Dungeon");
                            System.out.println("You found " + river.getSpecialItem());
                            player.inventory.setIncludeWater(true);
                            System.out.println();
                        }

                    }

                    else if(actionSelection == 2) {

                        break;
                    }

                    else {

                        System.out.println("Please choose a valid option");
                        System.out.println();
                    }



                }
            }




            if (inventory.isIncludeFirewood() && inventory.isIncludeFood() && inventory.isIncludeWater()) {

                isGameEnded = true;
                System.out.println("Congratulations, you beat the game!");
            }
        }
    }
}
