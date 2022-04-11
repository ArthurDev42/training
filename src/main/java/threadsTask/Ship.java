/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadsTask;

import java.util.Random;

public class Ship implements Runnable {
    private int load;
    private int size;
    private boolean isFull;
    private boolean downloadRequired; 
    Port port;
    static Random random = new Random();
    
    public Ship(Port port) {
        this.size = getRandomSize();
        this.isFull = random.nextBoolean();
        if(isFull) {
            this.load = size;
        } else {
            this.load = 0;
        }
        if(isFull) {    // is loading of the board is required after unloading the current cargo 
            this.downloadRequired = random.nextBoolean();
        } else {
            this.downloadRequired = false;
        }
        this.port = port;
    }
    
    public int getCount() {
        return load;
    }
 
    public boolean getFlag() {
        return isFull;
    }
    
    public int getSize() {
        return size;
    }
    
    private int getRandomSize() {
        return random.nextInt(10);
    }
    
    private void boardLoading() {
        while(load < size) {
            port.quantityGoodsStock.getAndDecrement();
            load++;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("ship #"  + Thread.currentThread().hashCode() + " was loaded");
    }
    
    private void boardUnloading() {
        while(load > 0) {
            port.quantityGoodsStock.getAndIncrement();
            load--;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                ex.printStackTrace();
            }
        }
        System.out.println("ship #"  + Thread.currentThread().hashCode() + " was unloaded");
    }
    
    @Override
    public void run() {
        if(isFull) {
            boardUnloading();
            if(downloadRequired) boardLoading();
        } else {
            boardLoading();
        }
    }
}
