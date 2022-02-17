package classes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MarketController {

    public List<Product> getProductList() {
        List<Product> productList = Arrays.asList(
                new Product(1, "shampoo", 174002, Manufacturer.GARNIER, 110, 180, 10),
                new Product(2, "shampoo", 132011, Manufacturer.NIVEA, 90, 180, 10),
                new Product(3, "shampoo", 132008, Manufacturer.SCHWARZKOPF, 80, 180, 10),
                new Product(11, "soap", 134009, Manufacturer.GARNIER, 90, 180, 10),
                new Product(12, "soap", 174012, Manufacturer.NIVEA, 110, 180, 10),
                new Product(13, "soap", 171002, Manufacturer.SCHWARZKOPF, 80, 180, 10),
                new Product(21, "cream", 174004, Manufacturer.GARNIER, 80, 180, 10),
                new Product(22, "cream", 172014, Manufacturer.NIVEA, 90, 360, 10),
                new Product(23, "cream", 172003, Manufacturer.SCHWARZKOPF, 110, 320, 10)
        );
        return productList;
    }

    public List<Product> getListOfThisTitle(List<Product> productList, String titleOfProduct) {
        List<Product> resultProductList = new ArrayList<>();
        for (Product product:productList) {
            if(product.getTitle().equalsIgnoreCase(titleOfProduct)) {
                resultProductList.add(product);
            }
        }
        return resultProductList;
    }

    public List<Product> getNoMoreExpensive(List<Product> productList, int price) {
        List<Product> resultProductList = new ArrayList<>();
        for (Product product:productList) {
            if(product.getPrice() <= price) {
                resultProductList.add(product);
            }
        }
        return resultProductList;
    }

    public List<Product> getGoodsStoragePeriodLongerThat(List<Product> productList, int storagePeriod) {
        List<Product> resultProductList = new ArrayList<>();
        for (Product product:productList) {
            if(product.getStoragePeriod() > storagePeriod) {
                resultProductList.add(product);
            }
        }
        return resultProductList;
    }


}
