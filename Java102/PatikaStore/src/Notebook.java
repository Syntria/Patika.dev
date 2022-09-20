public class Notebook {

    private String name;
    private PatikaStore.Brand brand;
    private String storage;
    private String screenSize;
    private String RAM;
    private String discount;
    private int ID;
    private int price;
    private int stock;

    public Notebook(String name, PatikaStore.Brand brand, String storage, String screenSize, String RAM, String discount, int ID, int price, int stock) {
        this.name = name;
        this.brand = brand;
        this.storage = storage;
        this.screenSize = screenSize;
        this.RAM = RAM;
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

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
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
