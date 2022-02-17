package classes;

import java.util.Objects;

public class Product {

    private int id;
    private String title;
    private int upc;
    private Manufacturer manufacturer;
    private int price;
    private int storagePeriod;
    private int quantity;

    public Product(int id, String title, int upc, Manufacturer manufacturer, int price, int storagePeriod, int quantity) {
        this.id = id;
        this.title = title;
        this.upc = upc;
        this.manufacturer = manufacturer;
        this.price = price;
        this.storagePeriod = storagePeriod;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public int getUpc() {
        return upc;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }

    public int getStoragePeriod() {
        return storagePeriod;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setUpc(int upc) {
        this.upc = upc;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setStoragePeriod(int storagePeriod) {
        this.storagePeriod = storagePeriod;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", upc=" + upc +
                ", manufacturer=" + manufacturer +
                ", price=" + price +
                ", storagePeriod=" + storagePeriod +
                ", quantity=" + quantity +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id && upc == product.upc && price == product.price && storagePeriod == product.storagePeriod && quantity == product.quantity && Objects.equals(title, product.title) && manufacturer == product.manufacturer;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, upc, manufacturer, price, storagePeriod, quantity);
    }
}
