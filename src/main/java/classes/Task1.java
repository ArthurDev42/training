package classes;

import java.util.List;

public class Task1 {

    public static void main(String[] args) {
//        Product: id, Наименование, UPC, Производитель, Цена, Срок хранения, Количество.
//  Создать классы, спецификации которых приведены ниже. Определить конструкторы и методы setТип(), getТип(), toString().
//  Определить дополнительно методы в классе, создающем массив объектов. Задать критерий выбора данных и
//  вывести эти данные на консоль. В каждом классе, обладающем информацией, должно быть объявлено несколько конструкторов.
//        a) список товаров для заданного наименования;
        String searchTitle = "Soap";
//        b) список товаров для заданного наименования, цена которых не превосходит заданную;
        int searchPrice = 100;
//        c) список товаров, срок хранения которых больше заданного.
        int searchStoragePeriod = 200;

        MarketController controller = new MarketController();
        List<Product> productList = controller.getProductList();
        System.out.println("List of goods of a given name: " + controller.getListOfThisTitle(productList, searchTitle).toString());

        System.out.println("List of goods of a given name, which not more expensive than given one: " +
                controller.getNoMoreExpensive(controller.getListOfThisTitle(productList, searchTitle), searchPrice));

        System.out.println("List of goods which storage period longer than given one: " +
                controller.getGoodsStoragePeriodLongerThat(productList, searchStoragePeriod));
    }
}