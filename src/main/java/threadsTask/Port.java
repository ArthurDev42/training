/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject2;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Port extends Thread {
    private int numberPlacesInPort;
    AtomicInteger quantityGoodsStock = new AtomicInteger(0);
    List<Ship> listShips;

    public Port(int numberPlacesInPort, int quantityGoodsStock) {
        this.numberPlacesInPort = numberPlacesInPort;
        this.quantityGoodsStock.set(quantityGoodsStock);
    }
    
    public void setListShips(List<Ship> listShips) {
        this.listShips = listShips;
    }
    
    @Override
    public void run() {
        ExecutorService service = Executors.newFixedThreadPool(numberPlacesInPort);
        for(Ship ship : listShips) {
            service.execute(new Thread(()-> ship.run()));            
        }
        while(true) {
            try {
                Thread.sleep(5000);
                System.out.println("quantity of goods " + quantityGoodsStock.get());
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
    }   
}