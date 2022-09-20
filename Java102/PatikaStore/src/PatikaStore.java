import java.util.*;

public class PatikaStore {

    static TreeSet<Brand> brands = new TreeSet<>();
    static ArrayList<Notebook> notebooks = new ArrayList<>();
    static ArrayList<Phone> phones = new ArrayList<>();
    boolean isIDUnique;
    boolean isBrandValid;
    int IDforRemoveProduct;

    public static class Brand implements Comparable<Brand> {

        private String name;
        private int ID;

        public Brand(String name, int ID) {
            this.name = name;
            this.ID = ID;
        }

        @Override
        public int compareTo(Brand o) {
            return this.name.compareTo(o.name);
        }
    }

    static {

        Brand samsung = new Brand("Samsung",1);
        Brand lenovo = new Brand("Lenovo",2);
        Brand apple = new Brand("Apple",3);
        Brand huawei = new Brand("Huawei",4);
        Brand casper = new Brand("Casper",5);
        Brand asus = new Brand("Asus",6);
        Brand hp = new Brand("HP",7);
        Brand xiaomi = new Brand("Xiaomi",8);
        Brand monster = new Brand("Monster",9);

        notebooks.add(new Notebook("HUAWEI Matebook 14", huawei, "512 GB", "14.0 inc", "16", "%0",1,6999,12));
        notebooks.add(new Notebook("LENOVO V14 IGL", lenovo, "1024 GB", "14.0 inc", "8", "%5",2,5699,12));
        notebooks.add(new Notebook("ASUS Tuf Gaming", asus, "2048 GB", "15.6 inc", "32", "%0",3,6299,12));

        phones.add(new Phone("SAMSUNG GALAXY A51", samsung, "128 GB", "6.5", "4000", "6", "Black", "0", 1,3199,5));
        phones.add(new Phone("iPhone 11 64 GB", apple, "64 GB", "6.1", "3046", "6", "Blue", "5", 2,8999,32));
        phones.add(new Phone("Redmi Note 10 Pro 8GB ", xiaomi, "128 GB", "6.5", "4000", "12", "White", "0", 3,4999,35));

        brands.add(samsung);
        brands.add(lenovo);
        brands.add(apple);
        brands.add(huawei);
        brands.add(casper);
        brands.add(asus);
        brands.add(hp);
        brands.add(xiaomi);
        brands.add(monster);



    }

