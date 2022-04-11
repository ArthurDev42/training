/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package threadsTask;

import java.util.ArrayList;
import java.util.List;

public class ShipGenerator {

    public static List<Ship> createShips(int count, Port port) {
        List<Ship> list = new ArrayList<>();
        for(int i = 0; i < count; i++){
            list.add(new Ship(port));
        }
        return list;
    }
}