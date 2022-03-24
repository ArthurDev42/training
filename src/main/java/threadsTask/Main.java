/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.List;

public class Main {
//    Порт. Корабли заходят в порт для разгрузки/загрузки контейнеров. 
//    Число контейнеров, находящихся в текущий момент в порту и на корабле, 
//    должно быть неотрицательным и превышающим заданную грузоподъемность судна и вместимость порта. 
//    В порту работает несколько причалов. У одного причала может стоять один корабль. 
//    Корабль может загружаться у причала, разгружаться или выполнять оба действия.
    
    public static void main (String ... args){
        int amountOfShips = 30;
        int numberPlacesInPort = 4;
        int quantityGoodsStock = 200;
        Port port = new Port(numberPlacesInPort, quantityGoodsStock);
        List<Ship> list = ShipGenerator.createShips(amountOfShips, port);
        port.setListShips(list);
        port.start();
    }
}