    public void menu() {
        int userSelection = -1;
        int operationSelection;
        int IDSelection;
        String brandSelection;
        Scanner inp = new Scanner(System.in);

        System.out.println("Welcome to the Patika Store");

        while (userSelection != 0) {

            operationSelection = -1;

            System.out.println("1- Notebooks");
            System.out.println("2- Phones");
            System.out.println("3- Brands");
            System.out.println("0- Exit");
            System.out.println();

            System.out.print("Your choice: ");
            userSelection = inp.nextInt();
            System.out.println();

            if (userSelection == 1) {

                while (operationSelection != 0) {

                    System.out.println("What do you want to do? (Notebook Section)");
                    System.out.println("1- Show All");
                    System.out.println("2- Show By Brand");
                    System.out.println("3- Show By ID");
                    System.out.println("4- Add New Notebook");
                    System.out.println("5- Delete Notebook");
                    System.out.println("0- Exit");
                    System.out.println();

                    System.out.print("Your choice: ");
                    operationSelection = inp.nextInt();
                    System.out.println();

                    if (operationSelection == 1) {

                        System.out.printf("%-3s %-25s %-10s %-15s %-15s %-15s %-5s %n", "ID", "Name", "Price", "Brand", "Storage", "Screen Size", "RAM");
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        for (Notebook notebook :
                                notebooks) {

                            System.out.printf("%-3s %-25s %-10s %-15s %-15s %-15s %-5s %n", notebook.getID() + "-", notebook.getName(), notebook.getPrice(), notebook.getBrand().name, notebook.getStorage(), notebook.getScreenSize(), notebook.getRAM());
                        }
                        System.out.println();
                    } else if (operationSelection == 2) {

                        System.out.println("Which brand would you like to see the products of?");
                        System.out.print("Your choice: ");
                        brandSelection = inp.next();
                        System.out.println();

                        System.out.printf("%-3s %-25s %-10s %-15s %-15s %-15s %-5s %n", "ID", "Name", "Price", "Brand", "Storage", "Screen Size", "RAM");
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        for (Notebook notebook :
                                notebooks) {

                            if (notebook.getBrand().name.compareToIgnoreCase(brandSelection) == 0)
                                System.out.printf("%-3s %-25s %-10s %-15s %-15s %-15s %-5s %n", notebook.getID() + "-", notebook.getName(), notebook.getPrice(), notebook.getBrand().name, notebook.getStorage(), notebook.getScreenSize(), notebook.getRAM());
                        }
                        System.out.println();

                    } else if (operationSelection == 3) {

                        System.out.println("Please write unique ID of your product: ");
                        IDSelection = inp.nextInt();
                        System.out.println();

                        System.out.printf("%-3s %-25s %-10s %-15s %-15s %-15s %-5s %n", "ID", "Name", "Price", "Brand", "Storage", "Screen Size", "RAM");
                        System.out.println("------------------------------------------------------------------------------------------------------");

                        for (Notebook notebook :
                                notebooks) {

                            if (notebook.getID() == IDSelection)
                                System.out.printf("%-3s %-25s %-10s %-15s %-15s %-15s %-5s %n", notebook.getID() + "-", notebook.getName(), notebook.getPrice(), notebook.getBrand().name, notebook.getStorage(), notebook.getScreenSize(), notebook.getRAM());
                        }
                        System.out.println();
                    } else if (operationSelection == 4) {

                        Notebook userNotebook = new Notebook("", null, "", "", "", "", -1, -1, -1);
                        String userBrand;
                        isIDUnique = false;
                        System.out.println("Please enter properties of your product:");

                        while (!isIDUnique) {

                            System.out.print("ID: ");
                            userNotebook.setID(inp.nextInt());
                            isIDUnique = true;

                            for (Notebook notebook :
                                    notebooks) {

                                if (notebook.getID() == userNotebook.getID()) {

                                    isIDUnique = false;
                                    System.out.println("Please enter a unique ID");
                                }

                            }
                        }

                        System.out.print("Name: ");
                        userNotebook.setName(inp.next());


                        isBrandValid = false;

                        while (!isBrandValid) {

                            System.out.print("Brand: ");
                            userBrand = inp.next();
                            for (Brand brand :
                                    brands) {

                                if (brand.name.compareToIgnoreCase(userBrand) == 0) {

                                    userNotebook.setBrand(brand);
                                    isBrandValid = true;
                                }

                            }

                            if (!isBrandValid) {

                                System.out.println();
                                System.out.println("Please enter a valid brand. You can see brands by using main menu");
                            }
                        }

                        System.out.print("Storage: ");
                        userNotebook.setStorage(inp.next());

                        System.out.print("Screen Size: ");
                        userNotebook.setScreenSize(inp.next());

                        System.out.print("RAM: ");
                        userNotebook.setRAM(inp.next());

                        System.out.print("Discount rate: ");
                        userNotebook.setDiscount(inp.next());

                        System.out.print("Price: ");
                        userNotebook.setPrice(inp.nextInt());

                        System.out.print("Stock: ");
                        userNotebook.setStock(inp.nextInt());

                        notebooks.add(userNotebook);

                        System.out.println();
                        System.out.println("New Notebook has been added");
                        System.out.println();


                    } else if (operationSelection == 5) {

                        System.out.print("Please enter ID of the product: ");
                        IDforRemoveProduct = inp.nextInt();
                        System.out.println();

                        notebooks.removeIf(notebook -> notebook.getID() == IDforRemoveProduct);

                    } else if (operationSelection == 0) {

                        break;
                    }

                    else {
                        System.out.println("Please enter a valid choice");
                        System.out.println();
                    }
                }
            }

            else if (userSelection == 2) {

                while (operationSelection != 0) {

                    System.out.println("What do you want to do? (Phone Section)");
                    System.out.println("1- Show All");
                    System.out.println("2- Show By Brand");
                    System.out.println("3- Show By ID");
                    System.out.println("4- Add New Phone");
                    System.out.println("5- Delete Phone");
                    System.out.println("0- Exit");
                    System.out.println();

                    System.out.print("Your choice: ");
                    operationSelection = inp.nextInt();
                    System.out.println();

                    if (operationSelection == 1) {

                        System.out.printf("%-3s %-25s %-10s %-15s %-15s %-15s %-5s %n", "ID", "Name", "Price", "Brand", "Storage", "Screen Size", "RAM");
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        for (Phone phone :
                                phones) {

                            System.out.printf("%-3s %-25s %-10s %-15s %-15s %-15s %-5s %n", phone.getID() + "-", phone.getName(), phone.getPrice(), phone.getBrand().name, phone.getStorage(), phone.getScreenSize(), phone.getRAM());
                        }
                        System.out.println();
                    } else if (operationSelection == 2) {

                        System.out.println("Which brand would you like to see the products of?");
                        System.out.print("Your choice: ");
                        brandSelection = inp.next();
                        System.out.println();

                        System.out.printf("%-3s %-25s %-10s %-15s %-15s %-15s %-5s %n", "ID", "Name", "Price", "Brand", "Storage", "Screen Size", "RAM");
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        for (Phone phone :
                                phones) {

                            if (phone.getBrand().name.compareToIgnoreCase(brandSelection) == 0)
                                System.out.printf("%-3s %-25s %-10s %-15s %-15s %-15s %-5s %n", phone.getID() + "-", phone.getName(), phone.getPrice(), phone.getBrand().name, phone.getStorage(), phone.getScreenSize(), phone.getRAM());
                        }
                        System.out.println();

                    } else if (operationSelection == 3) {

                        System.out.println("Please write unique ID of your product: ");
                        IDSelection = inp.nextInt();
                        System.out.println();

                        System.out.printf("%-3s %-25s %-10s %-15s %-15s %-15s %-5s %n", "ID", "Name", "Price", "Brand", "Storage", "Screen Size", "RAM");
                        System.out.println("------------------------------------------------------------------------------------------------------");
                        for (Phone phone :
                                phones) {

                            if (phone.getID() == IDSelection)
                                System.out.printf("%-3s %-25s %-10s %-15s %-15s %-15s %-5s %n", phone.getID() + "-", phone.getName(), phone.getPrice(), phone.getBrand().name, phone.getStorage(), phone.getScreenSize(), phone.getRAM());
                        }
                        System.out.println();
                    } else if (operationSelection == 4) {

                        Phone userPhone = new Phone("", null, "", "", "", "", "", "", -1, -1,-1);
                        String userBrand;
                        isIDUnique = false;
                        System.out.println("Please enter properties of your product:");

                        while (!isIDUnique) {

                            System.out.print("ID: ");
                            userPhone.setID(inp.nextInt());
                            isIDUnique = true;

                            for (Phone phone :
                                    phones) {

                                if (phone.getID() == userPhone.getID()) {

                                    isIDUnique = false;
                                    System.out.println("Please enter a unique ID");
                                }

                            }
                        }

                        System.out.print("Name: ");
                        userPhone.setName(inp.next());


                        isBrandValid = false;

                        while (!isBrandValid) {

                            System.out.print("Brand: ");
                            userBrand = inp.next();
                            for (Brand brand :
                                    brands) {

                                if (brand.name.compareToIgnoreCase(userBrand) == 0) {

                                    userPhone.setBrand(brand);
                                    isBrandValid = true;
                                }

                            }

                            if (!isBrandValid) {

                                System.out.println();
                                System.out.println("Please enter a valid brand. You can see brands by using main menu");
                            }
                        }

                        System.out.print("Storage: ");
                        userPhone.setStorage(inp.next());

                        System.out.print("Battery: ");
                        userPhone.setBattery(inp.next());

                        System.out.print("Screen Size: ");
                        userPhone.setScreenSize(inp.next());

                        System.out.print("RAM: ");
                        userPhone.setRAM(inp.next());

                        System.out.print("Discount rate: ");
                        userPhone.setDiscount(inp.next());

                        System.out.print("Price: ");
                        userPhone.setPrice(inp.nextInt());

                        System.out.print("Stock: ");
                        userPhone.setStock(inp.nextInt());

                        System.out.print("Color: ");
                        userPhone.setColor(inp.next());

                        phones.add(userPhone);

                        System.out.println();
                        System.out.println("New Phone has been added");
                        System.out.println();


                    } else if (operationSelection == 5) {

                        System.out.print("Please enter ID of the product: ");
                        IDforRemoveProduct = inp.nextInt();
                        System.out.println();

                        phones.removeIf(phone -> phone.getID() == IDforRemoveProduct);

                    } else if (operationSelection == 0) {

                        break;
                    }

                    else {
                        System.out.println("Please enter a valid choice");
                        System.out.println();
                    }
                }

            }

            else if (userSelection == 3) {

                for (Brand brand : brands) {
                    System.out.println("- " + brand.name);
                }

                System.out.println();

            }

            else if (userSelection == 0)
                System.out.println("Goodbye");


            else {

                System.out.println("Please enter a valid choice");
                System.out.println();
            }

        }


    }






}
