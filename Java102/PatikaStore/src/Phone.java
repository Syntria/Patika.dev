public class Phone {

    private String name;
    private PatikaStore.Brand brand;
    private String storage;
    private String screenSize;
    private String battery;
    private String RAM;
    private String color;
    private String discount;
    private int ID;
    private int price;
    private int stock;

    public Phone(String name, PatikaStore.Brand brand, String memory, String screenSize, String battery, String RAM, String color, String discount, int ID, int price, int stock) {
        this.name = name;
        this.brand = brand;
        this.storage = memory;
        this.screenSize = screenSize;
        this.battery = battery;
        this.RAM = RAM;
        this.color = color;
        this.discount = discount;
        this.ID = ID;
        this.price = price;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PatikaStore.Brand getBrand() {
        return brand;
    }

    public void setBrand(PatikaStore.Brand brand) {
        this.brand = brand;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
        this.storage = storage;
    }

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getBattery() {
        return battery;
    }

    public void setBattery(String battery) {
        this.battery = battery;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
